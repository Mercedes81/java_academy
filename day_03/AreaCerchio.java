package day_03;

public class AreaCerchio {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			// Math.PI per prendere il valore di pi dalla libreria.
			// final double IP = 3.14159;
			Scanner input = new Scanner(System.in);
			System.out.println("Inserisci il Raggio del Cerchio : ");
			double raggio = Input.nextDouble();
			double area = Math.PI * raggio * raggio;
			System.out.println("l'Area del Cerchio è:  " + area);
			Input.close();
		}
		}