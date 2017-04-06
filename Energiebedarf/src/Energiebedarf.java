/* ##########################################################################################
 * Berechnung des Energiebedarfs einer männlichen Person über den Grund- und Leistungsumsatz.
 * ##########################################################################################*/
import java.util.Scanner;

public class Energiebedarf {
	public static void main(String[] args){
		
		
		//Berechnung Grundumsatz
		System.out.println("Geben Sie Ihr Gewicht ein: ");
		
		Scanner sc1 = new Scanner(System.in);
		int gewicht = sc1.nextInt();
		
		System.out.println("Sie wiegen " + gewicht+" kg.");
		
		int grundumsatz = gewicht * 4 * 24;
		
		System.out.println("Ihr Grundumsatz beträgt " + grundumsatz+" kJ.");
		

		//Berechnung Leistungsumsatz bei der Arbeit
		int[] energiebedarfArbeit = {0, 3, 5, 10, 13};
		
		System.out.println("Wie schwer schätzt du eine Arbeit ein? ");
		System.out.println("0 = Keine Arbeit");
		System.out.println("1 = Leichte Arbeit");
		System.out.println("2 = Mittelschwere Arbeit");
		System.out.println("3 = Schwere Arbeit");
		System.out.println("4 = Schwerste Arbeit");
		
		Scanner sc2 = new Scanner(System.in);
		int arbeit = sc2.nextInt();
		
		//Schleife, falls ein ungülter Wert eingegeben wurde.
		while (arbeit > 4 || arbeit < 0){
			
			System.out.println("Wert außerhalb des Wertebereichs. Bitte geben Sie den Wert noch einmal ein. ");
			
			arbeit = sc2.nextInt();
		
		}
		
		
		
		System.out.println("Wieviele Stunden arbeiten Sie pro Tag? ");
		
		Scanner sc3 = new Scanner(System.in);
		int stundenArbeit = sc3.nextInt();
		
		//Schleife, falls ein ungülter Wert eingegeben wurde.
		while (stundenArbeit > 24 || stundenArbeit < 0){
			
			System.out.println("Wert außerhalb des Wertebereichs. Bitte geben Sie den Wert noch einmal ein. ");
			
			stundenArbeit = sc3.nextInt();
		
		}
		
		int leistungsumsatzArbeit = energiebedarfArbeit[arbeit] * stundenArbeit * gewicht;
		
		System.out.println("Sie verbrauchen " + leistungsumsatzArbeit+" kJ pro Tag bei der Arbeit.");
		
		
		//Berechnung Leistungsumsatz beim Sport
		int[] energiebedarfFreizeit = {0, 10, 20, 30, 35, 40, 50, 55};
		
		System.out.println("Wie schwer schätzten Sie Ihre Sportaktivität ein?: ");
		System.out.println("0 = Kein Sport");
		System.out.println("1 = Gymnastik");
		System.out.println("2 = Schlittschuhlaufen");
		System.out.println("3 = Tanzen");
		System.out.println("4 = Skilaufen");
		System.out.println("5 = Geräteturnen");
		System.out.println("6 = Bodybuilding");
		System.out.println("7 = Fußball");
		
		Scanner sc4 = new Scanner(System.in);
		int freizeit = sc4.nextInt();

		//Schleife, falls ein ungülter Wert eingegeben wurde.
		while (freizeit > 7 || freizeit < 0){
			
			System.out.println("Wert außerhalb des Wertebereichs. Bitte geben Sie den Wert noch einmal ein. ");
			
			freizeit = sc4.nextInt();
		
		}		
		
		
		System.out.println("Wieviele Stunden treiben Sie Sport pro Tag? ");
		
		Scanner sc5 = new Scanner(System.in);
		int stundenFreizeit = sc5.nextInt();
		
		int zeitgesamt = stundenFreizeit + stundenArbeit;
		
		//Schleife, falls ein ungülter Wert eingegeben wurde.
		while (zeitgesamt > 24 || zeitgesamt < 0){
			
			System.out.println("Wert außerhalb des Wertebereichs. Bitte geben Sie den Wert noch einmal ein. ");
			
			stundenFreizeit = sc5.nextInt();
			zeitgesamt = stundenFreizeit + stundenArbeit;
		
		}	
		
		int leistungsumsatzFreizeit = energiebedarfFreizeit[freizeit] * stundenFreizeit * gewicht;
		int leistungsumsatzGesamt = leistungsumsatzFreizeit + leistungsumsatzArbeit;
		
		
		System.out.println("Sie verbrauchen " + energiebedarfFreizeit[freizeit] * stundenFreizeit * gewicht+" kJ pro Tag beim Sport.");
		
		
		
		System.out.println("Ihr Leistungsumsatz beträgt " + leistungsumsatzGesamt+" kJ pro Tag beim Sport.");
		
		int gesamtUmsatz = leistungsumsatzGesamt + grundumsatz;
		double kcal =  Math.round(100.0 * (gesamtUmsatz / 4.1868)) / 100.0;
		
		System.out.println("Ihr Gesamtumsatz beträgt " + gesamtUmsatz+" kJ.");
		System.out.println("Das entspricht " + kcal+" kcal.");
	}
}
