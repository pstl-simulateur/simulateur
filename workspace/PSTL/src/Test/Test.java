package Test;

import Parse.Build;
import Pile.Memoire;

public class Test {

	public static void main(String args[]){
		
		@SuppressWarnings("unused")
		Build b = new Build("test.asm");
		Memoire.put(23, 3);
		Memoire.put(22, 4);
		Memoire.put(24, 2);
		Memoire.put(12, 12);
		Memoire.put(28, 12);
		Memoire.put(21, 16);	
		Memoire.setValueInOut(63, 33);
		Memoire.setValueInOut(21, 13);
		
		
		System.out.println("Valeur avant exécution LDI sur le registre 22 = " + Memoire.getRegistre()[22]);
		System.out.println("Valeur avant exécution IN sur le registre 23 = " + Memoire.getRegistre()[23]);
		System.out.println("Valeur avant exécution OUT sur le registre 24 = " + Memoire.getRegistre()[24]);

		while(Memoire.getIndexOctet() < Memoire.getInst().size()){
			Memoire.getInst().get(Memoire.getIndexOctet()).eval();
		}
		
		System.out.println("Valeur après exécution LDI sur le registre 22 = " + Memoire.getRegistre()[22]);
		System.out.println("Valeur après exécution IN sur le registre 23 = " + Memoire.getRegistre()[23]);
		System.out.println("Valeur après exécution LDS sur le registre 24 = " + Memoire.getRegistre()[24]);
		System.out.println("Valeur après exécution LDS sur le registre 12 = " + Memoire.getRegistre()[12]);

		
		//Memoire.afficheOctets();
		System.out.println("--------FINISHED!!!--------\n");
		Memoire.afficherEtat();
		

	}
	
}
