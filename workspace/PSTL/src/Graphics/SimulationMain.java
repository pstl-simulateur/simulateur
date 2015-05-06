package Graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class SimulationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame fen = new JFrame();
		PanelInterface panelInterface = new PanelInterface();
		fen.setPreferredSize(new Dimension(1800, 1000));
		fen.add(panelInterface, BorderLayout.EAST);
		fen.add(panelInterface.getBoxeResult(), BorderLayout.CENTER);
		fen.setVisible(true);
		fen.pack();
	}
}