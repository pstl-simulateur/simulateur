package Graphics;
import javax.swing.*;

import java.awt.event.*;

public class Test extends JFrame {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Test() {

     super("Simulateur");

      WindowListener l = new WindowAdapter() {
         public void windowClosing(WindowEvent e){
            System.exit(0);
         }
      };

      addWindowListener(l);

      ImageIcon img = new ImageIcon("tips.gif");
      JButton bouton = new JButton("Mon bouton",img);

      JPanel panneau = new JPanel();
      panneau.add(bouton);
      setContentPane(panneau);
      setSize(200,100);
      setVisible(true);
   }

  public static void main(String [] args){
      @SuppressWarnings("unused")
	JFrame frame = new Test();
  }
}