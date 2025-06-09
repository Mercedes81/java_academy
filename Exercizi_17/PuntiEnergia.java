package Exercizi_17;

/* Lavori per un'azienda che realizza un gioco fantasy-survival online.
 Quando un giocatore termina un livello, gli vengono assegnati punti energia. 
La quantità di energia assegnata dipende dagli oggetti magici che il giocatore 
ha trovato durante l'esplorazione di quel livello.
 Istruzioni
 Il tuo compito è scrivere il codice che calcola i punti energia che vengono 
assegnati ai giocatori quando completano un livello.
 I punti assegnati dipendono da due fattori:
 Il livello (un numero) che il giocatore ha completato.
 Il valore base di ogni oggetto magico raccolto dal giocatore durante quel 

 I punti energia vengono assegnati secondo le seguenti regole:
 1. Per ogni oggetto magico, prendi il valore base e trova tutti i multipli di quel 
valore che sono inferiori al numero del livello.
 2. Combina le serie di numeri.
 3. Rimuovi eventuali duplicati.
 4. Calcola la somma di tutti i numeri rimasti.
 Diamo un'occhiata a un esempio:
 Il giocatore ha completato il livello 20 e ha trovato due oggetti magici con 
valori base di 3 e 5.
 Per calcolare i punti energia guadagnati dal giocatore, dobbiamo trovare tutti i 
multipli univoci di questi valori base che sono inferiori al livello 20.

 ● Multipli di 3 inferiori a 20:{3, 6, 9, 12, 15, 18}
 ● Multipli di 5 inferiori a 20:{5, 10, 15}
 ● Combina i set e rimuovi i duplicati:{3, 5, 6, 9, 10, 12, 15, 18}
 ● Somma i multipli univoci:3 + 5 + 6 + 9 + 10 + 12 + 15 + 18 = 78
 ● Pertanto, il giocatore guadagna 78 punti energia per aver completato il 
livello 20 e trovato i due oggetti magici con valori base di 3 e 5
 * 
 */
import java.util.HashSet;
import java.util.Set;

public class PuntiEnergia {

	/**
	 * Calcola i punti energia per un livello completato, sommando tutti i multipli
	 * unici dei valori base inferiori al livello.
	 *
	 * @param livello    il numero del livello superato (multipli < livello)
	 * @param valoriBase array di valori base degli oggetti magici
	 * @return somma di tutti i multipli univoci inferiori al livello
	 */
	public static int calcolaEnergia(int livello, int[] valoriBase) {
		Set<Integer> multipli = new HashSet<>();

		for (int base : valoriBase) {
			// per ogni base, generiamo i multipli: base, 2*base, 3*base, ... < livello
			for (int m = base; m < livello; m += base) {
				multipli.add(m);
			}
		}

		// sommiamo tutti i multipli unici
		int somma = 0;
		for (int m : multipli) {
			somma += m;
		}
		return somma;
	}

	public static void main(String[] args) {
		int livello = 20;
		int[] valoriBase = { 3, 5 };

		int energia = calcolaEnergia(livello, valoriBase);
		System.out.println("Punti energia guadagnati: " + energia);
		// Output atteso: 78
	}
}