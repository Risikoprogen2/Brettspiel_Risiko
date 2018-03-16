import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;

// @Autor Konrad Musiol
// Die Klasse Controll soll alls steuernde Klasse dienen
public class Controll {
	
	
// Klassen Instanzen
Kontienet_Bonus kBonus =new Kontienet_Bonus();
Wuerfel wuerfel = new Wuerfel();
SpielKarte1 karte = new SpielKarte1();
GameStartSettings gss = new GameStartSettings();
Spiel spiel = new Spiel();

// Player instanzen erzeugen
Player player = new Player(); // Daten vom Aktuelllen Spieler werden hier rein geladen.
Player player1 = new Player();
Player player2 = new Player();
Player player3 = new Player();
Player player4 = new Player();
  

public ArrayList<Integer> FelderP1 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP2 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP3 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP4 = new ArrayList<Integer>();

	



void Anz_Player(){
	int inPlay = spiel.i; //Variable i aus Spiel mit der ich die Anzahl der Spieler bestimmt habe
	switch(inPlay){ //Switchcase welches die entsprechenden Methoden zum Instanzen erzeugen ausführt
	case 0:{ 
				ZweiIni();
	} 
	case 1:{
				ZweiIni();
				DreiIni();
	}
	case 2:{
				ZweiIni();
				DreiIni();
				VierIni();
	}
		
	}
}
//Spieler Daten Eingeben
	void ZweiIni(){
		player1.Name = Spiel.Name1;
		player1.PlayerID = 1;
		player2.Name = Spiel.Name2;
		player2.PlayerID = 2;
	}
	void DreiIni(){
		player3.Name = Spiel.Name3;
		player3.PlayerID = 3;
	}
	void VierIni(){
		player4.Name = Spiel.Name4;
		player4.PlayerID = 4;
	}


	 // Klasse Start Startet die Karte und Die Start einstellungen
	void Start(){
		
		// Spielkarte öffnen
		karte.Start_SpielKarte();
	

		// Starteinstellungen Laden
		if(spiel.selected == true){
		karte.ZuteilenSelber();
		}else{karte.Autozuteilen();}
		
		// Den Spielablauf starten
			//Run();
		P_Verstaerken();
		
		
	}
	
	/*
	 public int phase;
	 
	// Methode Run() ist der Spielablauf und ruft die Einzelnen Phasen auf 
	void Run(){
		
	  	// Switchcase falls man die ganzen Phasen über ein Button endern wollen würde 
	 
	switch(phase++){
	
	case 0: // Phase Verstärken
		P_Verstaerken(); // Ausfuehren der Phase
	break;
	
	case 1:// Phase Angreifen
		P_Angrifen();			
	break;
	
	case 2: // Phase Bewegen
		P_Bewegen();			
	break;
	
	case 3: // Spieler wechsel und Variable phase auf 0 Setzen
		Playerswitch();			
		phase = 0;
	break;
	}
	*/
	

/*
 *Phasen aus Risiko 
 */
	
	
	void P_Verstaerken(){ // Zum Anfang der Runde bekommt man Einheiten. AnzTruppen = Gebiete/3 oder mindestens 3 Einheiten! 
	//	karte.VerstaerkenMenu();	// Menu das die Spielkarte anpasst
		double erg = 0;
		 if(player.Anz_Land <= 3){
			 player.Anz_Truppen = player.Anz_Truppen +3;
		 }else{
			 erg = player.Anz_Land / 3;
			 player.Anz_Truppen = (int) (player.Anz_Truppen + erg);
		 }
	}
	
	void P_Angrifen(){ // Angreifen. Angreifer braucht mindestens 3 Einheit. 1 muss mindestens stehen bleiben.(Optionaler Schritt)
		//karte.AngriffMenu(); 	
	int a = player.Anz_Truppen; //a = atack: hier muss die Variabe hin für die anzahl der auf dem Feld verfuegbaren einheiten des Angreifers
	int d = 0; // d = defend: hier muss die Variabe hin für die anzahl der auf dem Feld verfuegbaren einheiten des Verteitigers
	
	d = wuerfel.RollsDefend(d);
	a = wuerfel.RollsFight(a);
	
	if (a>d){
		System.out.println("Win");// Hier muss eine methode hin zum übernehmen von dem angegriffenen Feld
	}else{
		System.out.println("Lose");// 
	}
		Win(); // Nach jedem Angriff pruefen ob es einen Gewinner gibt	
		Lose(); // Nach jedem Angriff pruefen ob es einen Verlierer gibt	
	}
	
	void P_Bewegen(){ // Truppen bewegen oder verschieben. Einmal möglich. (Optionaler Schritt)
		
		// Hier sollte eine methode drin stehen die es dem Spieler erlaubt Einheiten von einem Feld auf ein anderes Feld zu verschieben
	}
	
	void Win(){// Gewinner Festlegen
	if(player.Anz_Land == 26){ // Wenn der Spieler alle Felder besitzt gewinnt er.
		System.out.println("Herzlichen Glückwunsch " + player.Name + ". Du bist der Gewinner"); 
		//exit
	}}
	
	void Lose(){// Verlierer Rausschmeisen
		if (player1.Anz_Land == 0)// Alle Spieler auf Land besitz pruefen
		{// wenn ein Spieler kein Land mehr besitzt muss er aus vom Spielablauf ausgeschlossen werden und hat somit Verloren
	}}
	
	// Die Methode führt den Spieler wechsel durch und danach führt sie wieder die Methode Run() aus.
		void Playerswitch(){
			int k = spiel.anz_Player;// Die Anzahl der Spiler aus der Variable anz_Player in Variable k speichern
			
			switch(k){
			// Durch diese Switch case abfrage werden Methoden aufgerufen die entsprechende Spielstaende speichern soll und die naechsten laden sollen
			case 1:
				SaveP1();
			case 2:
				SaveP2();
			case 3:
				SaveP3();
			case 4:
				SaveP4();
			}
			if(player.PlayerID == k){
				player.PlayerID = 1;
			}else{
				player.PlayerID++;
			}	
		}
		void SaveP1(){// Speichern von Spielstand von Player1 und laden vom Spielstand von Player2
			player1.Anz_Kontienent = player.Anz_Kontienent;
			player1.Anz_Kontienent = player.Anz_Kontienent;
		
			player.Anz_Kontienent = player2.Anz_Kontienent;
			player.Anz_Kontienent = player2.Anz_Kontienent;
		}
		
		void SaveP2(){
			player2.Anz_Kontienent = player.Anz_Kontienent;
			player2.Anz_Kontienent = player.Anz_Kontienent;
			
			player.Anz_Kontienent = player3.Anz_Kontienent;
			player.Anz_Kontienent = player3.Anz_Kontienent;
			}
		void SaveP3(){
			player3.Anz_Kontienent = player.Anz_Kontienent;
			player3.Anz_Kontienent = player.Anz_Kontienent;
			
			player.Anz_Kontienent = player4.Anz_Kontienent;
			player.Anz_Kontienent = player4.Anz_Kontienent;
			}
		
		void SaveP4(){
			player4.Anz_Kontienent = player.Anz_Kontienent;
			player4.Anz_Kontienent = player.Anz_Kontienent;
			
			player.Anz_Kontienent = player1.Anz_Kontienent;
			player.Anz_Kontienent = player1.Anz_Kontienent;
			}	
}
