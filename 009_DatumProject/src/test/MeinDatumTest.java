package test;

import java.time.LocalDate;

import de.yasin.datum.MeinDatum;


/**
 * Testet die Klasse MeinDatum und beschreibt das
 * Speicher Management in Java: 
 * 		Garbage Collection
 * @author Alfa
 *
 */
public class MeinDatumTest {

	public static void main(String[] args) {
//		MeinDatum weihnachten = new MeinDatum(16,9,2022);
		MeinDatum weihnachten = MeinDatum.erstellenEinsDatums(16, 9, 2022);
		
		//Legt Speicher an
		System.out.println(weihnachten);
		
//		weihnachten = new MeinDatum(24,13,2022);
		weihnachten = MeinDatum.erstellenEinsDatums(24,13,2022);
		//das erste Objekt kann nicht mehr erreicht werden:
		//das Objekt ist frei für: Garbage Collection 
		//Garbage Collector gibt ungenutzten Speicherplatz frei
		//Garbage Collector läuft in einem eigenen Thread ("gleichzeitig" mit dem Programm)
		System.out.println(weihnachten);
		
		weihnachten = null;
		System.out.println(weihnachten);
		
		LocalDate heute = LocalDate.of(2022, 9, 16);
		System.out.println(heute);
//		LocalDate klapptNicht = LocalDate.of(2022, 13, 24);
//		System.out.println(klapptNicht);
		LocalDate dieserTag = LocalDate.now();
		System.out.println(dieserTag);

	}

} 

