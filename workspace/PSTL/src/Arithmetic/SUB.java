package Arithmetic;

import Parse.Build;
import Pile.Memoire;


public class SUB implements Instruction{
 	private String reg1 , reg2;
 	
 	public SUB(String reg1 ,String reg2){
 		this.reg1 = reg1;
 		this.reg2 = reg2;
 	}

	public String getReg1() {
		return reg1;
	}

	public void setReg1(String reg1) {
		this.reg1 = reg1;
	}

	public String getReg2() {
		return reg2;
	}

	public void setReg2(String reg2) {
		this.reg2 = reg2;
	}
	
	public int sub(int op1 , int op2){
		return op1 - op2;
	}
	/*public  void StockAdresse(Object adr){
		Memoire.addAdre(adr);
		
	}*/
	
	public void fillEtat(int result, int ind1, int ind2){
		if(Math.abs(ind2) > Math.abs(ind1))// A voir
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
		//Completer H
	}
	
		//Une méthode évaluation qui va se charger de faire l'opérarion.
	@Override
	public void eval() {
		// TODO Auto-generated method stub
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int ind2 = Build.parserOpe(reg2);
		int val1 = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int val2 = Memoire.take(ind2);
		int result = sub(val1, val2);
		fillEtat(result, val1, val2);
		Memoire.put(ind1, result);
		
		System.out.println("+++++Evaluation complete++++++");
	}

	
}