package day_06;

/* Scrivi un programma Java che verifica se un numero dato è primo o meno
 */

import java.util.Scanner;

public class VerificaPrimo {
	public static void main(String[] args) {
		// TODO Auto-generad method stub
		Scanner scanner = new Scanner(System.in);

		// Chiedi all'utente di inserire un numero
		System.out.print("Inserisci un numero intero: ");
		int numero = scanner.nextInt();

		// Verifica se il numero è primo
		if (numero <= 1) {
			System.out.println(numero + " non è un numero primo.");
		} else {
			boolean èPrimo = true;
			for (int i = 2; i <= Math.sqrt(numero); i++) {
				if (numero % i == 0) {
					èPrimo = false;
					break;
				}
			}
			// Stampa il risultato
			if (èPrimo) {
				System.out.println(numero + " è un numero primo.");
			} else {
				System.out.println(numero + " non è un numero primo.");
			}
		}
	}
}
