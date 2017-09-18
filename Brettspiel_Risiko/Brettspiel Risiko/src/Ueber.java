import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ueber extends JFrame {

	private JPanel contentPane;

	/**
	 * Diese Klasse Erzeugt eine einfaches Fenster Mit einem Text Feld und einem Button zum Schliesen.
	 * In dem TextFeld steht ein Kurzer Text über uns und noch paar kleinigkeiten 
	 * @Autor Konrad
	 * 
	 * FERTIG!
	 * 
	 * Mit der Methode Ueber_Start() startet die Klasse
	 */
	public static void Ueber_Start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ueber frame = new Ueber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
		
	}
	
	
	
	
	/**
	 * Erstenllen vom Fenster 
	 */
	public Ueber() {
		setTitle("Ueber");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Button zum Schlißen 
		JButton btnSchlieen = new JButton("Schließen");
		btnSchlieen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnSchlieen.setBounds(164, 243, 117, 29);
		contentPane.add(btnSchlieen);
		// Text Feld
		JTextPane txtpnHierStehenSpter = new JTextPane();
		txtpnHierStehenSpter.setText("Hier steht später irgendwas über uns usw. :)\n");
		txtpnHierStehenSpter.setEditable(false);
		txtpnHierStehenSpter.setBounds(6, 6, 438, 225);
		contentPane.add(txtpnHierStehenSpter);
	}
}
