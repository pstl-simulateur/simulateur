package Jump;

import Arithmetic.Instruction;
import Pile.Memoire;

public class RJMP implements Instruction{

		private String valeur;

		public RJMP(String v){
			this.valeur = v;
		}

		public String getValeur() {
			return valeur;
		}

		public void setValeur(String v) {
			this.valeur = v;
		}
		
/*		
		public  void StockAdresse(Object adr){
			Memoire.addAdre(adr);
			
		}
*/
			//Une méthode évaluation qui va se charger de faire l'opérarion.
		
		public void eval(){
			Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
			int cpt = 0;
			int valeur1 = Integer.parseInt(valeur.substring(1));
			//System.out.println("Valeur = " + valeur);
			//System.out.println(Memoire.getIndexOctet());
			//Memoire.afficheOctets();
			if(valeur1 > 0){
				for(int i = Memoire.getIndexOctet() ; i < Memoire.getOctets().length; i++){
					cpt = cpt + Memoire.getOctets()[i];
					System.out.println("cpt==="+cpt);
					if (cpt > valeur1){
						System.out.println("J'y suis rentré");
						Memoire.setIndexOctet(i);
						break;
					}
				}
			}
			
			if(valeur1 < 0){
				for(int i = Memoire.getIndexOctet() - 2; i > 0; i--){
					cpt = cpt + Memoire.getOctets()[i];
					//System.out.println("cpt==="+cpt);
					if (cpt > -valeur1){
						System.out.println("J'y suis rentré");
						Memoire.setIndexOctet(i);
						break;
					}
				}
			}
			System.out.println("++++Evaluation complete+++++");
		}

}
