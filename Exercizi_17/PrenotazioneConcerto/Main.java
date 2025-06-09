package Exercizi_17.PrenotazioneConcerto;

public class Main {
	public static void main(String[] args) {
		Spettacolo spettacolo = new Spettacolo(2); // max 2 posti

		spettacolo.prenota("Mario Rossi", "123");
		spettacolo.prenota("Luca Bianchi", "456");
		spettacolo.prenota("Giulia Verdi", "789");

		System.out.println(spettacolo.trova("Mario Rossi", "123")); // 0 (ha il posto)
		System.out.println(spettacolo.trova("Giulia Verdi", "789")); // 1 (è in attesa)

		spettacolo.disdici("Mario Rossi", "123"); // libera un posto

		System.out.println(spettacolo.trova("Giulia Verdi", "789")); // 0 (ora ha il posto)
		System.out.println(spettacolo.incompleto()); // false
	}
}
