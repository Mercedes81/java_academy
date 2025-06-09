package Day_04;

/* Scrivi un programma Java che calcola il valore massimo e il valore minimo 
presenti in un array di interi
 */

import java.util.Scanner;
public class MaxMinArray {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi la dimensione dell'array
        System.out.print("Inserisci il numero di elementi nell'array: ");
        int n = scanner.nextInt();

        int[] numeri = new int[n];

        // Inserisci gli elementi dell'array
        System.out.println("Inserisci gli elementi dell'array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeri[i] = scanner.nextInt();
        }

        // Inizializza min e max con il primo elemento dell'array
        int minimo = numeri[0];
        int massimo = numeri[0];

        // Trova il minimo e il massimo
        for (int i = 1; i < n; i++) {
            if (numeri[i] < minimo) {
                minimo = numeri[i];
            }
            if (numeri[i] > massimo) {
                massimo = numeri[i];
            }
        }

        // Mostra i risultati
        System.out.println("Valore minimo: " + minimo);
        System.out.println("Valore massimo: " + massimo);
    }
}