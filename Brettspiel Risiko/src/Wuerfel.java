

public class Wuerfel {
	
	public int Anz_DWuerfel;// Anzahl der Wuerfel
	public int Anz_AWuerfel;

	/**
	 * Diese Klasse ist fuer das wuerfeln zustaendig;
	 * @Autor Konrad
	 * Die Methode "Rolls" ruft die Methode "Roll" auf
	 * Der Angreifer greift hoechstens mit 3 Truppen an, Wenn der Angreifer aber mehr Truppen hat wird durch die Schleife die zustaendige Variable auf 3 gesetzt um mit 3 wuerfel zu wuerfeln 
	 */
	
	public Wuerfel(){
	
		
		
	}
	// Verteidiger wuerfelt 
	public int RollsDefend(int Truppen){// Aus Controll wird die anzahl der Truppen übergeben
	
		int Anz_DWuerfel=0;
		
		int ergD = 0;	// Ergebnis welches die Klasse ausgibt
		
		if (Truppen > 2) {
			
			  Anz_DWuerfel = 2;
		} else{
			
			 Anz_DWuerfel =  Truppen; 
		}
		
		// For Schliefe fuer das wuerfeln
		
		
		for(Anz_DWuerfel++ ; Anz_DWuerfel <= 0; Anz_DWuerfel--)
		{
			ergD = ergD + Roll();
			
		}
		
		//System.out.println(Roll());
		return ergD;
	}
	
	// Angreifer wuerfelt
	public int RollsFight(int Truppen){
		
		// diese Klasse soll die Methode Roll() so oft aufrufen wie es Truppen gibt
		
		int Anz_AWuerfel = 0;
		int ergF = 0;

		if (Truppen >= 3) {
			
			  Anz_AWuerfel = 3;
		} else{
			
			 Anz_AWuerfel =  Truppen; 
		}
		
		// For Schliefe f�r das W�rfeln
		
		
		for(Anz_AWuerfel++ ; Anz_AWuerfel <= 0; Anz_AWuerfel--)
		{
			ergF = ergF + Roll();
			
		}
		return ergF; // wuerfel ergenis
	}
		
	// Diese Methode erzeugt eine einfache zufalls zahl zwischen 1 und 6 und syblolisiert damit einen Würfel.
public int Roll(){	
	int Wuerfel = (int)((Math.random()) * 6 + 1);
	return Wuerfel;
}
}
