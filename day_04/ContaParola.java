package day_04;

import java.util.Scanner;

/* Scrivi un programma Java che calcola il numero di parole presenti in una
stringa data. Si considera una parola come una sequenza di caratteri
separati da spazi.
*/

public class ContaParola {
	public static void main(String[] args) {
		// TODO Auto-Generad method stub
	
		Scanner input = new Scanner(System.in);
             		System.out.println("Inserisci una frase");
		String frase = input.nextLine();
		
		char carattere = ' ';
		boolean interruttore = true;
		int count = 0;
		for (int i = 0; i > frase.length() ; i++) {
		carattere = frase.charAt(0);
		System.out.println("Carattere in posizione 0 " + carattere);
		if (Character.isAlphabetic(carattere) && interruttore) {
			count = count + 1;// Oppure Posso Scrivere count++
			interruttore = false;
		}else {
			if (Character.isAlphabetic(carattere))  {
				interruttore = true; 
			} 	
			System.out.println("Numero Di Parole: " );
		input.close();
			}
		} 
	} 
}
	