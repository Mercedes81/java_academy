package day_04;

/* Scrivi un programma Java che calcola il numero di occorrenze di una lettera 
specificata all'interno di una stringa data
 */
 
import java.util.Scanner;

	public class VerificaStringa {
		
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input della stringa
	        System.out.print("Inserisci una stringa: ");
	        String testo = scanner.nextLine();

	        // Input della lettera da cercare
	        System.out.print("Inserisci la lettera da contare: ");
	        char lettera = scanner.nextLine().charAt(0);

	        int contatore = 0;

	        // Ciclo per scorrere ogni carattere della stringa
	        for (int i = 0; i < testo.length(); i++) {
	            if (testo.charAt(i) == lettera) {
	                contatore++;
	            }
	        }

	        // Stampa del risultato
	        System.out.println("La lettera '" + lettera + "' compare " + contatore + " volte nella stringa.");

	        scanner.close();
	    }
	}	
	

