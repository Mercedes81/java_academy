package BibliotecaBis;

public class Abbonati {
	public String cf;
	public String nome;
	public String cognome;

	public Abbonati() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Abbonati(String cf, String nome, String cognome) {
		super();
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Abbonati [cf=" + this.cf + ", nome=" + this.nome + ", cognome=" + this.cognome + "]";
	}

}
