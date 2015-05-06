package Arithmetic;

import Parse.Build;
import Pile.Memoire;


/* MUL signed*/
public class MUL implements Instruction{
 	private String reg1 , reg2;
 	
 	public MUL(String reg1 , String reg2){
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
	
	public static  int mul(int op1 , int op2){
		return op1 * op2;
	}
	
	public void fillEtat(int quotient, int result){
		
		
		if(quotient > 127) 
			Memoire.setEtat(0, 1);
		else
			Memoire.setEtat(0, 0);

		if(result == 0)
			Memoire.setEtat(1, 1);
		else
			Memoire.setEtat(1, 0);
	}

	@Override
	public void eval() {
		// TODO Auto-generated method stub
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int ind1 = Build.parserOpe(reg1);
		int ind2 = Build.parserOpe(reg2);
		int val1 = Memoire.take(ind1); //prend la valeur qui dans l'indice ind
		int val2 = Memoire.take(ind2);
		int result = mul(val1, val2);
		int quotient = result / 255;
		int reste = result % 255;
		fillEtat(quotient,result);
		Memoire.put(0, reste);
		Memoire.put(1, quotient);

		System.out.println("+++++Evaluation complete++++++");		
	}
}