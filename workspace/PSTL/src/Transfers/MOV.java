package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

/* This instruction makes a copy of one register into another. The source register Rr is left unchanged, 
 * while the destination register Rd is loaded with a copy of Rr.*/


public class MOV implements Instruction {
 	private String reg1 , reg2;
 	
 	public MOV(String reg1 , String reg2){
 		this.reg1 = reg1;
 		this.reg2 = reg2;
 	}

	public String getReg1() {
		return reg1;
	}

	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}

	public String getReg2() {
		return reg2;
	}

	public void setReg2(String reg2) {
		this.reg2 = reg2;
	}
	
	public void eval() {
		// TODO Auto-generated method stub
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		Memoire.put(Build.parserOpe(reg1), Memoire.getRegistre()[Build.parserOpe(reg2)]);
		System.out.println("+++++Evaluation complete++++++");
	}
	
}
