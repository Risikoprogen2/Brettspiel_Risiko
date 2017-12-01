import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class Regeln extends JFrame {

	private JPanel contentPane;

	/**
	 * Diese Klasse Erzeugt eine einfaches Fenster Mit einem Text Feld und einem Button zum Schliesen.
	 * In dem TextFeld stehen die Regeln Von Risiko. Warscheinlich ein auszug von Wikipedia.
	 * 
	 * @Autor Konrad
	 * 
	 * Fertig!
	 * 
	 * Mit der Methode Regeln_Start() Startet das Programm.
	 */
	public static void Regeln_Start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Regeln frame = new Regeln();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Erstellen des Fensters.
	 * 
	 * Konstruktor.
	 */
	public Regeln() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Button zum Schließen
		JButton btnSchlieen = new JButton("Schlie\u00DFen");
		btnSchlieen.setBackground(SystemColor.text);
		btnSchlieen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSchlieen.setBounds(158, 253, 117, 29);
		contentPane.add(btnSchlieen);
		// Das ist das nicht editirbares Textfeld für den Regel Text.
		JTextPane txtpnHierStehenSpter = new JTextPane();
		txtpnHierStehenSpter.setText("Hier Stehen Später die Regeln von Risiko\n\n\n");
		txtpnHierStehenSpter.setEditable(false);
		txtpnHierStehenSpter.setBounds(0, 0, 434, 263);
		contentPane.add(txtpnHierStehenSpter);
	}
}
