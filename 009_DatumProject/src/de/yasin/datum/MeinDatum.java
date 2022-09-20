package de.yasin.datum;

/**
 * Demonstriert, wie die Datumsklassen aus Java zu verwenden sind.
 * 
 * Bzw Warum für die Datumsklassen in Java der Konstruktor nicht explizit aufgerufen wird
 * 
 * @author Alfa
 *
 */
public class MeinDatum {
	
	private int tag;
	
	private int monat;
	
	private int jahr;
	
	private MeinDatum(int day, int monat, int jahr) {
		if(monat > 12 || monat < 0) {
			System.out.println("Das ist kein Datum!");
			return;
//			monat = 1;
			
		}
		this.tag = day;
		this.jahr = jahr;
		this.monat = monat;
	}
	
	public static MeinDatum erstellenEinsDatums1(int tag, int monat, int jahr) {
		if(monat >12 || monat < 1) {
			//... weitere Kontrollen
			return null;
			//Alternativ: Absturz des Programms
		}
		MeinDatum korrekt = new MeinDatum(tag, monat, jahr);
		return korrekt;
	}
	
	
	public String toString() {
		return tag +"." + monat +"." + jahr;
	}

	public static MeinDatum erstellenEinsDatums(int tag2, int monat2, int jahr2) {
		// TODO Auto-generated method stub
		return null;
	} 

}

