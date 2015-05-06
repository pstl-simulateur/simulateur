package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

public class PUSH implements Instruction{
 	private String reg1;
 	
 	public PUSH(String reg1){
 		this.reg1 = reg1;
 	}

	public String getReg1() {
		return reg1;
	}

	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}
	
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		Memoire.getPile().add(Memoire.take(Build.parserOpe(reg1)));	
		System.out.println("++++Evaluation Push complete+++++");
	}

}
