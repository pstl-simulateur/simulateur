package Arithmetic;

import Parse.Build;
import Pile.Memoire;


/*Compare reg1 avec imme*/
public class CPI implements Instruction{
 	private String reg1 , imme;
 	
 	public CPI(String reg1 , String imme){
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

	public void fillEtat(int result, int val1, int val2){
		if(Math.abs(val2) > Math.abs(val1))
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
		if(result > 16)
			Memoire.setEtat(5, 1);
		else
			Memoire.setEtat(5, 0);
	}
	
		//Une méthode évaluation qui va se charger de faire l'opérarion.
	@Override
	public void eval() {
		// TODO Auto-generated method stub
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int val1 = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int val2 = Integer.parseInt(imme.substring(2), 16);
		int result = val1 - val2;
		fillEtat(result, val1, val2);
		
		System.out.println("+++++Evaluation complete++++++");
	}


}