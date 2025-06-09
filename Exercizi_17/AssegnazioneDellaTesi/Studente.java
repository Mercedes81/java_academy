package Exercizi_17.AssegnazioneDellaTesi;

public class Studente {
	private String nome;
	private Tesi tesi;

	public Studente(String nome, Tesi tesi) {
		this.nome = nome;
		this.tesi = tesi;
	}

	public String getNome() {
		return nome;
	}

	public Tesi getTesi() {
		return tesi;
	}

	public void setTesi(Tesi tesi) {
		this.tesi = tesi;
	}
}
