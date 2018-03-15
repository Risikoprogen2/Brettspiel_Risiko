//Autor Jonas Behler

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

public class GameStartSettings {
	
	//Liste mit Feldern der Spieler
	public ArrayList<Integer> FelderP1 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP2 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP3 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP4 = new ArrayList<Integer>();
	
	
	public void Start() {
	
		SpielKarte1 Karte;
		Karte = new SpielKarte1();
			//SpielKarte1 Karte = new SpielKarte1(); //Initialisieren und Instanz erzeugen
		
		SpielKarte1.button_1.setBackground(new Color(255, 255, 255));
		Karte.button_2.setBackground(new Color(255, 5, 67));
	}


}
