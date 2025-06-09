
package Exercizi_17.Servizi;

public class ClientiFisso extends Cliente {
	private String tipoCliente; // STANDARD, SPECIAL, SUPERSPECIAL

	public ClientiFisso(String nome, String cognome, String tipoCliente) {
		super(nome, cognome);
		this.tipoCliente = tipoCliente.toUpperCase();
		calcola();
	}

	public void calcola() {
		switch (tipoCliente) {
		case "STANDARD":
			prezzoDaPagare = 30;
			break;
		case "SPECIAL":
			prezzoDaPagare = 50;
			break;
		case "SUPERSPECIAL":
			prezzoDaPagare = 60;
			break;
		default:
			prezzoDaPagare = 0;
			break;
		}
	}
}
