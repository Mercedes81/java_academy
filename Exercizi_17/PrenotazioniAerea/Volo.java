package Exercizi_17.PrenotazioniAerea;

import java.util.ArrayList;

public class Volo {
	private Cliente[] posti;
	private ArrayList<Cliente> attesa;
	private final Cliente SENTINELLA = null; // Posti liberi sono null

	public Volo(int maxPosti) {
		this.posti = new Cliente[maxPosti];
		this.attesa = new ArrayList<>();
	}

	public boolean prenota(Cliente cliente) {
		// Controllo se già prenotato
		if (isPresente(cliente)) {
			System.out.println(cliente + " è già prenotato.");
			return false;
		}

		// Cerca posto libero (sentinella = null)
		for (int i = 0; i < posti.length; i++) {
			if (posti[i] == SENTINELLA) {
				posti[i] = cliente;
				System.out.println(cliente + " aggiunto a posti.");
				return true;
			}
		}

		// Se pieno, metti in attesa
		attesa.add(cliente);
		System.out.println(cliente + " aggiunto alla lista d'attesa.");
		return true;
	}

	public boolean disdici(Cliente cliente) {
		for (int i = 0; i < posti.length; i++) {
			if (cliente.equals(posti[i])) {
				posti[i] = SENTINELLA;
				System.out.println(cliente + " ha disdetto. Posto liberato.");

				// Se qualcuno in attesa, spostalo nei posti
				if (!attesa.isEmpty()) {
					Cliente prossimo = attesa.remove(0);
					posti[i] = prossimo;
					System.out.println(prossimo + " spostato dalla lista d'attesa a posti.");
				}
				return true;
			}
		}

		// Se era in attesa, rimuovi
		if (attesa.remove(cliente)) {
			System.out.println(cliente + " rimosso dalla lista d'attesa.");
			return true;
		}

		System.out.println(cliente + " non trovato.");
		return false;
	}

	private boolean isPresente(Cliente cliente) {
		for (Cliente c : posti) {
			if (cliente.equals(c)) {
				return true;
			}
		}
		return attesa.contains(cliente);
	}

	public void stampaPosti() {
		System.out.println("POSTI OCCUPATI:");
		for (int i = 0; i < posti.length; i++) {
			System.out.println("Posto " + (i + 1) + ": " + (posti[i] == null ? "[LIBERO]" : posti[i]));
		}
	}

	public void stampaAttesa() {
		System.out.println("LISTA D'ATTESA:");
		for (int i = 0; i < attesa.size(); i++) {
			System.out.println((i + 1) + ". " + attesa.get(i));
		}
	}
}
