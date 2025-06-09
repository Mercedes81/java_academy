package Exercizi_17.Parcheggio;

import java.util.ArrayList;

import Exercizi_17.Parcheggio.ClasseVettura.Vettura;

public class Main {
	public static void main(String[] args) {
		Parcheggio parcheggio = new Parcheggio(3);

		Vettura v1 = new Vettura(123456, (short) 10, (short) 14);
		Vettura v2 = new Vettura(654399, (short) 11, (short) 15);
		Vettura v3 = new Vettura(789299, (short) 12, (short) 16);

		parcheggio.entraVettura(v1);
		parcheggio.entraVettura(v2);
		parcheggio.entraVettura(v3);

		parcheggio.promozione(99, 2); // solo v2 e v3 ricevono la promozione
		parcheggio.aggiornaOra(); // incrementa ora e rimuove scadute

		ArrayList<Vettura> top = parcheggio.statVetture();
		System.out.println("Vetture con più ore pagate:");
		for (Vettura v : top) {
			System.out.println(v);
		}

		parcheggio.stampaStato();
	}
}
