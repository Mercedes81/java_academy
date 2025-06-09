package Day_02;

import java.util.Random;

public class LancioDado {
    public static void main(String[] args) {
        Random random = new Random();//Genera un Ogetto di Tipo Random

        // Lancia due dadi a 6 facce
        int dado1 = random.nextInt(6) + 1; // tra 1 e 6
        int dado2 = random.nextInt(6) + 1; // tra 1 e 6

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Somma dei dadi: " + (dado1 + dado2));
    }
}
