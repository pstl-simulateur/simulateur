package Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import Parse.Build;
import Pile.Memoire;

public class Controleur implements ActionListener {
	private PanelInterface inter;

	public Controleur(PanelInterface inter) {
		this.inter = inter;
	}

	public Controleur() {
		inter = null;
	}

	@Override
	public void actionPerformed(ActionEvent e1) {
		// cr�ation de la bo�te de dialogue
        JFileChooser dialogue = new JFileChooser();
         
        // affichage
        dialogue.showOpenDialog(null);
         
        // r�cup�ration du fichier s�lectionn�
        inter.setFileName(dialogue.getSelectedFile().getName());;
        
        //Copie le contenu du fichier dans le content asm
        if(dialogue.getSelectedFile().isFile()){
        	String s = "";
        	try{
    			InputStream ips=new FileInputStream(dialogue.getSelectedFile().getName()); 
    			InputStreamReader ipsr=new InputStreamReader(ips);
    			BufferedReader br=new BufferedReader(ipsr);
    			String ligne;
    			while ((ligne=br.readLine())!=null){
    				s = s + ligne + "\n";
    			}    		
    			br.close(); 
    		}		
    		catch (Exception e){
    			System.out.println(e.toString());
    		}
            inter.setTextArea(s);
        }
        
		@SuppressWarnings("unused")
		//Parsing
		Build b = new Build(dialogue.getSelectedFile().getName());
		
		//Initialisation des registres
		Memoire.put(23, 3);
		Memoire.put(22, 4);
		Memoire.put(24, 2);
		Memoire.put(12, 12);
		Memoire.put(28, 12);
		Memoire.put(21, 16);
		
		//Initialisation des valeur de l'entree sortie
		Memoire.setValueInOut(63, 33);
		Memoire.setValueInOut(21, 13);

		//Evaluation des instructions
		while(Memoire.getIndexOctet() < Memoire.getInst().size()){
			Memoire.getInst().get(Memoire.getIndexOctet()).eval();
		}
		
		//Traiement Registres Table
        String reg = "";
        for(int j=1 ; j<=Memoire.getRegistre().length; j++){
        	reg = reg + "reg"+j+"="+Memoire.getRegistre()[j-1];
        	if(j%10 == 0){
        		reg = reg + "\n";
        	}
        	else{
        		if(j!=Memoire.getRegistre().length){
            		reg = reg + " - ";        			
        		}
        	}
        }
        inter.setRegistresField(reg);

		//Traiement Registres Etat
        String reg1 = "C - Z - N - V - S - H - T - I\n";
        reg1 = reg1 + Memoire.getEtat()[0] + " - ";
        reg1 = reg1 + Memoire.getEtat()[1] + " - ";
        reg1 = reg1 + Memoire.getEtat()[2] + " - ";
        reg1 = reg1 + Memoire.getEtat()[3] + " - ";
        reg1 = reg1 + Memoire.getEtat()[4] + " - ";
        reg1 = reg1 + Memoire.getEtat()[5] + " - ";
        reg1 = reg1 + Memoire.getEtat()[6] + " - ";
        reg1 = reg1 + Memoire.getEtat()[7];
        inter.setRegistresEtatField(reg1);
        
		//Traiement Entree-Sortie
        String reg2 = "";
        for(int j=0 ; j<Memoire.getInOut().length; j++){
        	reg2 = reg2 + Memoire.getInOut()[j];
        	if((j+1)%10 == 0){
        		reg2 = reg2 + "\n";
        	}
        	else{
        		if(j!=Memoire.getInOut().length-1){
            		reg2 = reg2 + " - ";        			
        		}
        	}
        }
        inter.setInOutField(reg2);
        
      //Traiement RAM
        String reg3 = "";
        reg3 = reg3 + "X low byte = " + Memoire.getRam()[0] + "\n";
        reg3 = reg3 + "X high byte = " + Memoire.getRam()[1] + "\n";
        reg3 = reg3 + "Y low byte = " + Memoire.getRam()[2] + "\n";
        reg3 = reg3 + "Y high byte = " + Memoire.getRam()[3] + "\n";
        reg3 = reg3 + "Z low byte = " + Memoire.getRam()[4] + "\n";
        reg3 = reg3 + "Z high byte = " + Memoire.getRam()[5] + "\n";
        inter.setRamField(reg3);
	
		//Traiement Pile
        if(Memoire.getPile().size()==0){
            inter.setTextAreaPile("EMPTY");
        }
        else{
            String reg4 = "";
            for(int j=Memoire.getPile().size()-1 ; j>=0; j--){
            	reg4 = reg4 + Memoire.getPile().get(j) + "\n";
            }
            inter.setTextAreaPile(reg4);
            System.out.println("Pile\n" + reg4);	
        }
	}

}
