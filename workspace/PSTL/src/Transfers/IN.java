package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

public class IN implements Instruction{
 	private String reg , indice;
 	
 	public IN(String reg1 , String imme){
 		this.reg = reg1;
 		this.indice = imme;
 	}

	public String getReg1() {
		return reg;
	}

	public void setReg1(String reg1) {
		this.reg = reg1;
	}

	public String getImme() {
		return indice;
	}

	public void setImme(String imme) {
		this.indice = imme;
	}
	
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int registre = Build.parserOpe(reg);
		int ind = Integer.parseInt(indice.substring(2), 16);
		Memoire.put(registre, Memoire.getValueInOut(ind));
		
		System.out.println("+++++Evaluation complete++++++");
	}
}
