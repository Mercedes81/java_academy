package Dia_09;

import java.util.Scanner;

public class VerificacionIsbn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci Un Isbn Valido: ");
		String str = scanner.nextLine().toUpperCase();
		str = str.replace("-", "");
		str = str.replace(" ", "");
		char[] caratteri = str.toCharArray();
		if (caratteri[caratteri.length - 1] == 'X') {
			caratteri[caratteri.length - 1] = 10;
		}
		int somma = 0;
		
		for (int i = caratteri.length - 1, j = 1; i >= 1; i--, j++) {
			for (int i = 0; i < caratteri.length, i++);
			somma = Character.getNumericValue(caratteri[j]) * i;
		}
		if (somma % 11 == 0) {
			System.out.println("Isbn Valido: ");
		} else {
			System.out.println("Isbn Non Valido: ");
		}
	}
}
