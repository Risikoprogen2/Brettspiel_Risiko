import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * In dieser Klasse wird der Startbildschierm erzeugt.
 * 
 * Aus Diesem Fenster heraus k�nnen Benutzer ein Neues Spiel Starten, Ein Spiel Laden, Denn Regel Text Anschauen und Einen Text über das Programm Lesen.
 * 
 * @Autor Konrad 
 * 
 * 
 * FÜrs erste FERTIG!
 */


public class Welcome extends JFrame {

	
	private JPanel contentPane;

		
		
	
	// Mit der Main Methode Startet das Programm
	
	public static void Start_Welcome() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Das Fenster wird hier Erstellt.
	 * 
	 * Konstruktor 
	 * 
	 * Hier sind auch die Button die das Öffnen der Nächsten fenster erlaubt.
	 * 
	 * Mehr steht hier nicht drin.
	 * 
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 214, 207);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Der Button öffnet das Frame von der Klasse Spiel.java
		
		JButton btnNewButton = new JButton("Neues Spiel");
		btnNewButton.addActionListener(new ActionListener() {
			private Spiel spiel;
			public void actionPerformed(ActionEvent e) {
				
				this.spiel = new Spiel();
				spiel.Spiel_Start();
				
				dispose();
				
			}
		});
		btnNewButton.setBounds(50, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		// Der Button öffnet das Frame von der Klasse Regeln.java
		
		JButton btnNewButton_1 = new JButton("Regeln");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			private Regeln regeln;

			public void actionPerformed(ActionEvent e) {
				this.regeln = new Regeln();
				regeln.Regeln_Start();
			}
		});
		btnNewButton_1.setBounds(50, 45, 89, 23);
		contentPane.add(btnNewButton_1);
		
		// Der Button öffnet das Frame von der Klasse Ueber.java
		
		JButton btnNewButton_2 = new JButton("\u00DCber");
		btnNewButton_2.addActionListener(new ActionListener() {
			private Ueber ueber;

			public void actionPerformed(ActionEvent e) {
				
				this.ueber = new Ueber();
				ueber.Ueber_Start();
			}
		});
		btnNewButton_2.setBounds(50, 79, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
// Github test hochladen
