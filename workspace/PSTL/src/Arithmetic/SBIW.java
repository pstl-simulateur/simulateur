package Arithmetic;

import Parse.Build;
import Pile.Memoire;


/*soustraction avec immediat et registre pair r28 = r28 - 50*/
public class SBIW implements Instruction{
 	private String reg1 , imme;
 	
 	public SBIW(String reg1 , String imme){
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
		if(Math.abs(val1) < Math.abs(val2))
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
	
	@Override
	public void eval() {
		// TODO Auto-generated method stub
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int valeur = Integer.parseInt(imme.substring(2), 16);
		int valReg = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int result = valReg - valeur;
		fillEtat(result,  valReg,  valeur);
		Memoire.put(ind1, result);
		
		System.out.println("+++++Evaluation complete++++++");		
	}


}