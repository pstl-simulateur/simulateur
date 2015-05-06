package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

public class LDI implements Instruction{
private String reg , hexa;
 	
 	public LDI(String reg1 , String hexa){
 		this.reg = reg1;
 		this.hexa = hexa;
 	}

	public String getReg1() {
		return reg;
	}

	public void setReg1(String reg1) {
		this.reg = reg1;
	}

	public String getImme() {
		return hexa;
	}

	public void setImme(String imme) {
		this.hexa = imme;
	}
	
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int registre = Build.parserOpe(reg);
		int value = Integer.parseInt(hexa.substring(2), 16);
		Memoire.put(registre, value%255);
		
		System.out.println("+++++Evaluation complete++++++");
	}
	
}
