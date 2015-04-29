package Pile;

import java.util.ArrayList;
import java.util.LinkedHashMap;


import Arithmetic.Instruction;


public class Memoire {
	
	// Liste qui contient toutes les instructions : Construite au moment de la lecture du fichier 
	// .asm, grâce au constructeur de la classe "Build.java".
	private static ArrayList<Instruction> inst = new ArrayList<Instruction>();
	
	// HashMap construit de la même manière que la liste des instructions.
	private static LinkedHashMap<String, Integer> tabAddrInd = new LinkedHashMap<String, Integer>();
	
	// tableau pour les 32 régistres
	private static int [] registres = new int[32]; 
	
	// tableau pour la taille de chaque instruction sur la pile
	private static int [] octets = new int[455]; 
	
	//Index nous donne l'indice de l'instruction courrante du programme pour l'octet
	private static int indexOctet = 0; 
	
	//Tableau qui contient les registres d'état
	private static int[] etat = new int [8];
	
	//Liste qui représente la pile
	private static ArrayList<Integer> pile = new ArrayList<Integer>();
	
	//Tableau des entrées-sorties
	private static int [] inOut = new int[64];
	
	
	// A delete
	//private static ArrayList<String> adresses = new ArrayList<String>(); //C'est un tableau qui contient l'adreese d'une instruction

	
	
	public static int[] getRegistre() {
		return registres;
	}

	public static void setRegistre(int[] registre) {
		Memoire.registres = registre;
	}

	//Initialiser la pile a 0; partout au début
	public static void initialisePile(){
		for(int i = 0 ; i< registres.length; i++){
			registres[i] = 0;
		}
	}
	
	//Initialiser l'octet a 0; partout au début
	public static void initialiseOctet(){
		for(int i = 0 ; i< octets.length; i++){
			octets[i] = 0;
		}
	}
	
		//Prendre une valeur d'un régistre dans une pile;
	public static  int take(int indice){
		return registres[indice];
	}

		//metrre une valeur d'un régistre dans une 
		public static  void put(int indice, int valeur){
			registres[indice] = valeur;
		}
		
		public static void addOctet(int taille) { // Cette fonction est appelé lorsque qu'on a une instruction
			//qui est parsé et étudier, la case contiendra la taille de l'intruction
			octets[indexOctet] = taille;
			indexOctet++;
		}
	
		public static int getIndexOctet() {
			return indexOctet;
		}

		public static void setIndexOctet(int indexOctet) {
			Memoire.indexOctet = indexOctet;
		}

		public static int[] getOctets() {
			return octets;
		}

		public static void setOctets(int[] octets) {
			Memoire.octets = octets;
		}
		
		//Ajouter une adresse
		/*public static void addAdre(Object adr){
			adresses.add((String) adr);
		}*/
		
		public static ArrayList<Instruction> getInst() {
			return inst;
		}

		public static void setInst(ArrayList<Instruction> inst) {
			Memoire.inst = inst;
		}

		public static LinkedHashMap<String, Integer> getTabAddrInd() {
			return tabAddrInd;
		}

		public static void setTabAddrInd(LinkedHashMap<String, Integer> tabAddrInd) {
			Memoire.tabAddrInd = tabAddrInd;
		}
		
		public static int[] getEtat() {
			return etat;
		}

		public static void setEtat(int ind, int value) {
			Memoire.etat[ind] = value;
		}

		public static void setEtat(int[] etat) {
			Memoire.etat = etat;
		}

		public static void setPile(ArrayList<Integer> pile) {
			Memoire.pile = pile;
		}
		
		public static ArrayList<Integer> getPile() {
			return pile;
		}

		public static int[] getInOut() {
			return inOut;
		}
		
		public static int getValueInOut(int indice) {
			return inOut[indice];
		}

		public static void setInOut(int[] inOut) {
			Memoire.inOut = inOut;
		}
		
		public static void setValueInOut(int indice, int value) {
			Memoire.inOut[indice] = value;
		}

		public static void initEtat(){
			for(int i = 0; i < etat.length; i++)
				etat[i] = 0;
		}
		
		public static void initInOut(){
			for(int i = 0; i < inOut.length; i++)
				inOut[i] = 0;
		}
		
		public static void afficherEtat(){
			System.out.println(etat[0]+" "+etat[1]+" "+etat[2]+" "+etat[3]+" "+etat[4]+" "+etat[5]+" "+ etat[6]+" "+etat[7]);
		}
		
		public static void affichePile(){
			for (Integer i: pile){
				System.out.println(i);
			}
		}

		//Ajoute un couple <Adresse/Indice>
		public static void pushTabAddrInd(String adress, Integer indice){
			tabAddrInd.put(adress, indice);
		}

		//Aficher adresse
		/*public static void afficheAdr(){
			for(String str: adresses){
				System.out.println(str);
			}
		}*/
		
		public static void afficheOctets(){
			for(int i= 0; i < octets.length ; i++ ){
				System.out.println("pour l'indice "+i+" on a la taille "+octets[i]);
			}
		}


	}