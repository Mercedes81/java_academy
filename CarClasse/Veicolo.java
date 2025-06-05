package CarClasse;

public class Veicolo {
	private String targa;
	private String modello;
	private String marca;
	private int numeroPosti;

	public Veicolo(String targa, String modello, String marca, int numeroPosti) {
		this.targa = targa;
		this.modello = modello;
		this.marca = marca;
		this.numeroPosti = numeroPosti;
	}

	public String getTarga() {
		return targa;
	}

	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	@Override
	public String toString() {
		return "Targa: " + targa + ", Marca: " + marca + ", Modello: " + modello + ", Posti: " + numeroPosti;
	}
}
