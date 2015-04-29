package Bit_Wise;

import Arithmetic.Instruction;
import Pile.Memoire;

public class CLI implements Instruction{

	public 	CLI(){
	}

	
	//Une méthode évaluation qui va se charger de faire l'opérarion.
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet()+1);
		Memoire.setEtat(7, 0);
		
		System.out.println("++++Evaluation complete+++++");
	}
}
