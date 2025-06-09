package Exercizi_17.AziendaSanitaria;

public class Paziente {
	private int numeroTessera;
	private Medico medicoCurante;

	public Paziente(int numeroTessera, Medico medicoCurante) {
		this.numeroTessera = numeroTessera;
		this.medicoCurante = medicoCurante;
	}

	public int getNumeroTessera() {
		return numeroTessera;
	}

	public Medico getMedicoCurante() {
		return medicoCurante;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Paziente)) {
			return false;
		}
		Paziente p = (Paziente) obj;
		return this.numeroTessera == p.numeroTessera;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(numeroTessera);
	}

	@Override
	public String toString() {
		return "Paziente #" + numeroTessera + " - Medico: " + medicoCurante.getNominativo();
	}
}
