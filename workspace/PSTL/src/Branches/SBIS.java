package Branches;

import Arithmetic.Instruction;
import Pile.Memoire;


public class SBIS implements Instruction{
	private String inOut , rang;

	public SBIS(String reg1 , String reg2){
		this.inOut = reg1;
		this.rang = reg2;
	}

	public String getReg1() {
		return inOut;
	}

	public void setReg1(String reg1) {
		this.inOut = reg1;
	}

	public String getReg2() {
		return rang;
	}

	public void setReg2(String reg2) {
		this.rang = reg2;
	}

		public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Integer.parseInt(inOut.substring(2), 16);
		int valInOut = Memoire.getInOut()[ind1];
		int val2 = Integer.parseInt(rang);
		String valBinary = Integer.toBinaryString(valInOut);
		System.out.println("Binaire = " + valBinary);
		System.out.println("caractere = " + valBinary.charAt(valBinary.length()-val2-1));
		
		if(valBinary.charAt(valBinary.length()-val2-1) == '1'){
			//Saute l'instruction suivante
			Memoire.setIndexOctet(Memoire.getIndexOctet()+1);
		}
		System.out.println("+++++Evaluation complete++++++");
		
	}


}