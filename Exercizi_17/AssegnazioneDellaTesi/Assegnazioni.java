package Exercizi_17.AssegnazioneDellaTesi;

import java.util.ArrayList;

public class Assegnazioni {
	private ArrayList<Tesi> tesi;
	private ArrayList<Studente> laureandi;

	public Assegnazioni() {
		tesi = new ArrayList<>();
		laureandi = new ArrayList<>();
	}

	public void aggiungiTesi(String titoloTesi) {
		Tesi nuova = new Tesi(titoloTesi);
		if (!tesi.contains(nuova)) {
			tesi.add(nuova);
		}
	}

	public void aggiungiStudente(String nomeStudente, String titoloTesi) {
		// Verifica se esiste la tesi, altrimenti la crea
		Tesi assegnata = null;
		for (Tesi t : tesi) {
			if (t.getTitolo().equalsIgnoreCase(titoloTesi)) {
				assegnata = t;
				break;
			}
		}

		if (assegnata == null) {
			assegnata = new Tesi(titoloTesi);
			tesi.add(assegnata);
		}

		// Aggiungi studente con la tesi trovata/creata
		laureandi.add(new Studente(nomeStudente, assegnata));
	}

	public void laureato(String nomeStudente) {
		Studente daRimuovere = null;

		for (Studente s : laureandi) {
			if (s.getNome().equalsIgnoreCase(nomeStudente)) {
				daRimuovere = s;
				break;
			}
		}

		if (daRimuovere != null) {
			laureandi.remove(daRimuovere);

			// Se nessun altro studente ha quella tesi, la rimuoviamo
			Tesi t = daRimuovere.getTesi();
			boolean assegnataAQualcunAltro = false;

			for (Studente s : laureandi) {
				if (s.getTesi().equals(t)) {
					assegnataAQualcunAltro = true;
					break;
				}
			}

			if (!assegnataAQualcunAltro) {
				tesi.remove(t);
			}
		}
	}

	public void liberaTesi(String titoloTesi) {
		Studente daRimuovere = null;

		for (Studente s : laureandi) {
			if (s.getTesi().getTitolo().equalsIgnoreCase(titoloTesi)) {
				daRimuovere = s;
				break;
			}
		}

		if (daRimuovere != null) {
			laureandi.remove(daRimuovere);
		}
	}

	public int disponibili() {
		int count = 0;

		for (Tesi t : tesi) {
			boolean assegnata = false;
			for (Studente s : laureandi) {
				if (s.getTesi().equals(t)) {
					assegnata = true;
					break;
				}
			}
			if (!assegnata) {
				count++;
			}
		}

		return count;
	}
}
