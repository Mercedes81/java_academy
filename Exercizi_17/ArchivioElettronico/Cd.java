package Exercizi_17.ArchivioElettronico;

public class Cd {
	private String titolo;

	public Cd(String titolo) {
		this.titolo = titolo;
	}

	public String getTitolo() {
		return titolo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Cd)) {
			return false;
		}
		Cd c = (Cd) o;
		return titolo.equalsIgnoreCase(c.titolo);
	}

	@Override
	public int hashCode() {
		return titolo.toLowerCase().hashCode();
	}

	@Override
	public String toString() {
		return titolo;
	}
}
