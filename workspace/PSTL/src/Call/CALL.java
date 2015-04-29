package Call;

import Arithmetic.Instruction;
import Pile.Memoire;

public class CALL implements Instruction {
	private String adresse;

	public 	CALL(String adr){
		this.adresse = adr;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	//Une méthode évaluation qui va se charger de faire l'opérarion.
	public void eval(){
		Memoire.getPile().add(Memoire.getIndexOctet()+1);
		Memoire.setIndexOctet(Memoire.getTabAddrInd().get(""+Integer.parseInt(adresse.substring(2),16)));
		
		System.out.println("++++Evaluation complete+++++");
	}

}
