package Exercizi_17.ArchivioElettronico;

public class Artista {
	private String nome;

	public Artista(String nome) {
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
		if (!(o instanceof Artista)) {
			return false;
		}
		Artista a = (Artista) o;
		return nome.equalsIgnoreCase(a.nome);
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
