package Exercizi_17.Servizi;

public class Cliente {
	protected String nome;
	protected String cognome;
	protected double prezzoDaPagare;

	public Cliente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.prezzoDaPagare = 0;
	}

	public double getPrezzoDaPagare() {
		return prezzoDaPagare;
	}

	public String getInfo() {
		return nome + " " + cognome + " - Da pagare: " + prezzoDaPagare + "€";
	}
}
