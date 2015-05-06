package Arithmetic;

import Parse.Build;
import Pile.Memoire;


/*OU logique*/
public class ORI implements Instruction{
 	private String reg1;
 	private String imme;
 	
 	public ORI(String reg1 , String imme){
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
	public int ori(int op1 , int imme){
		return op1 | imme;
	}
		
	/*
	public  void StockAdresse(Object adr){
		Memoire.addAdre(adr);
		
	}*/
	
	public void fillEtat(int result){
		if(result == 0)
			Memoire.setEtat(1, 1);
		else
			Memoire.setEtat(1, 0);
		if(result < 0)
			Memoire.setEtat(2, 1);
		else
			Memoire.setEtat(2, 0);
		Memoire.setEtat(3, 0);
		if(result >= 0)
			Memoire.setEtat(4, 0);
		else
			Memoire.setEtat(4, 1);
	}
	
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int ind2 = Integer.parseInt(imme, 16);
		int val1 = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int val2 = ind2;
		int result = ori(val1, val2);
		fillEtat(result);
		Memoire.put(ind1, result%255);
		System.out.println("+++++Evaluation complete++++++");
	}
	
}