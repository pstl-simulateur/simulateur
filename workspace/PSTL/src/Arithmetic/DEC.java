package Arithmetic;

import Parse.Build;
import Pile.Memoire;


/* Decremente -1*/
public class DEC implements Instruction{
 	private String reg1;
 	
 	public DEC(String reg1){
 		this.reg1 = reg1;
 	}

	public String getReg1() {
		return reg1;
	}

	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}

	public void fillEtat(int result){
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
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int val = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int result = val-1;
		fillEtat(result);
		Memoire.put(ind1, result%255);
		
		System.out.println("+++++Evaluation complete++++++");
	}

}