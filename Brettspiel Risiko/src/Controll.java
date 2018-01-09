// Autor Konrad Musiol
// Hier steht der Spiel ablauf drin
public class Controll {
	

Kontienet_Bonus kBonus =new Kontienet_Bonus();
// Wuerfel wuerfel = new Wuerfel(); -> Erstmal Rauskommentieren, weil fehler
SpielKarte1 karte = new SpielKarte1();
GameStartSettings gss = new GameStartSettings();

	
	 // Klasse Start Startet die Karte und Die Start einstellungen
	void Start(){
		// Spielkarte öffnen
		karte.Start_SpielKarte();
		
		// Starteinstellungen Laden
		gss.Start(); 
	
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
	
// Konstruktor
	public Controll(){
		
		
		
	}
		

}
