import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;

// Autor Konrad Musiol
// Hier steht der Spiel ablauf drin
public class Controll {
	
	
// Klassen Instanzen
Kontienet_Bonus kBonus =new Kontienet_Bonus();
Wuerfel wuerfel = new Wuerfel();
SpielKarte1 karte = new SpielKarte1();
GameStartSettings gss = new GameStartSettings();
Player player = new Player(); // Daten vom Aktuelllen Spieler werden hier rein geladen.
Spiel spiel = new Spiel();



  
public int phase = 0;


public ArrayList<Integer> FelderP1 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP2 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP3 = new ArrayList<Integer>();
public ArrayList<Integer> FelderP4 = new ArrayList<Integer>();

	
	// Variablen Initialisieren

//Um nicht unnoetig Instanzen zu erstellen habe ich diese in Methoden gepackt die weiter unten in einem entsprechenden switch case abfrage ausgeführt werden
void ZweiIni(){
	Player player1 = new Player();
	Player player2 = new Player();
	
}
void DreiIni(){
	Player player3 = new Player();
}
void VierIni(){
	Player player4 = new Player();
}

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



	 // Klasse Start Startet die Karte und Die Start einstellungen
	void Start(){
		
		// Spielkarte öffnen
		karte.Start_SpielKarte();
		

		// Starteinstellungen Laden
		if(spiel.selected == true){
		karte.ZuteilenSelber();
		}else{karte.Autozuteilen();}
		
		// Den Spielablauf starten
		
		P_Verstaerken();
		
		
	}
	
	
	// Methode Run() ist der Spielablauf und ruft die Einzelnen Phasen auf 
	void Run(){
		System.out.println("Bin in run");
		
	/*
	 * 	 Switchcase falls man die ganzen Phasen über ein Button endern wollen würde 
	 
	switch(phase++){
	
	case 0: // Phase Verstärken
		P_Verstaerken(); // Ausfuehren der Phase
		System.out.println("war ich hier überhaup0t?	" +phase);
	
	break;
	
	case 1:// Phase Angreifen
		P_Angrifen();			
		System.out.println("war ich hier überhaupt1?	" +phase);

	break;
	
	case 2: // Phase Bewegen
		P_Bewegen();			
		System.out.println("war ich hier überhaupt2?	" +phase);

	break;
	
	case 3: // Spieler wechsel und Variable phase auf 0 Setzen
		Playerswitch();			
		System.out.println("war ich hier überhaupt3?	" +phase);
		
		phase = 0;
	break;
	}
	*/
}
	
	// Die Methode führt den Spieler wechsel durch und danach führt sie wieder die Methode Run() aus.
	void Playerswitch(){
		int k = spiel.anz_Player;// Die Anzahl der Spiler aus der Variable anz_Player in Variable k speichern
		
		if(player.PlayerID == k){
			player.PlayerID = 1;
		}else{
			player.PlayerID++;
		}
		
		System.out.println("im Switch");
	}
	
/*
 *Phasen aus Risiko 
 *
 */
	
	
	void P_Verstaerken(){ // Zum Anfang der Runde bekommt man Einheiten. AnzTruppen = Gebiete/3 oder mindestens 3 Einheiten! 
		
		// vorläufige berechnung wie man Truppen bekommt 
		
	//	karte.VerstaerkenMenu();
		
		int Gebite = 0;
		int Truppen =0;
		double erg = 0;
		 if(Gebite <= 3){
			 
			 Truppen = Truppen +3;
			 
		 }else{
			 erg = Gebite / 3;
			 Truppen = (int) (Truppen + erg);
		 }
		 
		 
	
	System.out.println("in Verstärken");
	
	
	
	
	
	}
	
	
	void P_Angrifen(){ // Angreifen. Angreifer braucht mindestens 3 Einheit. 1 muss mindestens stehen bleiben.(Optionaler Schritt)
		
	int a = 0;
	int d;
	int Truppen = 0;
	
	
	d = wuerfel.RollsDefend(Truppen);
	a = wuerfel.RollsFight(Truppen);
	
	if (a>d){
		System.out.println("Win");
	}else{
		System.out.println("Lose");
	}
		
	System.out.println("in Angrif");
	}
	
	
	void P_Bewegen(){ // Truppen bewegen oder verschieben. Einmal möglich. (Optionaler Schritt)
		
		System.out.println("in Bewegen");
	}
	
	
	
	
	
		
		
	
	
	
	
	

	void Win(){
		// Gewinner Festlegen
		
		
	if(player.Anz_Land == 26){
		System.out.println("Herzlichen Glückwunsch " + player.Name + ". Du bist der Gewinner"); // Das in eine Massagebox Paken und bei Klicken von "ok" das ganze Programm schlißen
		
	}
		
	}
	
	void Lose(){
		// Verlierer Rausschmeisen
	}
}
