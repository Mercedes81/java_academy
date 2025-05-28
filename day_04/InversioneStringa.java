package day_04;

/*Scrivi un programma Java che inverte una stringa data
 */

import java.util.Scanner;

public class InversioneStringa {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input della stringa
        System.out.print("Inserisci una stringa: ");
        String testo = scanner.nextLine();

        String invertita = "";

        // Ciclo per costruire la stringa invertita
        for (int i = testo.length() - 1; i >= 0; i--) {
            invertita += testo.charAt(i);
        }

        // Stampa la stringa invertita
        System.out.println("Stringa invertita: " + invertita);

        scanner.close();
    }
}