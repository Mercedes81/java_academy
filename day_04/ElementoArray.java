package day_04;

/* Scrivi un programma Java che ricerca un elemento specifico all'interno di un 
array di interi e restituisce la sua posizione (indice)
 */

import java.util.Scanner;
	public class ElementoArray {

		    // Metodo per cercare un elemento nell'array
	    public static int cercaElemento(int[] array, int elemento) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == elemento) {
	                return i; // ritorna l'indice se trovato
	            }
	        }
	        return -1; // ritorna -1 se non trovato
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Esempio di array
	        int[] numeri = {10, 20, 30, 40, 50, 60};

	        System.out.print("Inserisci il numero da cercare: ");
	        int daCercare = scanner.nextInt();

	        int posizione = cercaElemento(numeri, daCercare);

	        if (posizione != -1) {
	            System.out.println("Elemento trovato all'indice: " + posizione);
	        } else {
	            System.out.println("Elemento non trovato nell'array.");
	        }
	        scanner.close();
	    }
}