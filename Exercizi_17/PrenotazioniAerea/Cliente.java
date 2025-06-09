package Exercizi_17.PrenotazioniAerea;

public class Cliente {
	private String nome;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente c = (Cliente) obj;
		return nome.equalsIgnoreCase(c.nome);
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
