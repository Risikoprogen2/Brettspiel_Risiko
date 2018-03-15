//Autor Jonas Behler

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class GameStartSettings {
	
	//Liste mit Feldern der Spieler
	public ArrayList<Integer> FelderP1 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP2 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP3 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP4 = new ArrayList<Integer>();
	
	
	public void ZuteilenSelber() {
		
		//Probieren Felder zu färben
		SpielKarte1 Karte = new SpielKarte1();
		//Karte = new SpielKarte1();
			//SpielKarte1 Karte = new SpielKarte1(); //Initialisieren und Instanz erzeugen
		
		//SpielKarte1.button_1.setBackground(new Color(255, 255, 255));
		
		
		//Felder selber zuteilen
		/* So Funktioniert es in der Klasse Spielkarte
		 * wie kann man diese Funktion in dieser Klasse nun anwenden??
		 * Komme ich überhaupt in diese Klasse damit ich ich den button färben kann ?
		 * muss ich vllt aus Spielkarte1 hierhin kommen ?
		 * vllt alles von hier noch Spielkarte verlagen wenn es anders nicht geht ?
		 * 
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				button_2.setBackground(Color.RED);
				}
		});
		
		*/
		Karte.button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Karte.button_2.setBackground(Color.RED);
				}
		});
		
		
	}


}
