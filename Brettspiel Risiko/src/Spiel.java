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

public class Spiel {

	private JFrame frame;
	private JTextField PName1;
	private JTextField PName2;
	private JTextField PName3;
	private JTextField PName4;
	
	private String Name1;
	private String Name2;
	private String Name3;
	private String Name4;
	
	/**
	 * In dieser Klasse werden die Vorbereitungen für das Spiel Getroffen. Anzahl der Spieler und ob KI oder Mensch Spielt.
	 * Außerdem Map auswahl.
	 * REST WIRD NOCH GEPLANT!!!
	 * 
	 * @Autor Konrad
	 *
	 */

	
	/**
	 * Start der Anwendung
	 */
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
	 * 
	 * 
	 * 
	 */
	public Spiel() {
		initialize();
	}

	/**
	 * Inizialiesieren des Inhalts.
	 * 
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 291, 282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(168, 225, 117, 29);
		btnStart.addActionListener(new ActionListener() {
			public SpielKarte1 karte;
			public void actionPerformed(ActionEvent e) {
				
				
				this.karte = new SpielKarte1();
				karte.Start_SpielKarte();
				frame.dispose();
			
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnStart);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setBounds(10, 225, 117, 29);
		btnZurck.addActionListener(new ActionListener() {
			private Welcome welcome;
			public void actionPerformed(ActionEvent e) {
				
				this.welcome = new Welcome();
				welcome.Start_Welcome();
				
				frame.dispose();
								
			}
		});
		
		
		frame.getContentPane().add(btnZurck);
		
		JLabel lblName = new JLabel("Player 1:");
		lblName.setBounds(10, 30, 53, 16);
		frame.getContentPane().add(lblName);
		
		PName1 = new JTextField();
		PName1.setBounds(65, 25, 130, 26);
		frame.getContentPane().add(PName1);
		PName1.setColumns(10);
		String Name1 = PName1.getText();
		
		JLabel lblPlayer = new JLabel("Player 2:");
		lblPlayer.setBounds(10, 57, 53, 16);
		frame.getContentPane().add(lblPlayer);
		
		PName2 = new JTextField();
		PName2.setBounds(65, 52, 130, 26);
		PName2.setEnabled(false);
		PName2.setColumns(10);
		frame.getContentPane().add(PName2);
		String Name2 = PName2.getText();
		
		PName3 = new JTextField();
		PName3.setColumns(10);
		PName3.setBounds(65, 78, 130, 26);
		frame.getContentPane().add(PName3);
		String Name3 = PName3.getText();
		
		
		PName4 = new JTextField();
		PName4.setColumns(10);
		PName4.setBounds(65, 106, 130, 26);
		frame.getContentPane().add(PName4);
		String Name4 = PName4.getText();
		
		
		JLabel lblPlayer_2 = new JLabel("Player 3:");
		lblPlayer_2.setBounds(10, 85, 53, 16);
		frame.getContentPane().add(lblPlayer_2);
		
		JLabel lblPlayer_1 = new JLabel("Player 4:");
		lblPlayer_1.setBounds(10, 111, 53, 16);
		frame.getContentPane().add(lblPlayer_1);
		
		
		
			
		}
	}

