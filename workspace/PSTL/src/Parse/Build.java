package Parse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import Arithmetic.ADC;
import Arithmetic.ADD;
import Arithmetic.ADIW;
import Arithmetic.AND;
import Arithmetic.ANDI;
import Arithmetic.MUL;
import Arithmetic.MULS;
import Arithmetic.MULSU;
import Arithmetic.OR;
import Arithmetic.ORI;
import Arithmetic.SBC;
import Arithmetic.SBCI;
import Arithmetic.SBIW;
import Arithmetic.SUB;
import Arithmetic.SUBI;
import BitEtOther.NOP;
import Bit_Wise.CLI;
import Bit_Wise.SEI;
import Branches.BRCC;
import Branches.BRCS;
import Branches.BREQ;
import Branches.CPSE;
import Branches.SBIS;
import Call.CALL;
import Call.RET;
import Call.RETI;
import Jump.JMP;
import Jump.RJMP;
import Pile.Memoire;
import Transfers.IN;
import Transfers.LDI;
import Transfers.LDS;
import Transfers.MOV;
import Transfers.MOVW;
import Transfers.OUT;
import Transfers.POP;
import Transfers.PUSH;

public class Build {
	
	public Build(String filename){
		int cpt = 0;
		Memoire.initialisePile();
		Memoire.initialiseOctet();
		Memoire.setIndexOctet(0);
		Memoire.initInOut();

		try{
			InputStream ips=new FileInputStream("test.asm"); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;

			String adr = "";
			String tmp;

			String [] tab = null;
			String [] tab1 = null;
			String [] tab3 = null;


			while ((ligne=br.readLine())!=null){
				tab = ligne.split(":");
				adr = tab[0].trim();
				tmp = ligne.substring(tab[0].length()+1);
				tab1 = tmp.split("\t");
				
				if(tab1[2].equals("ret")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new RET());
					continue;
				}
				if(tab1[2].equals("reti")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new RETI());
					continue;
				}
				if(tab1[2].equals("cli")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new CLI());
					continue;
				}
				if(tab1[2].equals("sei")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SEI());
					continue;
				}
				if(tab1[2].equals("nop")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new NOP());
					continue;
				}
				tab3 = tab1[3].split(",");
				if(tab1[2].equals("adc")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new ADC(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("add")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new ADD(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("adiw")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new ADIW(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("and")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new AND(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("andi")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new ANDI(tab3[0].trim(),tab3[1].trim()));
				}

				if(tab1[2].equals("com")){
					Memoire.addOctet(2);
					//Memoire.getInst();
				}
				if(tab1[2].equals("cp")){
					Memoire.addOctet(2);
				//	Memoire.getInst();
				}
				if(tab1[2].equals("cpc")){
					Memoire.addOctet(2);
					//Memoire.getInst();
				}
				if(tab1[2].equals("cpi")){
					Memoire.addOctet(2);
					//Memoire.getInst();
				}
				if(tab1[2].equals("dec")){
					Memoire.addOctet(2);
				//	Memoire.getInst();
				}
				if(tab1[2].equals("eor")){
					Memoire.addOctet(2);
				//	Memoire.getInst();
				}
				if(tab1[2].equals("mul")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new MUL(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("muls")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new MULS(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("mulsu")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new MULSU(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("or")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new OR(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("ori")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new ORI(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("sbc")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SBC(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("sbci")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SBCI(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("sbiw")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SBIW(tab3[0].trim(),tab3[1].trim()));
				}

				if(tab1[2].equals("sub")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SUB(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("subi")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SUBI(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("cpse")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new CPSE(tab3[0].trim(),tab3[1].trim()));
				}
				
				if(tab1[2].equals("sbis")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new SBIS(tab3[0].trim(),tab3[1].trim()));
				}
				
				if(tab1[2].equals("brcc")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new BRCC(tab3[0].trim()));
				}
				
				if(tab1[2].equals("brcs")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new BRCS(tab3[0].trim()));
				}
				
				if(tab1[2].equals("breq")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new BREQ(tab3[0].trim()));
				}
				
				if(tab1[2].equals("brne")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new BREQ(tab3[0].trim()));
				}

				if(tab1[2].equals("jmp")){
					Memoire.addOctet(4);
					Memoire.getInst().add(new JMP(tab3[0].trim()));
				}
				if(tab1[2].equals("rjmp")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new RJMP(tab3[0].trim()));
				}
				if(tab1[2].equals("in")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new IN(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("ldi")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new LDI(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("lds")){
					Memoire.addOctet(4);
					Memoire.getInst().add(new LDS(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("mov")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new MOV(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("movw")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new MOVW(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("out")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new OUT(tab3[0].trim(),tab3[1].trim()));
				}
				if(tab1[2].equals("pop")){
					Memoire.addOctet(2);
					Memoire.getInst().add(new POP(tab3[0]));
				}
				if(tab1[2].equals("push")){
					
					Memoire.addOctet(2);
					Memoire.getInst().add(new PUSH(tab3[0]));
				}
				if(tab1[2].equals("call")){
					Memoire.addOctet(4);
					Memoire.getInst().add(new CALL(tab3[0]));
				}
	
				
				Memoire.pushTabAddrInd(adr, cpt);
				//C'est un tableau qui contient l'adreese d'une instruction
				//Memoire.addAdre(adr);
				cpt++;
			}
		
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		Memoire.setIndexOctet(0);
	}
	
	public static  int parserOpe(String op){
		return Integer.parseInt(op.substring(1));	
	}
}
