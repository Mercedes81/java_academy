package Dia_09.Ereditarieta;

import java.time.LocalDate;

public class Uomo extends Persona {
	private boolean abbonamentoStadio;

	public Uomo() {
		super();
		// TODO Auto-generated constructor sub
	}

	public Uomo(String codicefiscale, String nome, String cognome, LocalDate nascita, String luogo,
			boolean abbonamentoStadio) {
		super(codicefiscale, nome, cognome, nascita, luogo);
		this.abbonamentoStadio = abbonamentoStadio;

	}

	@Override
	public String toString() {
		return "Uomo [" + super.toString() + " abbonamentoStadio=" + abbonamentoStadio + "]";

	}

}
