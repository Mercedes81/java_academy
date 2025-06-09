package Exercizi_17.PrenotazioneConcerto;

import java.util.ArrayList;

public class Spettacolo {
	private Cliente[] prenotazioni;
	private int n_prenotazione;
	private ArrayList<Cliente> attesa;

	public Spettacolo(int n) {
		prenotazioni = new Cliente[n];
		n_prenotazione = 0;
		attesa = new ArrayList<>();
	}

	public boolean libero() {
		return n_prenotazione < prenotazioni.length;
	}

	public int trova(String nome, String tel) {
		Cliente c = new Cliente(nome, tel);

		for (Cliente p : prenotazioni) {
			if (p != null && p.equals(c)) {
				return 0; // ha il posto
			}
		}

		if (attesa.contains(c)) {
			return 1; // è in attesa
		}

		return -1; // non trovato
	}

	public void prenota(String nome, String tel) {
		Cliente nuovo = new Cliente(nome, tel);

		if (trova(nome, tel) != -1) {
			System.out.println("Cliente già registrato.");
			return;
		}

		if (libero()) {
			prenotazioni[n_prenotazione] = nuovo;
			n_prenotazione++;
		} else {
			attesa.add(nuovo);
		}
	}

	public void disdici(String nome, String tel) {
		Cliente daRimuovere = new Cliente(nome, tel);

		// Cerca e rimuove da prenotazioni
		for (int i = 0; i < prenotazioni.length; i++) {
			if (prenotazioni[i] != null && prenotazioni[i].equals(daRimuovere)) {
				// Shift a sinistra
				for (int j = i; j < prenotazioni.length - 1; j++) {
					prenotazioni[j] = prenotazioni[j + 1];
				}
				prenotazioni[prenotazioni.length - 1] = null;
				n_prenotazione--;

				// Se c'è qualcuno in attesa, lo spostiamo in prenotazioni
				if (!attesa.isEmpty()) {
					Cliente prossimo = attesa.remove(0);
					prenotazioni[n_prenotazione] = prossimo;
					n_prenotazione++;
				}
				return;
			}
		}

		// Rimuove dalla lista d’attesa
		attesa.remove(daRimuovere);
	}

	public boolean incompleto() {
		for (Cliente c : prenotazioni) {
			if (c == null) {
				continue;
			}
			for (Cliente a : attesa) {
				if (c.equals(a)) {
					return true;
				}
			}
		}
		return false;
	}
}
