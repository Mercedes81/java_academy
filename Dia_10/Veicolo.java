package Dia_10;

//Veicolo.java
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

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", numeroPosti=" + numeroPosti
				+ "]";
	}
}
