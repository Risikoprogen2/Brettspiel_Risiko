import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.SystemColor;


//Autor: Jonas Behler


public class SpielKarte1 extends JFrame {
	static SpielKarte1 frame = new SpielKarte1();
	
	public static Button button_1 = new Button("Feld 1");


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
		setBounds(100, 100, 802, 698);
		
		getContentPane().setLayout(null);
		
		
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
		
		
		//Vorläufig:
		
		
		
		
		//Felder erstellen
		/*
		 * Jedes Feld/Button braucht noch eine Liste mit Nachbarn (arraylist)
		 * */
		
		JButton button_1 = new JButton("Feld 1");
		button_1.setBackground(SystemColor.controlHighlight);
		button_1.setBounds(152, 53, 70, 70);
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Feld 2");
		button_2.setBackground(SystemColor.controlHighlight);
		button_2.setBounds(242, 53, 70, 70);
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Feld 3");
		button_3.setBackground(SystemColor.controlHighlight);
		button_3.setBounds(332, 53, 70, 70);
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("Feld 4");
		button_4.setBackground(SystemColor.controlHighlight);
		button_4.setBounds(422, 53, 70, 70);
		button_4.setForeground(new Color(0, 0, 0));
		button_4.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("Feld 5");
		button_5.setBackground(SystemColor.controlHighlight);
		button_5.setBounds(512, 53, 70, 70);
		button_5.setForeground(new Color(0, 0, 0));
		button_5.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_5);
		
		JButton button_6 = new JButton("Feld 6");
		button_6.setBackground(SystemColor.controlHighlight);
		button_6.setBounds(602, 53, 70, 70);
		button_6.setForeground(new Color(0, 0, 0));
		button_6.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("Feld 7");
		button_7.setBackground(SystemColor.controlHighlight);
		button_7.setBounds(152, 143, 70, 70);
		button_7.setForeground(new Color(0, 0, 0));
		button_7.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("Feld 8");
		button_8.setBackground(SystemColor.controlHighlight);
		button_8.setBounds(242, 143, 70, 70);
		button_8.setForeground(new Color(0, 0, 0));
		button_8.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_8);
		
		JButton button_9 = new JButton("Feld 9");
		button_9.setBackground(SystemColor.controlHighlight);
		button_9.setBounds(332, 143, 70, 70);
		button_9.setForeground(new Color(0, 0, 0));
		button_9.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_9);
		
		JButton button_10 = new JButton("Feld 10");
		button_10.setBackground(SystemColor.controlHighlight);
		button_10.setBounds(422, 143, 70, 70);
		button_10.setForeground(new Color(0, 0, 0));
		button_10.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_10);
		
		JButton button_11 = new JButton("Feld 11");
		button_11.setBackground(SystemColor.controlHighlight);
		button_11.setBounds(512, 143, 70, 70);
		button_11.setForeground(new Color(0, 0, 0));
		button_11.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_11);
		
		JButton button_12 = new JButton("Feld 12");
		button_12.setBackground(SystemColor.controlHighlight);
		button_12.setBounds(602, 143, 70, 70);
		button_12.setForeground(new Color(0, 0, 0));
		button_12.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_12);
		
		JButton button_13 = new JButton("Feld 13");
		button_13.setBackground(SystemColor.controlHighlight);
		button_13.setBounds(152, 233, 70, 70);
		button_13.setForeground(new Color(0, 0, 0));
		button_13.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_13);
		
		JButton button_14 = new JButton("Feld 14");
		button_14.setBackground(SystemColor.controlHighlight);
		button_14.setBounds(242, 233, 70, 70);
		button_14.setForeground(new Color(0, 0, 0));
		button_14.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_14);
		
		JButton button_15 = new JButton("Feld 15");
		button_15.setBackground(SystemColor.controlHighlight);
		button_15.setBounds(332, 233, 70, 70);
		button_15.setForeground(new Color(0, 0, 0));
		button_15.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_15);
		
		JButton button_16 = new JButton("Feld 16");
		button_16.setBackground(SystemColor.controlHighlight);
		button_16.setBounds(422, 233, 70, 70);
		button_16.setForeground(new Color(0, 0, 0));
		button_16.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_16);
		
		JButton button_17 = new JButton("Feld 17");
		button_17.setBackground(SystemColor.controlHighlight);
		button_17.setBounds(512, 233, 70, 70);
		button_17.setForeground(new Color(0, 0, 0));
		button_17.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_17);
		
		JButton button_18 = new JButton("Feld 18");
		button_18.setBackground(SystemColor.controlHighlight);
		button_18.setBounds(602, 233, 70, 70);
		button_18.setForeground(new Color(0, 0, 0));
		button_18.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_18);
		
		JButton button_19 = new JButton("Feld 19");
		button_19.setBackground(SystemColor.controlHighlight);
		button_19.setBounds(152, 323, 70, 70);
		button_19.setForeground(new Color(0, 0, 0));
		button_19.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_19);
		
		JButton button_20 = new JButton("Feld 20");
		button_20.setBackground(SystemColor.controlHighlight);
		button_20.setBounds(242, 323, 70, 70);
		button_20.setForeground(new Color(0, 0, 0));
		button_20.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_20);
		
		JButton button_21 = new JButton("Feld 21");
		button_21.setBackground(SystemColor.controlHighlight);
		button_21.setBounds(332, 323, 70, 70);
		button_21.setForeground(new Color(0, 0, 0));
		button_21.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_21);
		
		JButton button_22 = new JButton("Feld 22");
		button_22.setBackground(SystemColor.controlHighlight);
		button_22.setBounds(422, 323, 70, 70);
		button_22.setForeground(new Color(0, 0, 0));
		button_22.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_22);
		
		JButton button_23 = new JButton("Feld 23");
		button_23.setBackground(SystemColor.controlHighlight);
		button_23.setBounds(512, 323, 70, 70);
		button_23.setForeground(new Color(0, 0, 0));
		button_23.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_23);
		
		JButton button_24 = new JButton("Feld 24");
		button_24.setBackground(SystemColor.controlHighlight);
		button_24.setBounds(602, 323, 70, 70);
		button_24.setForeground(new Color(0, 0, 0));
		button_24.setBorder(new LineBorder(new Color(255, 255, 0), 2));
		getContentPane().add(button_24);
		
		//Farben der Felder auf Spieler anpassen
		//button_10.setBackground(UIManager.getColor("Button.background"));

		
		
		//Hintergrund
		JLabel lbl_background = new JLabel("");
		lbl_background.setIcon(new ImageIcon(getClass().getResource("Risiko.jpg")));  //Einbinden des Hintergrundbildes
		lbl_background.setBounds(2, 0, 800, 474);
		lbl_background.setBounds(-10, 0, 794, 470);
		getContentPane().add(lbl_background);
		
		
		
		//Statistik Felder
		JLabel lblEinheiten = new JLabel("Einheiten");
		lblEinheiten.setBounds(0, 580, 90, 35);
		lblEinheiten.setBackground(SystemColor.controlHighlight);
		lblEinheiten.setOpaque(true); //Label Standard Transparenz aufheben
		lblEinheiten.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblEinheiten);
		
		JLabel lblEinheitenZahl = new JLabel("0");
		lblEinheitenZahl.setBounds(0, 615, 90, 35);
		lblEinheitenZahl.setOpaque(true);
		lblEinheitenZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblEinheitenZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblEinheitenZahl);
		
		
		JLabel lblKontinentBonus = new JLabel("Kontinent Bonus");
		lblKontinentBonus.setBounds(180, 580, 120, 35);
		lblKontinentBonus.setBackground(SystemColor.controlHighlight);
		lblKontinentBonus.setOpaque(true);
		lblKontinentBonus.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblKontinentBonus);
		
		JLabel lblKontinentBonusZahl = new JLabel("0");
		lblKontinentBonusZahl.setBounds(180, 615, 120, 35);
		lblKontinentBonusZahl.setOpaque(true);
		lblKontinentBonusZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblKontinentBonusZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblKontinentBonusZahl);
		
		
		JLabel lblLaender = new JLabel("L\u00E4nder");
		lblLaender.setBounds(90, 580, 90, 35);
		lblLaender.setBackground(SystemColor.controlHighlight);
		lblLaender.setOpaque(true);
		lblLaender.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblLaender);
		
		JLabel lblLaenderZahl = new JLabel("0");
		lblLaenderZahl.setBounds(90, 615, 90, 35);
		lblLaenderZahl.setOpaque(true);
		lblLaenderZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaenderZahl.setBackground(SystemColor.menu);
		getContentPane().add(lblLaenderZahl);
		

		
		//Spielphasenwechsel Button
		JButton btnTruppenBewegen = new JButton("Truppenbewegen");
		btnTruppenBewegen.setBounds(549, 570, 135, 40);
		btnTruppenBewegen.setBackground(SystemColor.menu);
		getContentPane().add(btnTruppenBewegen);
		
		JButton btnZugBeenden = new JButton("Zug beenden");
		btnZugBeenden.setBounds(425, 610, 125, 40);
		btnZugBeenden.setBackground(SystemColor.menu);
		getContentPane().add(btnZugBeenden);
		
		JButton btnAngriff = new JButton("Angriffsphase");
		btnAngriff.setBounds(425, 570, 125, 40);
		btnAngriff.setBackground(SystemColor.menu);
		getContentPane().add(btnAngriff);
		
		
		//Spiel Menï¿½ - ï¿½ffnen des Menï¿½s
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(684, 570, 100, 80);
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
		lblAktuellePhase.setBounds(549, 610, 135, 40);
		lblAktuellePhase.setBackground(UIManager.getColor("Button.light"));
		lblAktuellePhase.setOpaque(true);
		lblAktuellePhase.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblAktuellePhase);
		
		
		//Wuerfel Ergebnisfelder
		JLabel lblDefenceWrflZahl = new JLabel("");
		lblDefenceWrflZahl.setBounds(180, 545, 120, 35);
		lblDefenceWrflZahl.setToolTipText("Beispiel: 3 5 (W\u00FCrfel 1 = 3 & W\u00FCrfel 2 = 5)");
		lblDefenceWrflZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblDefenceWrflZahl.setBackground(SystemColor.menu);
		lblDefenceWrflZahl.setOpaque(true);
		getContentPane().add(lblDefenceWrflZahl);
		
		JLabel lblAttackWrfelZahl = new JLabel("");
		lblAttackWrfelZahl.setBounds(180, 510, 120, 35);
		lblAttackWrfelZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttackWrfelZahl.setBackground(SystemColor.controlHighlight);
		lblAttackWrfelZahl.setOpaque(true);
		getContentPane().add(lblAttackWrfelZahl);
		
		JLabel lblWrfelErgebnissDefensive = new JLabel("W\u00FCrfel Ergebnis Defensive:");
		lblWrfelErgebnissDefensive.setBounds(0, 545, 180, 35);
		lblWrfelErgebnissDefensive.setOpaque(true);
		lblWrfelErgebnissDefensive.setHorizontalAlignment(SwingConstants.CENTER);
		lblWrfelErgebnissDefensive.setBackground(SystemColor.control);
		getContentPane().add(lblWrfelErgebnissDefensive);
		
		JLabel lblWrfelErgebnissOffensive = new JLabel("W\u00FCrfel Ergebnis Offensive:");
		lblWrfelErgebnissOffensive.setBounds(0, 510, 180, 35);
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
		
		JLabel lblAktuellerSpieler = new JLabel("Aktueller Spieler");
		lblAktuellerSpieler.setBackground(SystemColor.menu);
		lblAktuellerSpieler.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktuellerSpieler.setBounds(0, 475, 125, 35);
		lblAktuellerSpieler.setOpaque(true);
		getContentPane().add(lblAktuellerSpieler);
		
		JLabel lblVerstaerkung = new JLabel("Verst\u00E4rkung");
		lblVerstaerkung.setOpaque(true);
		lblVerstaerkung.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerstaerkung.setBackground(SystemColor.controlHighlight);
		lblVerstaerkung.setBounds(300, 580, 125, 35);
		getContentPane().add(lblVerstaerkung);
		
		JLabel lblVerstaerkungZahl = new JLabel("0");
		lblVerstaerkungZahl.setOpaque(true);
		lblVerstaerkungZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblVerstaerkungZahl.setBackground(SystemColor.menu);
		lblVerstaerkungZahl.setBounds(300, 615, 125, 35);
		getContentPane().add(lblVerstaerkungZahl);

		
		//Aufruf der StartSettings - Felder zuweisen/einteilen
		GameStartSettings startSettings = new GameStartSettings();
		startSettings.Start();	
		
	}
	
	public void SpielkarteSchliessen() {
		frame.dispose();
	}
}
