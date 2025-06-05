package CampodeTenis;

public class Prenotazione {

	private String nomeCliente;
	private int inizio; // Ora di inizio (intero tra 0 e 23)
	private int fine; // Ora di fine (intero tra 1 e 24)

	public Prenotazione(int inizio, int fine, String nomeCliente) {
		this.inizio = inizio;
		this.fine = fine;
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public int getInizio() {
		return inizio;
	}

	public int getFine() {
		return fine;
	}

	@Override
	public String toString() {
		return nomeCliente + " ha prenotato dalle " + inizio + " alle " + fine;
	}
}
