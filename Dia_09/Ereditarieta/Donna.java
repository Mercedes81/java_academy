package Dia_09.Ereditarieta;

import java.time.LocalDate;

public class Donna extends Persona {
	private String coloreRossetto;

	public Donna() {
		super();

	}

	public Donna(String codicefiscale, String nome, String cognome, LocalDate nascita, String luogo,
			String coloreRosetto) {
		super(codicefiscale, nome, cognome, nascita, luogo);
		this.coloreRossetto = coloreRosetto;
	}

	@Override
	public String toString() {
		return "Donna [ " + super.toString() + " coloreRossetto=" + coloreRossetto + "]";
	}

}
