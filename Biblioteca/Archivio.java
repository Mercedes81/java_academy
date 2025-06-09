
package Biblioteca;

import java.util.ArrayList;

import BibliotecaBis.Libro;

public class Archivio {
	private ArrayList<Abbonato> abbonati;
	private ArrayList<Libro> libri;
	private Data dataCorrente;

	public Archivio(Data dataIniziale) {
		abbonati = new ArrayList<>();
		libri = new ArrayList<>();
		dataCorrente = dataIniziale;
	}

	public void nuovoLibro(String unTitolo) {
		libri.add(new Libro(unTitolo, null));
	}

	public void nuovoUtente(String unNome, String unCognome) {
		abbonati.add(new Abbonato(unNome, unCognome));
	}

	public int trovaUtente(String unNome, String unCognome) {
		for (int i = 0; i < abbonati.size(); i++) {
			Abbonato a = abbonati.get(i);
			if (a.getNome().equalsIgnoreCase(unNome) && a.getCognome().equalsIgnoreCase(unCognome)) {
				return i;
			}
		}
		return -1;
	}

	public Data scadenza(Data date) {
		Data nuova = new Data(date.getDay(), date.getMonth(), date.getYear());
		for (int i = 0; i < 15; i++) {
			nuova.nextDay();
		}
		return nuova;
	}

	public int presta(Libro unLibro, Abbonato unUtente) {
		if (unLibro.èPrestato()) {
			return -1;
		}
		Data dataScad = scadenza(dataCorrente);
		unLibro.prestaLibro(unUtente, dataScad);
		return 0;
	}

	public void aggiorna() {
		dataCorrente.nextDay();
	}

	public int numLibri(Abbonato anAbb) {
		int count = 0;
		for (Libro libro : libri) {
			if (libro.getUtente() != null && libro.getUtente().equals(anAbb)) {
				count++;
			}
		}
		return count;
	}

	// Per testare facilmente
	public void stampaStato() {
		System.out.println("Data corrente: " + dataCorrente);
		for (Libro l : libri) {
			System.out.println(l);
		}
	}

	public ArrayList<Libro> getLibri() {
		return libri;
	}

	public ArrayList<Abbonato> getAbbonati() {
		return abbonati;
	}
}