import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import java.awt.Checkbox;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;

public class Spiel {

	private JFrame frame;
	private JTextField PName1;
	private JTextField PName2;
	private JTextField PName3;
	private JTextField PName4;
	
	static String Name1;
	static String Name2;
	static String Name3;
	static String Name4;
	private static int i = 0;
	
	
	/**
	 * Klasse ist da um die Menge der Spieler zu waehlen und um die Namen der in das Spiel zu uebergeben 
	 * @Autor Konrad
	 *
	 */

	
	 // Start der Anwendung 
	public static void Spiel_Start() {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					Spiel window = new Spiel();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void Setzen(){
		
	
	}
	
	/**
	 * Erstellen der Anwendung.
	 * Konstruktor.
	 */
	public Spiel() {
		initialize();
	}

	/**
	 * Inizialiesieren des Inhalts.
	 */
	private void initialize() {
		// Frame Generieren
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 317, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Button Start
		JButton btnStart = new JButton("Start");
		btnStart.setBackground(SystemColor.menu);
		btnStart.setBounds(178, 341, 117, 29);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnStart);
		// Button Zurück
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBackground(SystemColor.menu);
		btnZurck.setBounds(0, 341, 117, 29);
		frame.getContentPane().add(btnZurck);
		// Button um Spieler Zahl zu erhöhen
		JButton button_minus = new JButton("-");
		button_minus.setBackground(SystemColor.menu);
		button_minus.setBounds(209, 78, 44, 29);
		frame.getContentPane().add(button_minus);
		// Button um Spieler Zahl zu verkleinern
		JButton button_plus = new JButton("+");
		button_plus.setBackground(SystemColor.menu);
		button_plus.setBounds(251, 78, 44, 29);
		frame.getContentPane().add(button_plus);
		
		
		// Die Label fuer die Namen
		JLabel lblName1 = new JLabel("Player 1:");
		lblName1.setBounds(10, 160, 53, 16);
		frame.getContentPane().add(lblName1);
		
		JLabel lblPlayer2 = new JLabel("Player 2:");
		lblPlayer2.setVisible(false);
		lblPlayer2.setBounds(10, 188, 53, 16);
		frame.getContentPane().add(lblPlayer2);
		
		JLabel lblPlayer3 = new JLabel("Player 3:");
		lblPlayer3.setVisible(false);
		lblPlayer3.setBounds(10, 216, 53, 16);
		frame.getContentPane().add(lblPlayer3);
		
		JLabel lblPlayer4 = new JLabel("Player 4:");
		lblPlayer4.setVisible(false);
		lblPlayer4.setBounds(10, 244, 53, 16);
		frame.getContentPane().add(lblPlayer4);
		
		
		// Textfelder zum Eingeben der Namen
		PName1 = new JTextField();
		PName1.setBounds(65, 155, 130, 26);
		PName1.setBackground(Color.WHITE);
		frame.getContentPane().add(PName1);
		PName1.setColumns(10);
		
		PName2 = new JTextField();
		PName2.setVisible(false);
		PName2.setBounds(65, 183, 130, 26);
		PName2.setColumns(10);
		frame.getContentPane().add(PName2);
		
		PName3 = new JTextField();
		PName3.setVisible(false);
		PName3.setBounds(65, 211, 130, 26);
		PName3.setColumns(10);
		frame.getContentPane().add(PName3);
		
		PName4 = new JTextField();
		PName4.setVisible(false);
		PName4.setBounds(65, 239, 130, 26);
		PName4.setColumns(10);
		frame.getContentPane().add(PName4);
		
		
		// Bild
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(".\\Brettspiel Risiko\\Image\\Risiko-Logo-2016.png"));
		lblNewLabel.setBounds(0, 0, 295, 60);
		frame.getContentPane().add(lblNewLabel);
		
		
		// Aktionlistener vom Button Start
		btnStart.addActionListener(new ActionListener() {
			public SpielKarte1 karte;
			public void actionPerformed(ActionEvent e) {
				
				
				/*
				switch(i){
				
				case 0:
					String Name1 = PName1.getText();
					break;
				case 1:
					String Name1 = PName1.getText();
					String Name2 = PName2.getText();
					break;
				case 2:
					String Name1 = PName1.getText();
					String Name2 = PName2.getText();
					String Name3 = PName3.getText();
					break;
				
				case 3: 
					
					String Name1 = PName1.getText();
					String Name2 = PName2.getText();
					String Name3 = PName3.getText();
					String Name4 = PName4.getText();

					
				}
				*/
				
				// Speicher von Namen im String
			Name1 = PName1.getText();
			Name2 = PName2.getText();
			Name3 = PName3.getText();
			Name4 = PName4.getText();
		


				// test ob String gespeichert wird
			System.out.println(Name1 + Name2 + Name3 + Name4);

			// Starten von Spielkarte 1
				this.karte = new SpielKarte1();
				karte.Start_SpielKarte();
				frame.dispose();	
			}
		});
	
		// Aktionlistener vom Button Zurueck
		btnZurck.addActionListener(new ActionListener() {
			private Welcome welcome;
			public void actionPerformed(ActionEvent e) {
				
				this.welcome = new Welcome();
				welcome.Start_Welcome();
				
				frame.dispose();
						
				
			}
		});
		
		// Aktionlistener von + Button
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			// Switch Case Anweisung 
			switch(i++){
			
			case 0:
				PName2.setVisible(true);
				lblPlayer2.setVisible(true);
				break;
			case 1:
				PName3.setVisible(true);
				lblPlayer3.setVisible(true);
				break;
			case 2:
				PName4.setVisible(true);
				lblPlayer4.setVisible(true);
				break;
			
			case 3: // Case damit i nicht höher wird als 3 
				i = 3;
				}
			
			}
		});
		
		// Aktionlistener vom - Button 
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Switch case Anweisung
				switch(i--){
					
				case 3: 
					PName4.setVisible(false);
					lblPlayer4.setVisible(false);
					break;
				case 2:
					PName3.setVisible(false);		
					lblPlayer3.setVisible(false);
					break;
				case 1:
					PName2.setVisible(false);
					lblPlayer2.setVisible(false);
					break;
				case 0:// Case damit i nicht kleiner 0 wird
					i = 0;
				
					
				}
				
			}
		});
		
				
			
	
	
	
		}
	}

