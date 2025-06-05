package CampodeTenis;

import java.util.ArrayList;

public class Campo {
	private ArrayList<Prenotazione> prenotazioni;
	private final int ORA_APERTURA = 8;
	private final int ORA_CHIUSURA = 20;

	public Campo() {
		prenotazioni = new ArrayList<>();
	}

	public boolean addPren(int inizio, int fine, String unNomeCliente) {
		if (inizio < ORA_APERTURA || fine > ORA_CHIUSURA || inizio >= fine) {
			return false; // Orari non validi
		}

		// Verifica sovrapposizioni
		for (Prenotazione p : prenotazioni) {
			if (!(fine <= p.getInizio() || inizio >= p.getFine())) {
				return false; // Sovrapposizione trovata
			}
		}

		prenotazioni.add(new Prenotazione(inizio, fine, unNomeCliente));
		return true;
	}

	public boolean removePren(int inizio, int fine, String unNomeCliente) {
		for (int i = 0; i < prenotazioni.size(); i++) {
			Prenotazione p = prenotazioni.get(i);
			if (p.getInizio() == inizio && p.getFine() == fine && p.getNomeCliente().equals(unNomeCliente)) {
				prenotazioni.remove(i);
				return true;
			}
		}
		return false;
	}

	public double utilizzo() {
		int orePrenotate = 0;
		for (Prenotazione p : prenotazioni) {
			orePrenotate += p.getFine() - p.getInizio();
		}
		int oreDisponibili = ORA_CHIUSURA - ORA_APERTURA;
		return (double) orePrenotate / oreDisponibili * 100;
	}

	@Override
	public String toString() {
		if (prenotazioni.isEmpty()) {
			return "Nessuna prenotazione.";
		}

		StringBuilder sb = new StringBuilder();
		sb.append("Prenotazioni:\n");
		for (Prenotazione p : prenotazioni) {
			sb.append("- ").append(p).append("\n");
		}
		return sb.toString();
	}
}
