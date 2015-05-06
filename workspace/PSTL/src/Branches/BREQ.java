package Branches;

import Arithmetic.Instruction;
import Pile.Memoire;

public class BREQ implements Instruction{
	private String rang;

	public BREQ(String rang){
		this.rang = rang;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}
	
		public void eval(){

		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int value = Integer.parseInt(rang.substring(1));
		int cpt = 0;

		if(Memoire.getEtat()[1] == 1){
			
			if(value > 0){
				for(int i = Memoire.getIndexOctet() ; i < Memoire.getOctets().length; i++){
					cpt = cpt + Memoire.getOctets()[i];
					if (cpt > value){
						Memoire.setIndexOctet(i);
						break;
					}
				}
			}
			
			if(value < 0){
				for(int i = Memoire.getIndexOctet() - 2; i > 0; i--){
					cpt = cpt + Memoire.getOctets()[i];
					//System.out.println("cpt==="+cpt);
					if (cpt > -value){
						Memoire.setIndexOctet(i);
						break;
					}
				}
			}
		}
		System.out.println("+++++Evaluation complete++++++");
	}
}
