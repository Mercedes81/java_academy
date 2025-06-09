package Exercizi_17.Servizi;

public class TestClienti {
	public static void main(String[] args) {
		Cliente[] clienti = new Cliente[10];

		clienti[0] = new ClientiLuce("Anna", "Rossi", 250);
		clienti[1] = new ClientiLuce("Luca", "Bianchi", 800);
		clienti[2] = new ClientiGas("Marco", "Verdi", 45);
		clienti[3] = new ClientiGas("Giulia", "Gialli", 75);
		clienti[4] = new ClientiFisso("Sandro", "Neri", "STANDARD");
		clienti[5] = new ClientiFisso("Paola", "Blu", "SPECIAL");
		clienti[6] = new ClientiFisso("Marta", "Rosa", "SUPERSPECIAL");
		clienti[7] = new ClientiMobile("Enzo", "Viola", 25);
		clienti[8] = new ClientiMobile("Chiara", "Grigi", 70);
		clienti[9] = new ClientiMobile("Dario", "Marroni", 100);

		for (Cliente c : clienti) {
			Bolletta.calcolaBollette(c);
			System.out.println(c.getInfo());
		}
	}
}
