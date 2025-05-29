package day_04;

/*Scrivi un programma Java che inverte una stringa data
 */

import java.util.Scanner;

public class InversioneStringa {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input della stringa
        System.out.print("Inserisci una stringa a Invertire: ");
        String testo = scanner.nextLine();
        //Tennis
        //012345
        
        String invertita = ""; //Inizializamo La Stringa Vuota
                   
        // Ciclo per costruire la stringa invertita
        for (int i = testo.length() - 1; i >= 0; i--) {
        	  invertita += testo.charAt(i);
        }

        // Stampa la stringa invertita
        System.out.println("Stringa invertita: " + invertita);

        scanner.close();
    }
}