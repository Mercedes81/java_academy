package Dia_10;

public class VeicoloTest {

	public static void main(String[] args) {
		Veicolo[] parcheggio = new Veicolo[6];

		parcheggio[0] = new Veicolo("AB123CD", "X1", "MarcaA", 4);
		parcheggio[1] = new Auto("EF456GH", "Golf", "Volkswagen", 5, 4);
		parcheggio[2] = new Camion("IJ789KL", "Actros", "Mercedes", 2, 18000);
		parcheggio[3] = new Auto("MN012OP", "Civic", "Honda", 5, 4);
		parcheggio[4] = new Camion("QR345ST", "F-150", "Ford", 3, 12000);
		parcheggio[5] = new Veicolo("UV678WX", "Model S", "Tesla", 5);

		for (Veicolo v : parcheggio) {
			System.out.println(v);
		}
	}
}
