package Exercizi_17;

import java.util.Arrays;
/*
 * Per mancanza di un chiodo di ferro di cavallo, un regno fu perso, o almeno
 * così recita il proverbio. Dato un elenco di input, genera il proverbio
 * pertinente. Ad esempio, dato l'elenco ["nail", "shoe", "horse", "rider",
 * "message", "battle", "kingdom"], otterrai il testo completo di questa
 * filastrocca proverbiale: For want of a nail the shoe was lost. For want of a
 * shoe the horse was lost. For want of a horse the rider was lost. For want of
 * a rider the message was lost. For want of a message the battle was lost. For
 * want of a battle the kingdom was lost. And all for the want of a nail. Nota
 * che l'elenco degli input può variare; la tua soluzione dovrebbe essere in
 * grado di gestire elenchi di lunghezza e contenuto arbitrari. Nessuna riga del
 * testo di output dovrebbe essere una stringa statica e immutabile; tutto
 * dovrebbe variare in base all'input fornito import java.util.List; import
 * java.util.Arrays;
*/
import java.util.List;

public class Proverbio {

	/**
	 * Genera il proverbio "For want of a ..." a partire da una lista di elementi.
	 *
	 * @param items lista di stringhe (deve contenere almeno 2 elementi)
	 * @return una singola stringa con le righe del proverbio separate da '\n'
	 * @throws IllegalArgumentException se la lista contiene meno di 2 elementi
	 */
	public static String generaProverbio(List<String> items) {
		if (items == null || items.size() < 2) {
			throw new IllegalArgumentException("La lista deve contenere almeno 2 elementi");
		}

		StringBuilder sb = new StringBuilder();
		int n = items.size();

		// Costruisci le frasi "For want of a X the Y was lost."
		for (int i = 0; i < n - 1; i++) {
			sb.append("For want of a ").append(items.get(i)).append(" the ").append(items.get(i + 1))
					.append(" was lost.").append("\n");
		}

		// Aggiungi la frase finale "And all for the want of a FIRST."
		sb.append("And all for the want of a ").append(items.get(0)).append(".");

		return sb.toString();
	}

	public static void main(String[] args) {
		// Esempio di utilizzo con la sequenza classica
		List<String> elementi = Arrays.asList("nail", "shoe", "horse", "rider", "message", "battle", "kingdom");

		String proverbio = generaProverbio(elementi);
		System.out.println(proverbio);
	}
}
