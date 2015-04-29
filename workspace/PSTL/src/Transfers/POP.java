package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

public class POP implements Instruction{
 	private String reg1;
 	
 	public POP(String reg1){
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
		if(Memoire.getPile().size()>0){
			
			Memoire.put(Build.parserOpe(reg1), Memoire.getPile().get(Memoire.getPile().size()-1));
			Memoire.getPile().remove(Memoire.getPile().size()-1);
		}
		else{
			System.err.println("Erreur : La pile est vide");
		}
		
		System.out.println("++++Evaluation Pop complete+++++");
	}
}
