

public class Wuerfel extends Controll {
	


	/**
	 * Diese Klasse ist f�r das w�rfeln zust�ndig;
	 * 
	 * Die Methode "Rolls" ruft die Methode "Roll" auf
	 * Der Angreifer w�rfelt h�chstens 3 mal (Risiko Regeln) Wenn der Angreifer aber mehr Truppen hat wird durch die Schleife die zust�ndige Variable auf 3 gesetzt um 3 mal zu w�rfeln
	 * 
	 * 
	 * ES Fehlt NOCH : 
	 * 				   -die Entsprechen Variable mit der Truppen anzahl vom Spielablauf
	 * 				   - Testen
	 */
	
	public Wuerfel(){
		
		int Wuerfel;
		int Truppen;
		int Anz_Wuerfel;

	}
	// Verteidiger w�rfelt 
	public int RollsDefend(){
		
		int Truppen = 0;
		int Anz_Wuerfel = 0;
		int ergD = 0;
		
		if (Truppen > 2) {
			
			  Anz_Wuerfel = 2;
		} else{
			
			 Anz_Wuerfel =  Truppen; 
		}
		
		// For Schliefe f�r das W�rfeln
		
		
		for(Anz_Wuerfel++ ; Anz_Wuerfel <= 0; Anz_Wuerfel--)
		{
			ergD = ergD + Roll();
			
		}
		
		//System.out.println(Roll());
		return ergD;
	}
	
	// Angreifer W�rfelt
	public int RollsFight(){
		
		// diese Klasse soll die Methode Roll() so oft aufrufen wie es Truppen gibt
		
		// Die Variable int i muss noch abgeändert werden damit das richtig funktioniert.
		int Truppen = 0;
		int Anz_Wuerfel = 0;
		int ergF = 0;

		if (Truppen >= 3) {
			
			  Anz_Wuerfel = 3;
		} else{
			
			 Anz_Wuerfel =  Truppen; 
		}
		
		// For Schliefe f�r das W�rfeln
		
		
		for(Anz_Wuerfel++ ; Anz_Wuerfel <= 0; Anz_Wuerfel--)
		{
			ergF = ergF + Roll();
			
		}
		
		//System.out.println(Roll());
		return ergF;
	}
	
	
	// Diese Methode erzeugt eine einfache zufalls zahl zwischen 1 und 6 und syblolisiert damit einen Würfel.
public int Roll(){	
	int Wuerfel = (int)((Math.random()) * 6 + 1);
	return Wuerfel;
}
	
	
	
	
}
