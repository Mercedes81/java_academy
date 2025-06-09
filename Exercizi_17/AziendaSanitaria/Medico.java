package Exercizi_17.AziendaSanitaria;

public class Medico {
	private String nominativo;

	public Medico(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getNominativo() {
		return nominativo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Medico medico = (Medico) obj;
		return nominativo.equalsIgnoreCase(medico.nominativo);
	}

	@Override
	public int hashCode() {
		return nominativo.toLowerCase().hashCode();
	}

	@Override
	public String toString() {
		return "Medico: " + nominativo;
	}
}
