package Call;

import Arithmetic.Instruction;
import Pile.Memoire;

public class RETI implements Instruction{

	public 	RETI(){
	}

	
	//Une méthode évaluation qui va se charger de faire l'opérarion.
	public void eval(){
		if(Memoire.getPile().size()>0){
			Memoire.setIndexOctet(Memoire.getPile().get(Memoire.getPile().size()-1));
			Memoire.getPile().remove(Memoire.getPile().size()-1);
		}
		else{
			Memoire.setIndexOctet(Memoire.getIndexOctet()+1);
		}
		Memoire.setEtat(7, 1);
		
		System.out.println("++++Evaluation complete+++++");
	}
}
