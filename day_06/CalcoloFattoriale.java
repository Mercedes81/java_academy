package Day_06;

/* Scrivi un programma Java che calcola il fattoriale di un numero dato.
 es. 9! = 9*8*7*6*5*4*3*2*1
 */
import java.util.Scanner;

public class CalcoloFattoriale {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Chiedi all'utente di inserire un numero intero
		System.out.print("Inserisci un numero intero non negativo: ");
		int numero = scanner.nextInt();

		if (numero < 0) {
			System.out.println("Il fattoriale non è definito per numeri negativi.");
		} else {
			long fattoriale = 1;
			for (int i = 1; i <= numero; i++) {
				fattoriale *= i;
			}

			// Mostra il risultato
			System.out.println(numero + " = " + fattoriale);
		}
	}
}