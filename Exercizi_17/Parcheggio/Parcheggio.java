package Exercizi_17.Parcheggio;

import Exercizi_17.Parcheggio.ClasseVettura.Vettura;

/*Si desidera simulare un parcheggio a pagamento per autovetture. Si sviluppi 
la classe Vettura, avente le variabili d’istanza private int targa, private short 
oraArrivo, private short oraScadenza, dove le ore sono interi compresi tra 0 e 
23. Implementare i relativi metodi di accesso e riscrittura per tali variabili, più 
un costruttore. Il parcheggio è rappresentato mediante la classe Parcheggio. Il 
costruttore inizializza un parcheggio con massima capienza numPosti e 0 
vetture.
 I metodi entraVettura ed esceVettura aggiungono e rimuovono, 
rispettivamente, le vetture dei clienti del parcheggio. Viene restituito il valore 
true solo nel caso l’operazione possa essere eseguita. Il metodo aggiornaOra 
incrementa di una unità l’ora corrente, e sposta nella zona rimozione tutte le 
vetture il cui tempo sia scaduto. Il metodo promozione offre gratuitamente 
oreGratuite ore a tutte le vetture nel parcheggio il cui numero di targa termini 
con le cifre codice, dove codice deve essere un numero di due cifre.  
Il metodo statVetture restituisce una arraylist con tutte le vetture che hanno il 
più alto numero di ore di parcheggio pagato. Sviluppare tutti i metodi della 
classe. 
 * 
 */
public class Parcheggio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.Iterator;

		public class Parcheggio {
		    private int numPosti;
		    private int oraCorrente;
		    private ArrayList<Vettura> vetturePresenti;
		    private ArrayList<Vettura> vettureRimosse;

		    public Parcheggio(int numPosti) {
		        this.numPosti = numPosti;
		        this.oraCorrente = 0;
		        this.vetturePresenti = new ArrayList<>();
		        this.vettureRimosse = new ArrayList<>();
		    }

		    public boolean entraVettura(Vettura v) {
		        if (vetturePresenti.size() < numPosti) {
		            vetturePresenti.add(v);
		            return true;
		        }
		        return false;
		    }

		    public boolean esceVettura(Vettura v) {
		        return vetturePresenti.remove(v);
		    }

		    public void aggiornaOra() {
		        oraCorrente = (oraCorrente + 1) % 24;
		        Iterator<Vettura> iterator = vetturePresenti.iterator();
		        while (iterator.hasNext()) {
		            Vettura v = iterator.next();
		            if (v.getOraScadenza() <= oraCorrente) {
		                vettureRimosse.add(v);
		                iterator.remove();
		            }
		        }
		    }

		    public void promozione(int codice, int oreGratuite) {
		        for (Vettura v : vetturePresenti) {
		            int ultimeDueCifre = v.getTarga() % 100;
		            if (ultimeDueCifre == codice) {
		                short nuovaScadenza = (short)((v.getOraScadenza() + oreGratuite) % 24);
		                v.setOraScadenza(nuovaScadenza);
		            }
		        }
		    }

		    public ArrayList<Vettura> statVetture() {
		        ArrayList<Vettura> result = new ArrayList<>();
		        int maxOre = -1;

		        for (Vettura v : vetturePresenti) {
		            int ore = v.orePagate();
		            if (ore > maxOre) {
		                result.clear();
		                result.add(v);
		                maxOre = ore;
		            } else if (ore == maxOre) {
		                result.add(v);
		            }
		        }

		        return result;
		    }

		    // Facoltativo: per visualizzare lo stato
		    public void stampaStato() {
		        System.out.println("Ora Corrente: " + oraCorrente);
		        System.out.println("Vetture Presenti: " + vetturePresenti.size());
		        for (Vettura v : vetturePresenti) {
		            System.out.println(v);
		        }
		        System.out.println("Vetture Rimosse: " + vettureRimosse.size());
		    }
		}

	}

}
