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
import javax.swing.JRadioButton;

public class Spiel {
	
	private JFrame frame;
	
	private JTextField PName1;
	private JTextField PName2;
	private JTextField PName3;
	private JTextField PName4;
	// Strings in den die Namen der Spieler Gespeichert wird
	static String Name1;
	static String Name2;
	static String Name3;
	static String Name4;
	
	public int i = 0;	// Variable um die anzahl der Spieler zu bestimmen
	public int anz_Player = 0;	// Gibt die Genau Anzahl der Spieler an
	public boolean selected; // Gibt an ob der Haken bei der checkbox angeklickt ist oder nicht.
	
 	
 	
 		
	/**
	 * Klasse ist da um die Menge der Spieler zu waehlen und um die Namen der in das Spiel zu uebergeben 
	 * @Autor Konrad Musiol
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


	// Die Folgenden 4 Fuktionen sind für das Switchcase weiter untem im Actionlistener vom Startbutton. Diese Klassen sind dazu da um, Namen einzutragen fals die Spieler es nicht tun
	void ZweiP(){
		if (PName1.getText().equals("")){ // Pruefen ob das Jtextfeld leer ist.
			Name1 = "Player1";			 // Wenn es leer ist wird "Player1" eingetragen.
		}else{Name1 = PName1.getText();} // Wenn nicht wird der Inhalt vom JTextFeld in denn String Geschrieben.
											
		if (PName2.getText().equals("")){
			Name2 = "Player2";
		}else{Name2 = PName2.getText();}
	}
	
	void DreiP(){
		if (PName3.getText().equals("")){
		Name3 = "Player3";
		}else{Name3 = PName3.getText();}	
	}
	
	void VierP(){
		if (PName4.getText().equals("")){
			Name4 = "Player4";
		}else{Name4 = PName4.getText();}	
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
		PName1.setBackground(Color.RED);
		frame.getContentPane().add(PName1);
		PName1.setColumns(10);
		
		PName2 = new JTextField();
		PName2.setBackground(Color.BLUE);
		PName2.setBounds(65, 183, 130, 26);
		PName2.setColumns(10);
		frame.getContentPane().add(PName2);
		
		PName3 = new JTextField();
		PName3.setBackground(Color.GREEN);
		PName3.setVisible(false);
		PName3.setBounds(65, 211, 130, 26);
		PName3.setColumns(10);
		frame.getContentPane().add(PName3);
		
		PName4 = new JTextField();
		PName4.setBackground(Color.YELLOW);
		PName4.setVisible(false);
		PName4.setBounds(65, 239, 130, 26);
		PName4.setColumns(10);
		frame.getContentPane().add(PName4);
		
		
		// Bild
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("Risiko-Logo-2016.png")));
		lblNewLabel.setBounds(0, 0, 295, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBitteTragenSie = new JLabel("Bitte Tragen sie hier ihren Namen ein");
		lblBitteTragenSie.setBounds(2, 132, 251, 16);
		frame.getContentPane().add(lblBitteTragenSie);
		
		// Checkbox um auszusuchen ob man Felder generieren lassen will oder selber zu teilen will
		JCheckBox chckbx_Feldzuteilung = new JCheckBox("Felder selber zuteilen");
		chckbx_Feldzuteilung.setSelected(true);
		chckbx_Feldzuteilung.setBounds(10, 300, 166, 23);
		frame.getContentPane().add(chckbx_Feldzuteilung);
		
		
		// Aktionlistener vom Button Start
		btnStart.addActionListener(new ActionListener() {
			public Controll controll;
			public void actionPerformed(ActionEvent e) {
				
			/*Das Folgende Switchcase ruft die Funktionen von weiter oben auf um nicht eingetragene Namen einzutagen. 
			 *Um Code verdoplung zu vermeiden wurden die Einzelnen IF Schleifen in Funktionen gepackt um diese dann hier aufzurufen
			 *
			*/
				
			switch(i){
			
			case 0: // Zwei Spieler Modus 
			ZweiP();// Führt die Methode für 2 Spieler aus
			anz_Player = 2; // Variable wir auf 2 Gesetzt weil, 2 Spieler spielen.
			break;
			
			case 1: // Drei Spieler
			ZweiP();
			DreiP();
			anz_Player = 3;
			break;
			
			case 2: // Vier Spieler
			ZweiP();
			DreiP();
			VierP();
			anz_Player = 4;
			break;
			}
			
				 
			// test ob String gespeichert wird
		System.out.println("i = "+i+"also Spielen grade" + anz_Player+"Spieler mit den Namen: " + Name1 +", " + Name2 +", " + Name3 +", " + Name4);
			
			// Wahl der Methode um die Felder zu zuteilen
						if(chckbx_Feldzuteilung.isSelected()){
							System.out.println("Selected"); 
							boolean selected = true;
						}else{
							System.out.println("not Selected");
							boolean selected = false;
							};
							
							
		// Starten von Klasse Controll. Die Klasse Controll öffnet dann die Spiel Karte und die Starteinstellungen
		this.controll = new Controll();
		controll.Start();
				
				
				frame.dispose();//Fenster abbauen bzw Schließen
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
				PName3.setVisible(true);
				lblPlayer3.setVisible(true);
				break;
			case 1:
				PName4.setVisible(true);
				lblPlayer4.setVisible(true);
				break;
			case 2: // Case damit i nicht höher wird als 2
				i = 2;
				}
			}
		});
		
		// Aktionlistener vom - Button 
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Switch case Anweisung
				switch(i--){
					
				case 2:
					PName4.setVisible(false);		
					lblPlayer4.setVisible(false);
					break;
				case 1:
					PName3.setVisible(false);
					lblPlayer3.setVisible(false);
					break;
				case 0:// Case damit i nicht kleiner 0 wird
					i = 0;	
				}	
			}
		});
		
	
		}
	}

