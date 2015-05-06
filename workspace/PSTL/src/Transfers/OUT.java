package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

/* Stores data from register Rr in the register file to I/O Space (Ports, Timers, Configuration registers etc.). */
public class OUT implements Instruction{
private String reg , indice;
 	
 	public OUT(String imme , String reg1 ){
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
		Memoire.setValueInOut(ind, Memoire.take(registre));
		System.out.println("+++++Evaluation complete++++++");
	}

}
