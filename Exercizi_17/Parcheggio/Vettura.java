package Exercizi_17.Parcheggio;

public class Vettura {
	private int targa;
	private short oraArrivo;
	private short oraScadenza;

	public Vettura(int targa, short oraArrivo, short oraScadenza) {
			this.targa = targa;
			this.oraArrivo = oraArrivo;
			this.oraScadenza = oraScadenza;
		}

	public int getTarga() {
		return targa;
	}

	public void setTarga(int targa) {
		this.targa = targa;
	}

	public short getOraArrivo() {
		return oraArrivo;
	}

	public void setOraArrivo(short oraArrivo) {
		this.oraArrivo = oraArrivo;
	}

	public short getOraScadenza() {
		return oraScadenza;
	}

	public void setOraScadenza(short oraScadenza) {
		this.oraScadenza = oraScadenza;
	}

	public int orePagate() {
		return oraScadenza - oraArrivo;
	}

	@Override
	public String toString() {
		return "Vettura{" + "targa=" + targa + ", oraArrivo=" + oraArrivo + ", oraScadenza=" + oraScadenza + '}';
	}
}
