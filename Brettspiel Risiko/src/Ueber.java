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
import java.awt.SystemColor;

public class Ueber extends JFrame {

	private JPanel contentPane;

	/**
	 * Diese Klasse Erzeugt eine einfaches Fenster Mit einem Text Feld und einem Button zum Schliesen.
	 * In dem TextFeld steht ein Kurzer Text Ã¼ber uns und noch paar kleinigkeiten 
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
		setBounds(100, 100, 450, 334);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// Button zum SchliÃŸen 
		JButton btnSchlieen = new JButton("Schlie\u00DFen");
		btnSchlieen.setBackground(SystemColor.text);
		btnSchlieen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				
			}
		});
		btnSchlieen.setBounds(153, 255, 117, 29);
		contentPane.add(btnSchlieen);
		// Text Feld
		JTextPane txtpnHierStehenSpter = new JTextPane();
		txtpnHierStehenSpter.setText("Hier steht später irgendwas über uns usw. :)\n");
		txtpnHierStehenSpter.setEditable(false);
		txtpnHierStehenSpter.setBounds(0, 0, 438, 295);
		contentPane.add(txtpnHierStehenSpter);
	}
}
