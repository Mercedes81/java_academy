package Biblioteca;

public class Abbonato {

	private String nome;
	private String cognome;

	// Costruttore
	public Abbonato(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	// Metodi getter
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
	public String toString() {
		return nome + " " + cognome;
	}
}
