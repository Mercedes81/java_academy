package BibliotecaBis;

import java.time.LocalDateTime;

public class Prestito {
	private Abbonato abbonato;
	private Libro libro;
	private LocalDateTime dataPrestito;

	public Prestito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prestito(Abbonato abbonato, Libro libro, LocalDateTime dataPrestito) {
		super();
		this.abbonato = abbonato;
		this.libro = libro;
		this.dataPrestito = dataPrestito;
	}

	public Abbonato getAbbonato() {
		return abbonato;
	}

	public void setAbbonato(Abbonato abbonato) {
		this.abbonato = abbonato;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public LocalDateTime getDataPrestito() {
		return dataPrestito;
	}

	public void setDataPrestito(LocalDateTime dataPrestito) {
		this.dataPrestito = dataPrestito;
	}

	@Override
	public String toString() {
		return "Prestito [abbonato=" + this.abbonato + ", libro=" + this.libro + ", dataPrestito=" + this.dataPrestito
				+ "]";
	}
}

}
