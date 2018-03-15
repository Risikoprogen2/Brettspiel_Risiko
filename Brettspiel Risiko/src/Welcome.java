import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager;
import java.awt.SystemColor;

/**
 * In dieser Klasse wird der Startbildschierm erzeugt.
 * Aus Diesem Fenster heraus koennen Benutzer ein Neues Spiel Starten, Ein Spiel Laden, Denn Regel Text Anschauen und Einen Text Ueber das Programm Lesen.
 * @Autor Konrad Musiol
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
	 * - Das Fenster wird hier Erstellt.
	 * - Konstruktor der Klasse Welcome 
	 * - Hier sind auch die Button die dass Oeffnen der Naechsten fenster erlaubt.
	 */
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 224);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// Der Button Oeffnet das Frame von der Klasse Spiel.java
		
		JButton btnNewButton = new JButton("Neues Spiel");
		btnNewButton.setBounds(0, 63, 300, 43);
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			private Spiel spiel;
			public void actionPerformed(ActionEvent e) {
				
				this.spiel = new Spiel();
				spiel.Spiel_Start();
				
				dispose();
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		// Der Button Oeffnet das Frame von der Klasse Regeln.java
		
		JButton btnNewButton_1 = new JButton("Regeln");
		btnNewButton_1.setBounds(0, 103, 300, 43);
		btnNewButton_1.setBackground(SystemColor.text);
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			private Regeln regeln;

			public void actionPerformed(ActionEvent e) {
				this.regeln = new Regeln();
				regeln.Regeln_Start();
			}
		});
		contentPane.add(btnNewButton_1);
		
		// Der Button Oeffnet das Frame von der Klasse Ueber.java
		
		JButton btnNewButton_2 = new JButton("\u00DCber");
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(0, 142, 300, 43);
		btnNewButton_2.setBackground(SystemColor.text);
		btnNewButton_2.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton_2.addActionListener(new ActionListener() {
			private Ueber ueber;

			public void actionPerformed(ActionEvent e) {
				
				this.ueber = new Ueber();
				ueber.Ueber_Start();
			}
		});
		contentPane.add(btnNewButton_2);
		
		//Hintergrund Bild
		JLabel pic_risiko = new JLabel("");
		pic_risiko.setBounds(0, 0, 300, 66);
		pic_risiko.setIcon(new ImageIcon(getClass().getResource("Risiko-Logo-2016.png")));
		contentPane.add(pic_risiko);
	}
}