package Day_04;

import java.util.Scanner;
/*Scrivi un programma Java che calcola il numero di occorrenze di una lettera 
specificata all'interno di una stringa data
*/
	public class CalcolaOccorrenze {
		
			    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Chiedi all'utente di inserire una stringa
		        System.out.print("Inserisci una stringa: ");
		        String testo = scanner.nextLine();

		        // Chiedi all'utente di inserire una lettera
		        System.out.print("Inserisci la lettera da cercare: ");
		        char lettera = scanner.next().charAt(0);

		        // Conta le occorrenze della lettera
		        int conteggio = 0;
		        for (int i = 0; i < testo.length(); i++) {
		            if (testo.charAt(i) == lettera) {
		                conteggio++;
		            }
		        }

		        // Mostra il risultato
		        System.out.println("La lettera '" + lettera + "' appare " + conteggio + " volte nella stringa.");
		    }
		}