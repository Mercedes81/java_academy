package Biblioteca;

public class Libro {
	public String isbn;
	private String titolo;
	private Abbonato utente;
	private Data dataScadenza;

	public Libro(String titolo, Abbonato utente localDate data) {
		this.titolo = titolo;
		this.utente = null;
		this.dataScadenza = null;
	}

	public String getTitolo() {
		return titolo;
	}

	public Abbonato getUtente() {
		return utente;
	}

	public Data getDataScadenza() {
		return dataScadenza;
	}

	public void prestaLibro(Abbonato utente, Data scadenza) {
		this.utente = utente;
		this.dataScadenza = scadenza;
	}

	public void restituisciLibro() {
		this.utente = null;
		this.dataScadenza = null;
	}

	public boolean èPrestato() {
		return utente != null;
	}

	@Override
	public String toString() {
		if (èPrestato()) {
			return "Titolo: " + titolo + " | Prestato a: " + utente + " | Scadenza: " + dataScadenza;
		} else {
			return "Titolo: " + titolo + " | Disponibile";
		}
	}
}