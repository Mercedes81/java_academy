package Day_15.CalcoloFattura;

import java.math.BigDecimal;

abstract class Cliente {

	private String cf;
	private String nome;
	private String cognome;
	private BigDecimal prezzoDaPagare;

	public Cliente() {
		super();
	}

	public Cliente(String cf, String nome, String cognome) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public BigDecimal getPrezzoDaPagare() {
		return prezzoDaPagare;
	}

	public void setPrezzoDaPagare(BigDecimal prezzoDaPagare) {
		this.prezzoDaPagare = prezzoDaPagare;
	}

	@Override
	public String toString() {
		return "Cliente [cf=" + cf + ", nome=" + nome + ", cognome=" + cognome + ", prezzoDaPagare=" + prezzoDaPagare
				+ "]";
	}

}
