package Arithmetic;

import Parse.Build;
import Pile.Memoire;

/* Ajoute l'immediat à la valeur du régistre*/
public class ADIW implements Instruction{
 	private String reg1 , imme;
 	
 	public ADIW(String reg1 , String imme){
 		this.reg1 = reg1;
 		this.imme = imme;
 	}

	public String getReg1() {
		return reg1;
	}

	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}

	public String getImme() {
		return imme;
	}

	public void setImme(String imme) {
		this.imme = imme;
	}
 	
	
/*	public  void StockAdresse(Object adr){
		Memoire.addAdre(adr);
		
	}*/
	
	public void fillEtat(int result){
		if(result > 255)
			Memoire.setEtat(0, 1);
		else
			Memoire.setEtat(0, 0);

		if(result == 0)
			Memoire.setEtat(1, 1);
		else
			Memoire.setEtat(1, 0);
		if(result < 0)
			Memoire.setEtat(2, 1);
		else
			Memoire.setEtat(2, 0);
		if((result > 127) || (result < -128)){
			Memoire.setEtat(3, 1);
		}
		else
			Memoire.setEtat(3, 0);
		if(result >= 0)
			Memoire.setEtat(4, 0);
		else
			Memoire.setEtat(4, 1);
	}
	
	//Une méthode évaluation qui va se charger de faire l'opérarion.
	@Override
	public void eval() {
		// TODO Auto-generated method stub
		//Convertirn la valeur en int
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int valeur = Integer.parseInt(imme.substring(2), 16);
		int ind1 = Build.parserOpe(getReg1());
		int result = valeur + Memoire.take(ind1);
		fillEtat(result);
		Memoire.put(ind1, result%255);
		System.out.println("+++++Evaluation complete++++++");
		
	}

}