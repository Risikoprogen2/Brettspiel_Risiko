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
	private JTextField textField;
	private JTextField textField_1;

	
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
		frame.setBounds(100, 100, 289, 193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(137, 105, 117, 29);
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
		btnZurck.setBounds(10, 105, 117, 29);
		btnZurck.addActionListener(new ActionListener() {
			private Welcome welcome;
			public void actionPerformed(ActionEvent e) {
				
				this.welcome = new Welcome();
				welcome.Start_Welcome();
				
				frame.dispose();
								
			}
		});
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(204, 55, 28, 23);
		chckbxNewCheckBox.setSelected(false);
		chckbxNewCheckBox.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JCheckBox chckbxNewCheckBox = (JCheckBox) e.getSource();
		        if (chckbxNewCheckBox.isSelected()) {
		      
		    		textField_1.setEnabled(true);
		        } else {
		        
		    		textField_1.setEnabled(false);

		        }	
			}	
		});
		
		
		
		frame.getContentPane().add(btnZurck);
		
		JLabel lblName = new JLabel("Player 1:");
		lblName.setBounds(10, 30, 53, 16);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(65, 25, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblPlayer = new JLabel("Player 2:");
		lblPlayer.setBounds(10, 57, 53, 16);
		frame.getContentPane().add(lblPlayer);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 52, 130, 26);
		textField_1.setEnabled(false);
		textField_1.setColumns(10);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
			
		}
	}

