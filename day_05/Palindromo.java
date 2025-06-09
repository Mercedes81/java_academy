package Day_05;

import java.util.Scanner;

public class Palindromo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Richiesta dell'input all'utente
		System.out.print("Inserisci una stringa: ");
		String input = scanner.nextLine();

		// Rimuove spazi e converte in minuscolo per una verifica più accurata
		String pulita = input.replaceAll("\\s+", "").toLowerCase();

		// Verifica se la stringa è un palindromo
		if (èPalindromo(pulita)) {
			System.out.println("La stringa è un palindromo.");
		} else {
			System.out.println("La stringa NON è un palindromo.");
		}

		scanner.close();
	}

	// Metodo che verifica se una stringa è palindroma
	public static boolean èPalindromo(String str) {
		int inizio = 0;
		int fine = str.length() - 1;

		while (inizio < fine) {
			if (str.charAt(inizio) != str.charAt(fine)) {
				return false;
			}
			inizio++;
			fine--;
		}

		return true;
	}
}
