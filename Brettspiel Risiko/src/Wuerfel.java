

public class Wuerfel extends Controll {
	


	/**
	 * Diese Klasse ist für das würfeln zuständig;
	 * 
	 * Die Methode "Rolls" ruft die Methode "Roll" auf
	 * Der Angreifer würfelt höchstens 3 mal (Risiko Regeln) Wenn der Angreifer aber mehr Truppen hat wird durch die Schleife die zuständige Variable auf 3 gesetzt um 3 mal zu würfeln
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
	// Verteidiger würfelt 
	public void RollsDefend(){
		
		int Truppen = 0;
		int Anz_Wuerfel = 0;

		if (Truppen > 2) {
			
			  Anz_Wuerfel = 2;
		} else{
			
			 Anz_Wuerfel =  Truppen; 
		}
		
		// For Schliefe für das Würfeln
		
		
		for(Anz_Wuerfel++ ; Anz_Wuerfel <= 0; Anz_Wuerfel--)
		{
			 Roll();
			
		}
		
	}
	
	// Angreifer Würfelt
	public void RollsFight(){
		
		// diese Klasse soll die Methode Roll() so oft aufrufen wie es Truppen gibt
		
		// Die Variable int i muss noch abgeÃ¤ndert werden damit das richtig funktioniert.
		int Truppen = 0;
		int Anz_Wuerfel = 0;

		if (Truppen >= 3) {
			
			  Anz_Wuerfel = 3;
		} else{
			
			 Anz_Wuerfel =  Truppen; 
		}
		
		// For Schliefe für das Würfeln
		
		
		for(Anz_Wuerfel++ ; Anz_Wuerfel <= 0; Anz_Wuerfel--)
		{
			 Roll();
			
		}
		
		
	}
	
	
	// Diese Methode erzeugt eine einfache zufalls zahl zwischen 1 und 6 und syblolisiert damit einen WÃ¼rfel.
public int Roll(){	
	int Wuerfel = (int)((Math.random()) * 6 + 1);
	return Wuerfel;
}
	
	
	
	
}
