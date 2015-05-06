package Transfers;

import Arithmetic.Instruction;
import Parse.Build;
import Pile.Memoire;

public class ST implements Instruction {

private String ram , reg;
 	
 	public ST(String ram , String reg){
 		this.ram = ram;
 		this.reg = reg;
 	}

	public String getReg() {
		return reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public void eval(){
		Memoire.setIndexOctet(Memoire.getIndexOctet() + 1);
		int registre = Build.parserOpe(reg);
		if(ram.length()==1){
			if(ram.charAt(0)=='X'){
				Memoire.putRam(Memoire.getIndexX(), Memoire.getRegistre()[registre]);
			}
			if(ram.charAt(0)=='Y'){
				Memoire.putRam(Memoire.getIndexY(), Memoire.getRegistre()[registre]);
			}
			if(ram.charAt(0)=='Z'){
				Memoire.putRam(Memoire.getIndexZ(), Memoire.getRegistre()[registre]);
			}
		}
		if(ram.length()==2){
			if(ram.charAt(0)=='-'){
				if(ram.charAt(1)=='X'){
					Memoire.setIndexX(Memoire.getIndexX()-1);
					Memoire.putRam(Memoire.getIndexX(), Memoire.getRegistre()[registre]);
				}
				if(ram.charAt(1)=='Y'){
					Memoire.setIndexY(Memoire.getIndexY()-1);
					Memoire.putRam(Memoire.getIndexY(), Memoire.getRegistre()[registre]);
				}
				if(ram.charAt(1)=='Z'){
					Memoire.setIndexZ(Memoire.getIndexZ()-1);
					Memoire.putRam(Memoire.getIndexZ(), Memoire.getRegistre()[registre]);
				}
				System.out.println("dec");
			}
			if(ram.charAt(1)=='+'){
				if(ram.charAt(0)=='X'){
					Memoire.putRam(Memoire.getIndexX(), Memoire.getRegistre()[registre]);
					Memoire.setIndexX(Memoire.getIndexX()+1);
				}
				if(ram.charAt(0)=='Y'){
					Memoire.putRam(Memoire.getIndexY(), Memoire.getRegistre()[registre]);
					Memoire.setIndexY(Memoire.getIndexY()+1);
				}
				if(ram.charAt(0)=='Z'){
					Memoire.putRam(Memoire.getIndexZ(), Memoire.getRegistre()[registre]);
					Memoire.setIndexZ(Memoire.getIndexZ()+1);
				}
			}
		}		
		System.out.println("+++++Evaluation complete++++++");
	}
}
