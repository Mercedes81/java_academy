package Day_15.CalcoloFattura;

public class ClienteMobile extends Cliente {
	public int getGiga() {
		return giga;
	}

	public void setGiga(int giga) {
		this.giga = giga;
	}

	private int giga;

	public ClienteMobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClienteMobile(String cf, String nome, String cognome, int giga) {
		super(cf, nome, cognome);
		this.giga = giga;// TODO Auto-generated constructor stub
	}

}
