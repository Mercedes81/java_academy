package Exercizi_17.Servizi;

public class Bolletta {
	public static void calcolaBollette(Cliente c) {
		if (c instanceof ClientiLuce) {
			((ClientiLuce) c).calcola();
		} else if (c instanceof ClientiGas) {
			((ClientiGas) c).calcola();
		} // ClientiFisso e ClientiMobile già calcolano da costruttore
	}
}
