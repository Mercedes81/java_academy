package day_02;

import java.util.Scanner;

/*
* Esercizio_01
* Somma di due numeri
* Traccia: Scrivi un programma Java che chieda all'utente di inserire due
* numeri interi e stampi la loro somma
*/
 public class SommaNumeri {

	public static void main(String[] args) {
		// todo auto generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisce primo numero");
		int numero1 = input.nextInt();
 		System.out.println("Inserisce secondo numero");
		int numero2=input.nextInt();
		int somma =numero1+numero2;
		System.out.println ("La Somma Dei Due Numeri é:" + somma);
		input.close();
 	}
}