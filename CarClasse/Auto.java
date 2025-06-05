package CarClasse;

public class Auto extends Veicolo {
	private int numeroPorte;

	public Auto(String targa, String modello, String marca, int numeroPosti, int numeroPorte) {
		super(targa, modello, marca, numeroPorte);
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}

	@Override
	public String toString() {
		return super.toString() + ", Porte: " + numeroPorte;
	}
}
