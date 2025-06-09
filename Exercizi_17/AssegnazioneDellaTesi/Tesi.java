package Exercizi_17.AssegnazioneDellaTesi;

public class Tesi {
	private String titolo;

	public Tesi(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Tesi) {
			Tesi altra = (Tesi) obj;
			return this.titolo.equalsIgnoreCase(altra.getTitolo());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return titolo.toLowerCase().hashCode();
	}
}
