package Jump;

import Arithmetic.Instruction;
import Pile.Memoire;

public class JMP implements Instruction{
	private String adresse;

	public JMP(String adr){
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
		//Aller chercher l'adr String adr
		Memoire.setIndexOctet(Memoire.getTabAddrInd().get(""+Integer.parseInt(adresse.substring(2),16)));
		System.out.println("++++Evaluation complete+++++");
	}

}
