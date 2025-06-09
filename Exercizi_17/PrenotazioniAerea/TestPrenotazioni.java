package Exercizi_17.PrenotazioniAerea;

public class TestPrenotazioni {
	public static void main(String[] args) {
		Volo volo = new Volo(3); // max 3 posti

		Cliente c1 = new Cliente("Luca");
		Cliente c2 = new Cliente("Anna");
		Cliente c3 = new Cliente("Marco");
		Cliente c4 = new Cliente("Sofia");
		Cliente c5 = new Cliente("Giulia");

		volo.prenota(c1);
		volo.prenota(c2);
		volo.prenota(c3);
		volo.prenota(c4); // in attesa
		volo.prenota(c5); // in attesa

		System.out.println("\n--- STATO VOLO ---");
		volo.stampaPosti();
		volo.stampaAttesa();

		System.out.println("\n--- CANCELLAZIONE DI MARCO ---");
		volo.disdici(c3);

		System.out.println("\n--- STATO AGGIORNATO ---");
		volo.stampaPosti();
		volo.stampaAttesa();
	}
}
