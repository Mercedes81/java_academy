package day_03;

import java.util.Scanner;

public class AreaCerchio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Math.PI per prendere il valore di pi dalla libreria.
		// final double IP = 3.14159;

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il Raggio del Cerchio : ");
		double raggio = input.nextDouble(); // Corretto uso di "input"
		double area = Math.PI * raggio * raggio;
		System.out.println("L'Area del Cerchio è: " + area);
		input.close(); // Corretto uso di "input"
	}
}
