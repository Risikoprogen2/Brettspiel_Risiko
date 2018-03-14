// Autor: Konrad Musiol

/*
 * Main Klasse dess Programms
 * 
 * Ruft Klasse Welcome() auf
*/

public class Risiko {
	
	public Risiko(){}
	
	private static Welcome go;

	public static void main(String[] args) {
		
		go= new Welcome();
		go.Start_Welcome();
		
	}

}
