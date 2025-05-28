package day_02;

import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String []  args) {
	// TODO Auto generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisce Base del Rettangolo");
		double base=input.nextDouble();
		System.out.println("Inserisce Altezza del Rettangolo");
		double altezza=input.nextDouble();
		double area = base*altezza;
		System.out.println("Il Rettangolo è:"+ area);
		input.close();
			}
}