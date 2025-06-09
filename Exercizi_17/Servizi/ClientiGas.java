package Exercizi_17.Servizi;

public class ClientiGas extends Cliente {
	private double metriCubi;

	public ClientiGas(String nome, String cognome, double metriCubi) {
		super(nome, cognome);
		this.metriCubi = metriCubi;
	}

	public void calcola() {
		double costoMetroCubo;
		if (metriCubi < 50) {
			costoMetroCubo = 1.0;
		} else if (metriCubi <= 80) {
			costoMetroCubo = 0.8;
		} else {
			costoMetroCubo = 0.7;
		}
		prezzoDaPagare = metriCubi * costoMetroCubo;
	}
}
