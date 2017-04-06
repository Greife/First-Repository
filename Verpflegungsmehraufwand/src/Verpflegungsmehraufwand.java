<<<<<<< HEAD
/* ##########################################################################################
 * Berechnung des Verpflegungsmehraufwands bei einer Dienstreise.
 * ##########################################################################################*/

=======
>>>>>>> 324fad5b102dfe8bf66c4a17d08a661088581f15
import java.util.Scanner;

public class Verpflegungsmehraufwand {
	public static Scanner sc;

	public static void main(String[] args){

		System.out.println("Geben Sie Ihre Anzahl an Tagen ein, an denen Sie auf einer Dienstreise sind: ");
		
		sc = new Scanner(System.in);
		int tage = sc.nextInt();
		
		System.out.println("Sie sind " + tage+" Tage auf einer Dienstreise.");
		
		int geld = 0;
		int ganzerTag = 24;
		int halberTag = 12;
		
		if (tage == 1) {
			
			geld = halberTag;
			
		} else if (tage == 2) {
			
			geld = halberTag * 2;
			
		} else if ( tage > 2){
			
			geld = halberTag * 2 + ((tage - 2) * ganzerTag);
			
		} else {
			
			geld = 0;
			
		}
		
		System.out.println("Ihre Verpflegungspauschale beträgt " + geld+" Euro.");
	}
}
