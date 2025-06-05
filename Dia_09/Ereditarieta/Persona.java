package Dia_09.Ereditarieta;

import java.time.LocalDate;

public class Persona {
	private String codicefiscale;
	private String nome;
	private String cognome;
	private LocalDate nascita;
	private String luogo;

	public Persona(String codicefiscale, String nome, String cognome, LocalDate nascita, String luogo) {
		super();
		this.codicefiscale = codicefiscale;
		this.nome = nome;
		this.cognome = cognome;
		this.nascita = nascita;
		this.luogo = luogo;
	}

	public Persona() {
		super();
	}

	public String getCodicefiscale() {
		return codicefiscale;
	}

	public void setCodicefiscale(String codicefiscale) {
		this.codicefiscale = codicefiscale;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		cognome = cognome;
	}

	public LocalDate getNascita() {
		return this.nascita;
	}

	public void setnascita(LocalDate nascita) {
		this.nascita = nascita;
	}

	public String getLuogo() {
		return luogo;
	}

	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	@Override
	public String toString() {
		return "codicefiscale=" + codicefiscale + ", nome=" + nome + ", cognome=" + cognome + ", nascita=" + nascita
				+ ", luogo=" + luogo;
	}

}
