

public class Wuerfel extends Controll {
	


	/**
	 * Diese Klasse ist für das würfeln zuständig;
	 * 
	 * 
	 */
	
	public Wuerfel(){
		
		int Wuerfel;
	}
	
	
	public void Rolls(){
		
		// diese Klasse soll die Methode Roll() so oft aufrufen wie es Truppen gibt
		
		// Die Variable int i muss noch abgeändert werden damit das richtig funktioniert.
		int Truppen = 0;
		int Anz_Wuerfel = 0;


		if (Truppen > 3) {
			
			  Anz_Wuerfel = 3;
		} else{
			
			 Anz_Wuerfel =  Truppen; 
		}
		
		
		
		
		for(Anz_Wuerfel++ ; Anz_Wuerfel <= 0; Anz_Wuerfel--)
		{
			 Roll();
			
		}
		
		
	}
	
	
	// Diese Methode erzeugt eine einfache zufalls zahl zwischen 1 und 6 und syblolisiert damit einen Würfel.
public int Roll(){	
	int Wuerfel = (int)((Math.random()) * 6 + 1);
	return Wuerfel;
}
	
	
	
	
}
