// Autor Konrad Musiol
// Hier steht der Spiel ablauf drin
public class Controll {
	

Kontienet_Bonus kBonus =new Kontienet_Bonus();
//Wuerfel wuerfel = new Wuerfel();
SpielKarte1 karte = new SpielKarte1();
GameStartSettings gss = new GameStartSettings();


	
	 // Klasse Start Startet die Karte und Die Start einstellungen
	void Start(){
		
		// Spielkarte öffnen
		karte.Start_SpielKarte();
		
		// Starteinstellungen Laden
		gss.Start(); 
		
		// Den Spielablauf starten
		Run();
	}
	
	
	// Der Eintlicher Spielablauf ruft die Einzelnen Methoden auf 
	
	/*
	 * Alls erstest werden hier die Einzelnen Methoden drin stehen sowie das spiel ablaufen soll 
	 * 
	 */
	void Run(){
		
		
		
		
		
		
		
		
		
	}
	

	
	
	// Risiko nochmal spielen..... Danach nochmal die klassen erstellen....
	
	void AtackOrMove(){
		// Zum Anfang kann man wählen ob man erst Truppen verschieben möchte oder sofort angreine will
	}
	
	
	void PhaseW(){
		// Der Phasen Wechsel
		
		
		
		
	}
	
	
	void Win(){
		// Gewinner Festlegen
		
		
	}
	
	void lose(){
		// Verlierer Rausschmeisen
		
		
	}
	
	void Playerswitch(){
		
		
		
		
	}
	
	

		

}
