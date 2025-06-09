package Exercizi_17.NumeriPrimi;

public class NumeriPrimi {

	// Metodo per controllare se un numero è primo
	public static boolean isPrimo(int numero) {
		if (numero < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Metodo per trovare l'n-esimo numero primo
	public static int nEsimoPrimo(int n) {
		int conteggio = 0;
		int numero = 1;

		while (conteggio < n) {
			numero++;
			if (isPrimo(numero)) {
				conteggio++;
			}
		}

		return numero;
	}

	public static void main(String[] args) {
		int n = 6; // Cambia questo valore per ottenere un altro numero primo
		int risultato = nEsimoPrimo(n);
		System.out.println("Il " + n + "-esimo numero primo è: " + risultato);
	}
}
