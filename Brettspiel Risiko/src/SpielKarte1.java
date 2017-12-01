import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;


//Autor: Jonas Behler


public class SpielKarte1 extends JFrame {
	static SpielKarte1 frame = new SpielKarte1();
	


	/**
	 * Methode zum starten des Spielbrett's
	 */
	public static void Start_SpielKarte() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}


	/**
	 * Create the frame.
	 */
	public SpielKarte1() {
		getContentPane().setBackground(UIManager.getColor("Button.highlight"));
		getContentPane().setForeground(UIManager.getColor("Button.focus"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 665);
		
		
		
		
		//Schleife zum Felder generieren
		/*
		int kordx = 130;
		int kordy = 70;
		int zaehler = 0;
		for(int i= 1; 1<=24; i++)
		{
			Button buttons = new Button("Feld" +[i]);
			buttons[i].setBounds(130, 40, 70, 70);
			getContentPane().add(buttons[i]);
			zaehler++;
			
			if(kordx <= 610)
			{
				kordx = 130;
				kordy = kordy + 100;
			}
		}*/
		
		/*
		int kordx = 130;
		int kordy = 70;
		int zaehler = 0;
		int anzahl = 100;
		JButton buttons[];
		buttons = new JButton[anzahl];
		for(int i= 1; 1 <= 24; i++)
		{
			buttons[i] = new JButton(String.valueOf(i));
			buttons[i].setBounds(130, 40, 70, 70);
			getContentPane().add(buttons[i]);
			zaehler++;
			
			if(kordx <= 590)
			{
				kordx = 130;
				kordy = kordy + 100;
			}
		}
		*/
		getContentPane().setLayout(null);
		
		//Vorl�ufig:
		
		
		//Felder erstellen
		Button button_1 = new Button("Feld 1");
		button_1.setBounds(154, 68, 70, 70);
		button_1.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_1);
		
		Button button_2 = new Button("Feld 2");
		button_2.setBounds(244, 68, 70, 70);
		button_2.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_2);
		
		Button button_3 = new Button("Feld 3");
		button_3.setBounds(334, 68, 70, 70);
		button_3.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_3);
		
		Button button_4 = new Button("Feld 4");
		button_4.setBounds(424, 68, 70, 70);
		button_4.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_4);
		
		Button button_5 = new Button("Feld 5");
		button_5.setBounds(514, 68, 70, 70);
		button_5.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_5);
		
		Button button_6 = new Button("Feld 6");
		button_6.setBounds(604, 68, 70, 70);
		button_6.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_6);
		
		Button button_7 = new Button("Feld 7");
		button_7.setBounds(154, 158, 70, 70);
		button_7.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_7);
		
		Button button_8 = new Button("Feld 8");
		button_8.setBounds(244, 158, 70, 70);
		button_8.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_8);
		
		Button button_9 = new Button("Feld 9");
		button_9.setBounds(334, 158, 70, 70);
		button_9.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_9);
		
		Button button_10 = new Button("Feld 10");
		button_10.setBounds(424, 158, 70, 70);
		button_10.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_10);
		
		Button button_11 = new Button("Feld 11");
		button_11.setBounds(514, 158, 70, 70);
		button_11.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_11);
		
		Button button_12 = new Button("Feld 12");
		button_12.setBounds(604, 158, 70, 70);
		button_12.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_12);
		
		Button button_13 = new Button("Feld 13");
		button_13.setBounds(154, 248, 70, 70);
		button_13.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_13);
		
		Button button_14 = new Button("Feld 14");
		button_14.setBounds(244, 248, 70, 70);
		button_14.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_14);
		
		Button button_15 = new Button("Feld 15");
		button_15.setBounds(334, 248, 70, 70);
		button_15.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_15);
		
		Button button_16 = new Button("Feld 16");
		button_16.setBounds(424, 248, 70, 70);
		button_16.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_16);
		
		Button button_17 = new Button("Feld 17");
		button_17.setBounds(514, 248, 70, 70);
		button_17.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_17);
		
		Button button_18 = new Button("Feld 18");
		button_18.setBounds(604, 248, 70, 70);
		button_18.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_18);
		
		Button button_19 = new Button("Feld 19");
		button_19.setBounds(154, 338, 70, 70);
		button_19.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_19);
		
		Button button_20 = new Button("Feld 20");
		button_20.setBounds(244, 338, 70, 70);
		button_20.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_20);
		
		Button button_21 = new Button("Feld 21");
		button_21.setBounds(334, 338, 70, 70);
		button_21.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_21);
		
		Button button_22 = new Button("Feld 22");
		button_22.setBounds(424, 338, 70, 70);
		button_22.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_22);
		
		Button button_23 = new Button("Feld 23");
		button_23.setBounds(514, 338, 70, 70);
		button_23.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_23);
		
		Button button_24 = new Button("Feld 24");
		button_24.setBounds(604, 338, 70, 70);
		button_24.setForeground(new Color(0, 0, 0));
		getContentPane().add(button_24);
		
		//Farben der Felder auf Spieler anpassen
			//button_10.setBackground(UIManager.getColor("Button.background"));

		
		
		//Hintergrund
		JLabel lbl_background = new JLabel("");
		lbl_background.setIcon(new ImageIcon("C:\\Users\\Konrad-Gamer\\git\\Brettspiel_Risiko\\Brettspiel Risiko\\Image\\Risiko.jpg"));
		lbl_background.setBounds(2, 0, 800, 474);
		getContentPane().add(lbl_background);
		
		
		
		//Statistik Felder
		JLabel lblEinheiten = new JLabel("Einheiten");
		lblEinheiten.setBounds(0, 545, 90, 35);
		lblEinheiten.setBackground(SystemColor.controlHighlight);
		lblEinheiten.setOpaque(true); //Label Standard Transparenz aufheben
		lblEinheiten.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblEinheiten);
		
		JLabel lblEinheitenZahl = new JLabel("0");
		lblEinheitenZahl.setBounds(0, 580, 90, 35);
		lblEinheitenZahl.setOpaque(true);
		lblEinheitenZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblEinheitenZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblEinheitenZahl);
		
		
		JLabel lblKontinentBonus = new JLabel("Kontinent Bonus");
		lblKontinentBonus.setBounds(180, 545, 120, 35);
		lblKontinentBonus.setBackground(SystemColor.controlHighlight);
		lblKontinentBonus.setOpaque(true);
		lblKontinentBonus.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblKontinentBonus);
		
		JLabel lblKontinentBonusZahl = new JLabel("0");
		lblKontinentBonusZahl.setBounds(180, 580, 120, 35);
		lblKontinentBonusZahl.setOpaque(true);
		lblKontinentBonusZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblKontinentBonusZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblKontinentBonusZahl);
		
		
		JLabel lblLaender = new JLabel("L\u00E4nder");
		lblLaender.setBounds(90, 545, 90, 35);
		lblLaender.setBackground(SystemColor.controlHighlight);
		lblLaender.setOpaque(true);
		lblLaender.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblLaender);
		
		JLabel lblLaenderZahl = new JLabel("0");
		lblLaenderZahl.setBounds(90, 580, 90, 35);
		lblLaenderZahl.setOpaque(true);
		lblLaenderZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaenderZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblLaenderZahl);
		

		
		//Spielphasenwechsel Button
		JButton btnTruppenBewegen = new JButton("Truppenbewegen");
		btnTruppenBewegen.setBounds(544, 537, 140, 40);
		btnTruppenBewegen.setBackground(SystemColor.menu);
		getContentPane().add(btnTruppenBewegen);
		
		JButton btnZugBeenden = new JButton("Zug beenden");
		btnZugBeenden.setBounds(404, 577, 140, 40);
		btnZugBeenden.setBackground(SystemColor.menu);
		getContentPane().add(btnZugBeenden);
		
		JButton btnAngriff = new JButton("Angriffsphase");
		btnAngriff.setBounds(404, 537, 140, 40);
		btnAngriff.setBackground(SystemColor.menu);
		getContentPane().add(btnAngriff);
		
		
		//Spiel Men� - �ffnen des Men�s
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(684, 537, 100, 80);
		btnMenu.setBackground(SystemColor.menu);
		getContentPane().add(btnMenu);
		btnMenu.addActionListener(new ActionListener() {
			private SpielMenu menu;
			public void actionPerformed(ActionEvent e) {
				this.menu = new SpielMenu();
				menu.Menu();								
			}
		});
		
		JLabel lblAktuellePhase = new JLabel("Aktuelle Phase");
		lblAktuellePhase.setBounds(544, 577, 140, 40);
		lblAktuellePhase.setBackground(UIManager.getColor("Button.light"));
		lblAktuellePhase.setOpaque(true);
		lblAktuellePhase.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblAktuellePhase);
		
		
		//Wuerfel Ergebnisfelder
		JLabel lblDefenceWrflZahl = new JLabel("");
		lblDefenceWrflZahl.setBounds(180, 510, 120, 35);
		lblDefenceWrflZahl.setToolTipText("Beispiel: 3 5 (W\u00FCrfel 1 = 3 & W\u00FCrfel 2 = 5)");
		lblDefenceWrflZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefenceWrflZahl.setBackground(SystemColor.menu);
		lblDefenceWrflZahl.setOpaque(true);
		getContentPane().add(lblDefenceWrflZahl);
		
		JLabel lblAttackWrfelZahl = new JLabel("");
		lblAttackWrfelZahl.setBounds(180, 475, 120, 35);
		lblAttackWrfelZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttackWrfelZahl.setBackground(SystemColor.controlHighlight);
		lblAttackWrfelZahl.setOpaque(true);
		getContentPane().add(lblAttackWrfelZahl);
		
		JLabel lblWrfelErgebnissDefensive = new JLabel("W\u00FCrfel Ergebnis Defensive:");
		lblWrfelErgebnissDefensive.setBounds(0, 510, 180, 35);
		lblWrfelErgebnissDefensive.setOpaque(true);
		lblWrfelErgebnissDefensive.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrfelErgebnissDefensive.setBackground(SystemColor.control);
		getContentPane().add(lblWrfelErgebnissDefensive);
		
		JLabel lblWrfelErgebnissOffensive = new JLabel("W\u00FCrfel Ergebnis Offensive:");
		lblWrfelErgebnissOffensive.setBounds(0, 475, 180, 35);
		lblWrfelErgebnissOffensive.setOpaque(true);
		lblWrfelErgebnissOffensive.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrfelErgebnissOffensive.setBackground(SystemColor.controlHighlight);
		getContentPane().add(lblWrfelErgebnissOffensive);
		
		
		
		// Von Klasse Spiel die Spieler Namen hier ausgeben
		
		JLabel lbl_P1 = new JLabel("");
		lbl_P1.setBounds(6, 6, 57, 16);
		lbl_P1.setIcon(null);
		getContentPane().add(lbl_P1);
		lbl_P1.setText(Spiel.Name1);
		
		JLabel lbl_P2 = new JLabel("");
		lbl_P2.setBounds(6, 34, 57, 16);
		getContentPane().add(lbl_P2);
		lbl_P2.setText(Spiel.Name2);
		
		JLabel lbl_P3 = new JLabel("");
		lbl_P3.setBounds(6, 62, 57, 16);
		getContentPane().add(lbl_P3);
		lbl_P3.setText(Spiel.Name3);
		
		JLabel lbl_P4 = new JLabel("");
		lbl_P4.setBounds(6, 90, 57, 16);
		getContentPane().add(lbl_P4);
		lbl_P4.setText(Spiel.Name4);

		

		
	}
	
	public void SpielkarteSchliessen() {
		frame.dispose();
	}
}
