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

	/**
	 * Methode zum starten des Spielbrett's
	 */
	public static void Start_SpielKarte() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpielKarte1 frame = new SpielKarte1();
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
		setBounds(100, 100, 802, 645);
		getContentPane().setLayout(null);
		
		
		
		//Schleife zum Felder generieren
		/*
		int kordx = 130;
		int kordy = 40;
		int zaehler = 0;
		for(int i= 1; 1<=20; i++)
		{
			Button button_[i] = new Button("Feld " + [i];
			button_[i].setBounds(130, 40, 80, 80);
			getContentPane().add(button_[i]);
			zaehler++;
			
			if(kordx <= 610)
			{
				kordx = 130;
				kordy = kordy + 100;
			}
		}*/
		
		
		//Vorläufig:
		
		
		//Felder erstellen
		Button button_1 = new Button("Feld 1");
		button_1.setBounds(132, 69, 70, 70);
		getContentPane().add(button_1);
		
		Button button_2 = new Button("Feld 2");
		button_2.setBounds(222, 69, 70, 70);
		getContentPane().add(button_2);
		
		Button button_3 = new Button("Feld 3");
		button_3.setBounds(312, 69, 70, 70);
		getContentPane().add(button_3);
		
		Button button_4 = new Button("Feld 4");
		button_4.setBounds(402, 69, 70, 70);
		getContentPane().add(button_4);
		
		Button button_5 = new Button("Feld 5");
		button_5.setBounds(492, 69, 70, 70);
		getContentPane().add(button_5);
		
		Button button_6 = new Button("Feld 6");
		button_6.setBounds(582, 69, 70, 70);
		getContentPane().add(button_6);
		
		Button button_7 = new Button("Feld 7");
		button_7.setBounds(132, 159, 70, 70);
		getContentPane().add(button_7);
		
		Button button_8 = new Button("Feld 8");
		button_8.setBounds(222, 159, 70, 70);
		getContentPane().add(button_8);
		
		Button button_9 = new Button("Feld 9");
		button_9.setBounds(312, 159, 70, 70);
		getContentPane().add(button_9);
		
		Button button_10 = new Button("Feld 10");
		button_10.setBounds(402, 159, 70, 70);
		getContentPane().add(button_10);
		
		Button button_11 = new Button("Feld 11");
		button_11.setBounds(492, 159, 70, 70);
		getContentPane().add(button_11);
		
		Button button_12 = new Button("Feld 12");
		button_12.setBounds(582, 159, 70, 70);
		getContentPane().add(button_12);
		
		Button button_13 = new Button("Feld 13");
		button_13.setBounds(132, 249, 70, 70);
		getContentPane().add(button_13);
		
		Button button_14 = new Button("Feld 14");
		button_14.setBounds(222, 249, 70, 70);
		getContentPane().add(button_14);
		
		Button button_15 = new Button("Feld 15");
		button_15.setBounds(312, 249, 70, 70);
		getContentPane().add(button_15);
		
		Button button_16 = new Button("Feld 16");
		button_16.setBounds(402, 249, 70, 70);
		getContentPane().add(button_16);
		
		Button button_17 = new Button("Feld 17");
		button_17.setBounds(492, 249, 70, 70);
		getContentPane().add(button_17);
		
		Button button_18 = new Button("Feld 18");
		button_18.setBounds(582, 249, 70, 70);
		getContentPane().add(button_18);
		
		Button button_19 = new Button("Feld 19");
		button_19.setBounds(132, 339, 70, 70);
		getContentPane().add(button_19);
		
		Button button_20 = new Button("Feld 20");
		button_20.setBounds(222, 339, 70, 70);
		getContentPane().add(button_20);
		
		Button button_21 = new Button("Feld 21");
		button_21.setBounds(312, 339, 70, 70);
		getContentPane().add(button_21);
		
		Button button_22 = new Button("Feld 22");
		button_22.setBounds(402, 339, 70, 70);
		getContentPane().add(button_22);
		
		Button button_23 = new Button("Feld 23");
		button_23.setBounds(492, 339, 70, 70);
		getContentPane().add(button_23);
		
		Button button_24 = new Button("Feld 24");
		button_24.setForeground(SystemColor.desktop);
		button_24.setBounds(582, 339, 70, 70);
		getContentPane().add(button_24);
		
		//Farben der Felder auf Spieler anpassen
		button_1.setBackground(UIManager.getColor("Button.background"));
		button_10.setBackground(UIManager.getColor("Button.background"));
		button_18.setBackground(UIManager.getColor("Button.background"));
		button_7.setBackground(UIManager.getColor("Button.background"));
		
		
		//Hintergrund
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Jonas\\OneDrive\\Hochschule Ostwestfalen-Lippe\\2. Programmieren II\\Projekt\\Brettspiel_Risiko\\Brettspiel Risiko\\Image\\Risiko.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 518);
		getContentPane().add(lblNewLabel);
		
		
		//Statistik Felder
		JLabel lblEinheiten = new JLabel("Einheiten");
		lblEinheiten.setBackground(UIManager.getColor("Button.light"));
		lblEinheiten.setOpaque(true); //Label Standard Transparenz aufheben
		lblEinheiten.setHorizontalAlignment(SwingConstants.CENTER);
		lblEinheiten.setBounds(0, 518, 120, 40);
		getContentPane().add(lblEinheiten);
		
		JLabel lblEinheitenZahl = new JLabel("0");
		lblEinheitenZahl.setOpaque(true);
		lblEinheitenZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblEinheitenZahl.setBackground(SystemColor.menu);
		lblEinheitenZahl.setBounds(0, 558, 120, 40);
		getContentPane().add(lblEinheitenZahl);
		
		
		JLabel lblKontinentBonus = new JLabel("Kontinent Bonus");
		lblKontinentBonus.setBackground(UIManager.getColor("Button.light"));
		lblKontinentBonus.setOpaque(true);
		lblKontinentBonus.setHorizontalAlignment(SwingConstants.CENTER);
		lblKontinentBonus.setBounds(240, 518, 120, 40);
		getContentPane().add(lblKontinentBonus);
		
		JLabel lblKontinentBonusZahl = new JLabel("0");
		lblKontinentBonusZahl.setOpaque(true);
		lblKontinentBonusZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblKontinentBonusZahl.setBackground(SystemColor.menu);
		lblKontinentBonusZahl.setBounds(240, 558, 120, 40);
		getContentPane().add(lblKontinentBonusZahl);
		
		
		JLabel lblLaender = new JLabel("L\u00E4nder");
		lblLaender.setBackground(UIManager.getColor("Button.light"));
		lblLaender.setOpaque(true);
		lblLaender.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaender.setBounds(120, 518, 120, 40);
		getContentPane().add(lblLaender);
		
		JLabel lblLaenderZahl = new JLabel("0");
		lblLaenderZahl.setOpaque(true);
		lblLaenderZahl.setHorizontalAlignment(SwingConstants.CENTER);
		lblLaenderZahl.setBackground(SystemColor.menu);
		lblLaenderZahl.setBounds(120, 558, 120, 40);
		getContentPane().add(lblLaenderZahl);
		

		
		//Spielphasenwechsel Button
		JButton btnTruppenBewegen = new JButton("Truppenbewegen");
		btnTruppenBewegen.setBounds(534, 518, 150, 40);
		getContentPane().add(btnTruppenBewegen);
		
		JButton btnZugBeenden = new JButton("Zug beenden");
		btnZugBeenden.setBackground(UIManager.getColor("Button.background"));
		btnZugBeenden.setBounds(387, 558, 150, 40);
		getContentPane().add(btnZugBeenden);
		
		JButton btnAngriff = new JButton("Angriffsphase");
		btnAngriff.setBackground(UIManager.getColor("Button.background"));
		btnAngriff.setBounds(387, 518, 150, 40);
		getContentPane().add(btnAngriff);
		
		
		//Spiel Menü - öffnen des Menüs
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(684, 518, 100, 80);
		getContentPane().add(btnMenu);
		
		JLabel lblAktuellePhase = new JLabel("Aktuelle Phase");
		lblAktuellePhase.setBackground(UIManager.getColor("Button.light"));
		lblAktuellePhase.setOpaque(true);
		lblAktuellePhase.setHorizontalAlignment(SwingConstants.CENTER);
		lblAktuellePhase.setBounds(534, 558, 150, 40);
		getContentPane().add(lblAktuellePhase);
		

		
		btnMenu.addActionListener(new ActionListener() {
			private SpielMenu menu;
			public void actionPerformed(ActionEvent e) {
				this.menu = new SpielMenu();
				menu.Menu();								
			}
		});
				
	}		
}
