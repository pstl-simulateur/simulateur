package Branches;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

/*This instruction performs a compare between two registers Rd and Rr, and skips the next instruction if Rd = Rr.*/

public class CPSE implements Instruction{
	private String reg1 , reg2;

	public CPSE(String reg1 , String reg2){
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

	/*
	public void StockAdresse(Object adr) {
		// TODO Auto-generated method stub
		Memoire.addAdre(adr);
	}*/
	
		public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int ind2 = Build.parserOpe(reg2);
		int val1 = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int val2 = Memoire.take(ind2);
		Boolean result = (val1 == val2);
		if(result){
			//Saute l'instruction suivante
			Memoire.setIndexOctet(Memoire.getIndexOctet()+1);
		}
		
		System.out.println("+++++Evaluation complete++++++");
		
	}


}