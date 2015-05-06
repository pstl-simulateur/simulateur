package Graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelInterface extends JPanel {
	/**
	 *
	 */
	final DecimalFormat df = new DecimalFormat("0.####");
	private static final long serialVersionUID = 1L;
	private JButton browse;
	private Controleur controle;
	private JTextField fileName;
	private JTextArea textArea;
	private JTextArea textAreaPile;
	private Box boxeResult;
	private JTextArea registresField;
	private JPanel registresPanel;	
	private JTextArea registresEtatField;
	private JPanel registresEtatPanel;
	private JTextArea inOutField;
	private JPanel inOutPanel;	
	private JTextArea ramField;
	private JPanel ramPanel;
	
	public JTextArea getTextAreaPile() {
		return textAreaPile;
	}

	public void setTextAreaPile(String text) {
		this.textAreaPile.setText(text);
	}

	public JTextArea getRamField() {
		return ramField;
	}

	public void setRamField(String text) {
		this.ramField.setText(text);
	}

	public JPanel getRamPanel() {
		return ramPanel;
	}

	public void setRamPanel(JPanel ramPanel) {
		this.ramPanel = ramPanel;
	}

	public JTextArea getInOutField() {
		return inOutField;
	}

	public void setInOutField(String text) {
		this.inOutField.setText(text);
	}

	public JPanel getInOutPanel() {
		return inOutPanel;
	}

	public void setInOutPanel(JPanel inOutPanel) {
		this.inOutPanel = inOutPanel;
	}

	public JTextArea getRegistresEtatField() {
		return registresEtatField;
	}

	public void setRegistresEtatField(String text) {
		this.registresEtatField.setText(text);
	}

	public JPanel getRegistresEtatPanel() {
		return registresEtatPanel;
	}

	public void setRegistresEtatPanel(JPanel registresEtatPanel) {
		this.registresEtatPanel = registresEtatPanel;
	}

	public JTextArea getRegistresField() {
		return registresField;
	}

	public void setRegistresField(String text) {
		this.registresField.setText(text);
	}

	public JPanel getRegistresPanel() {
		return registresPanel;
	}

	public void setRegistresPanel(JPanel registresPanel) {
		this.registresPanel = registresPanel;
	}

	public Box getBoxeResult() {
		return boxeResult;
	}

	public void setBoxeResult(Box boxeResult) {
		this.boxeResult = boxeResult;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(String text) {
		this.textArea.setText(text);
	}

	public JTextField getFileName() {
		return fileName;
	}

	public void setFileName(String text) {
		this.fileName.setText(text);
	}

	public PanelInterface() {
		super();
		build();
	}

	public void build() {
		this.setPreferredSize(new Dimension(240, 768));
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel.setLayout(new GridLayout(3, 1));
		panel1.setLayout(new GridLayout(3, 1));
		panel2.setLayout(new GridLayout(2, 1));
		panel3.setLayout(new GridLayout(2, 1));
		Box boxe = Box.createVerticalBox();
		 boxeResult = Box.createVerticalBox();

		//Partie droite (initialisation)
		controle = new Controleur(this);
		JLabel label = new JLabel("Select File : ");
		JLabel label1 = new JLabel("File Name ");
		JLabel label2 = new JLabel("Content ASM ");
		JLabel label3 = new JLabel("Pile ");
		browse = new JButton("Browse File & Start");
		browse.addActionListener(controle);
		fileName = new JTextField(10);
		
		//Select file
		panel.add(label);
		panel.add(browse);
		boxe.add(panel);
		boxe.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//File Name
		panel1.add(label1);
		panel1.add(fileName);
		boxe.add(panel1);
		boxe.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//Content ASM
		panel2.add(label2);
		textArea = new JTextArea(7, 30);
		JScrollPane scrollPane = new JScrollPane(textArea);
		setPreferredSize(new Dimension(400, 50));
		add(scrollPane, BorderLayout.CENTER);
		panel2.add(scrollPane);
		boxe.add(panel2);
		boxe.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//Pile
		panel3.add(label3);
		textAreaPile = new JTextArea(6, 30);
		JScrollPane scrollPane10 = new JScrollPane(textAreaPile);
		setPreferredSize(new Dimension(400, 50));
		add(scrollPane10, BorderLayout.CENTER);
		panel3.add(scrollPane10);
		boxe.add(panel3);
		boxe.add(new JSeparator(SwingConstants.HORIZONTAL));
		
		//Ajout de tous les composants de l'initialisation dans le box
		this.add(boxe, BorderLayout.NORTH);
		
		
		//-----------------------------------------------------------//
		
		//Partie gauche (Resultat)
		//Registre Table
		JLabel registreLabel = new JLabel("Registres Table");
		 registresField = new JTextArea(4, 80);
			JScrollPane scrollPane1 = new JScrollPane(registresField);
		add(scrollPane1, BorderLayout.CENTER);
		 registresPanel = new JPanel();
		registresPanel.add(registreLabel);
		registresPanel.add(scrollPane1);
		
		//Registre Etat
		JLabel registreEtatLabel = new JLabel("Registres Etat");
		 registresEtatField = new JTextArea(2, 80);
			JScrollPane scrollPane2 = new JScrollPane(registresEtatField);
			add(scrollPane2, BorderLayout.CENTER);
		 registresEtatPanel = new JPanel();
		 registresEtatPanel.add(registreEtatLabel);
		registresEtatPanel.add(scrollPane2);
		
		
		//Entree-Sortie
		JLabel inOutLabel = new JLabel("Entrées-Sorties");
		 inOutField = new JTextArea(8, 80);
			JScrollPane scrollPane3 = new JScrollPane(inOutField);
			add(scrollPane3, BorderLayout.CENTER);
		 inOutPanel = new JPanel();

		 inOutPanel.add(inOutLabel);
		inOutPanel.add(scrollPane3);
		
		//RAM
				JLabel ramLabel = new JLabel("      RAM      ");
				 ramField = new JTextArea(8, 80);
					JScrollPane scrollPane4 = new JScrollPane(ramField);
					add(scrollPane4, BorderLayout.CENTER);
				 ramPanel = new JPanel();

				 ramPanel.add(ramLabel);
				ramPanel.add(scrollPane4);
				
		//Ajout de tous les resultats dans le boxeResult
		boxeResult.add(registresPanel);
		boxeResult.add(new JSeparator(SwingConstants.HORIZONTAL));
		boxeResult.add(registresEtatPanel);
		boxeResult.add(new JSeparator(SwingConstants.HORIZONTAL));
		boxeResult.add(inOutPanel);
		boxeResult.add(new JSeparator(SwingConstants.HORIZONTAL));
		boxeResult.add(ramPanel);
		boxeResult.add(new JSeparator(SwingConstants.HORIZONTAL));
		
	}

	public Controleur getControleur() {
		return controle;
	}

	public void setControleur(Controleur controle) {
		this.controle = controle;
	}

}
