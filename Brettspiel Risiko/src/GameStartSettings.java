import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//Autor Jonas Behler

public class GameStartSettings {
	
	//Liste mit Feldern der Spieler
	public ArrayList<Integer> FelderP1 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP2 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP3 = new ArrayList<Integer>();
	public ArrayList<Integer> FelderP4 = new ArrayList<Integer>();
	
	
	public void Start() {
	
		//SpielKarte1 Karte = new SpielKarte1(); ////Initialisieren und Instanz erzeugen
		JOptionPane.showMessageDialog(null, "I am happy."); //Funktioniert , komme bis hier aber das Färben muss noch irgendwie gehen
		
		//SpielKarte1.button_1.setForeground(Color(2, 63, 150));
	

	}


}
