package BitEtOther;

import Arithmetic.Instruction;
import Pile.Memoire;

public class NOP implements Instruction{

	public 	NOP(){
	}

	
	//Une méthode évaluation qui va se charger de faire l'opérarion.
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet()+1);

		System.out.println("++++Evaluation complete  +++++");
	}
}
