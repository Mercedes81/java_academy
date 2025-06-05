package CampodeTenis;

public class ClubTennis {
	public static void main(String[] args) {
		Campo campo = new Campo();

		// Prenotazioni
		System.out.println("Prenotazione 1 (Mario): " + campo.addPren(9, 11, "Mario"));
		System.out.println("Prenotazione 2 (Luca): " + campo.addPren(10, 12, "Luca")); // Fallisce: sovrapposizione
		System.out.println("Prenotazione 3 (Anna): " + campo.addPren(12, 14, "Anna"));

		// Stampa lo stato del campo
		System.out.println(campo);

		// Rimuove una prenotazione
		System.out.println("Cancellazione (Anna): " + campo.removePren(12, 14, "Anna"));
		System.out.println("Cancellazione (Gianni): " + campo.removePren(12, 14, "Gianni")); // Fallisce

		// Stato aggiornato
		System.out.println(campo);

		// Utilizzo del campo
		System.out.printf("Utilizzo del campo: %.2f%%\n", campo.utilizzo());
	}
}
