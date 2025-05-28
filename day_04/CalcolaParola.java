package day_04;

import java.util.Scanner;

/* Scrivi un programma Java che calcola il numero di parole presenti in una 
stringa data. Si considera una parola come una sequenza di caratteri 
separati da spazi.
*/

	public class CalcolaParola {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        	//Chiede al Usuario de Inserire una Palabras
	        System.out.print("Inserisci una frase: ");
	        String frase = scanner.nextLine();
	        	// Rimuovi los spazi iniziali y finali e verifica se la stringa è vuota
	        frase = frase.trim();

	        if (frase.isEmpty()) {
	            System.out.println("Numero di parole: 0");
	        } else {
	            // Dividi la stringa in parole usando lo spazio come separatore
	            String[] parole = frase.split("\\s+"); // uno o più spazi
	            System.out.println("Numero di parole: " + parole.length);
	        }

	        scanner.close();
	    }
}