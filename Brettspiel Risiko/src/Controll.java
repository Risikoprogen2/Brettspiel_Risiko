import java.awt.Color;

// Autor Konrad Musiol
// Hier steht der Spiel ablauf drin
public class Controll {
	

Kontienet_Bonus kBonus =new Kontienet_Bonus();
Wuerfel wuerfel = new Wuerfel();
SpielKarte1 karte = new SpielKarte1();
GameStartSettings gss = new GameStartSettings();
Player player = new Player();
Spiel spiel = new Spiel();



	
	 // Klasse Start Startet die Karte und Die Start einstellungen
	void Start(){
		
		// Spielkarte öffnen
		karte.Start_SpielKarte();
		
		
		// Starteinstellungen Laden
		gss.ZuteilenSelber(); 
		
		// Den Spielablauf starten
		
		
		//Run();
	}
	
	
	// Methode Run() ist der Spielablauf und ruft die Einzelnen Phasen auf 
	void Run(){
		
		
	P_Verstärken();
	P_Angrifen();
	P_Bewegen();
	
	Playerswitch();
	
	}
	
	// Die Methode führt den Spieler wechsel durch und danach führt sie wieder die Methode Run() aus.
	void Playerswitch(){
		int k = spiel.i;
		
		if(player.PlayerID == k){
			player.PlayerID = 1;
		}else{
			player.PlayerID++;
		}
		
		Run();
	}
	
/*
 *Phasen aus Risiko 
 *
 */
	
	void P_Verstärken(){ // Zum Anfang der Runde bekommt man Einheiten. AnzTruppen = Gebiete/3 oder mindestens 3 Einheiten! 
		
		// vorläufige berechnung wie man Truppen bekommt 
		
		int Gebite = 0;
		int Truppen =0;
		double erg = 0;
		 if(Gebite <= 3){
			 
			 Truppen = Truppen +3;
			 
		 }else{
			 erg = Gebite / 3;
			 Truppen = (int) (Truppen + erg);
		 }
	}
	
	
	void P_Angrifen(){ // Angreifen. Angreifer braucht mindestens 3 Einheit. 1 muss mindestens stehen bleiben.(Optionaler Schritt)
		
	int a;
	int d;
	
	d = wuerfel.RollsDefend();
	a = wuerfel.RollsDefend();
	
	if (a>d){
		System.out.println("Win");
	}else{
		System.out.println("Lose");
	}
		
		
	}
	
	
	void P_Bewegen(){ // Truppen bewegen oder verschieben. Einmal möglich. (Optionaler Schritt)
		
	}
	
	
	
	
	
		
		
	
	
	
	
	

	void Win(){
		// Gewinner Festlegen
		
		
	}
	
	void Lose(){
		// Verlierer Rausschmeisen
	}
}
