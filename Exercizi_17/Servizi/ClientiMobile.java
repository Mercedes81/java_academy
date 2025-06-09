package Exercizi_17.Servizi;

public class ClientiMobile extends Cliente {
	private int gigaByte;

	public ClientiMobile(String nome, String cognome, int gigaByte) {
		super(nome, cognome);
		this.gigaByte = gigaByte;
		calcola();
	}

	public void calcola() {
		if (gigaByte < 30) {
			prezzoDaPagare = 8;
		} else if (gigaByte <= 80) {
			prezzoDaPagare = 12;
		} else {
			prezzoDaPagare = 15;
		}
	}
}
