package Datenbank;

import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JTextField;

public class DatenHinzuf�gen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatenHinzuf�gen window = new DatenHinzuf�gen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DatenHinzuf�gen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 804, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		frame.getContentPane().add(textField, BorderLayout.WEST);
		textField.setColumns(10);
	}

}
