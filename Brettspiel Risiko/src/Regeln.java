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
		setBounds(100, 100, 612, 579);
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
		btnSchlieen.setBounds(230, 503, 117, 29);
		contentPane.add(btnSchlieen);
		// Das ist das nicht editirbares Textfeld für den Regel Text.
		JTextPane txtpnHierStehenSpter = new JTextPane();
		txtpnHierStehenSpter.setText("Regeln:\r\n\r\nDas Spiel findet Rundenbasierend statt.\r\nJeder Spieler ist nacheinander am Zug."
				+ "\r\nEin Zug besteht aus 3 verschiedenen Phasen.\r\n\r\nPhase 1: Truppen Platzieren\r\n--> Der aktive Spieler kann Truppen die ihm "
				+ "bereitgestellt (Grund Kapital + Bonus von Kontienten) werden jede Runde auf seinen eigenen Feldern frei Platzierren.\r\n\r\nPhase "
				+ "2: Angreifen\r\n--> Es kann mit jedem Land, das mehr als 1 Truppen besitzt und ein feindliches Nachbarland hat, ein feindliches Land"
				+ " angegriffen werden. Man kann mit einem Land so oft angreifen bis das feindliche Land keine Truppen mehr besitzt oder bis die eigenen"
				+ " Truppen nicht mehr ausreichen.\r\nMan kann so oft man m\u00F6chte, solange L\u00E4nder vorhanden sind die die Bedingungen des Angriffs "
				+ "erf\u00FCllen angreifen. \r\nWenn ein Land erfolgreich Angegriffen wurde muss man es einnehmen und mindestens 1 Einheit auf das neue Land"
				+ " verschieben darf aber beliebig viele dort hin verschieben, wobei beide L\u00E4nder mindestens 1 Einheit behalten m\u00FCssen.\r\n\r\n"
				+ "Phase 3: Truppen bewegen\r\n--> Zum Schluss des Zuges k\u00F6nnen nun Einheiten von den eigenen L\u00E4ndern auf benachtbarte "
				+ "eigene L\u00E4nder bewegt werden. Wie beim Angriff muss jedes Land jedoch mindestens 1 Einheit behalten. In dieser Phase k\u00F6nnen"
				+ " die Einheiten jedoch nur ein mal von einem zum anderem Land bewegt werden.\r\n\r\nNach diesen 3 Phasen beginnt der n\u00E4chste Spieler"
				+ " mit seinem Zug.\r\n\r\nSieg: Gewinnen tut der Spieler der als letzter \u00FCberlebender Spieler die gesamte Karte eingenommen "
				+ "hat.\r\nNiederlage: Verloren hat man sobald alle Einheiten vernichtet wurden und man keine L\u00E4nder mehr besitzt.");
		txtpnHierStehenSpter.setEditable(false);
		txtpnHierStehenSpter.setBounds(0, 0, 594, 507);
		contentPane.add(txtpnHierStehenSpter);
	}
}
