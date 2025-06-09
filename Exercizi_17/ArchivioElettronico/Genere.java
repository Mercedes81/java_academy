package Exercizi_17.ArchivioElettronico;

public class Genere {
	private String nome;

	public Genere(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Genere)) {
			return false;
		}
		Genere g = (Genere) o;
		return nome.equalsIgnoreCase(g.nome);
	}

	@Override
	public int hashCode() {
		return nome.toLowerCase().hashCode();
	}

	@Override
	public String toString() {
		return nome;
	}
}
