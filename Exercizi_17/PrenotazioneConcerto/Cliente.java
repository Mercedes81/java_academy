package Exercizi_17.PrenotazioneConcerto;

/* Un’agenzia per il turismo desidera gestire automaticamente la prenotazione 
dei posti per un concerto. Si sviluppi una classe Cliente avente come variabili 
d’istanza il nominativo ed numero telefonico del cliente, rappresentati 
entrambi come stringhe, con i relativi metodi di accesso ed un costruttore. Si 
sviluppi inoltre la seguente classe:
 public class Spettacolo { 
private Cliente[] prenotazioni; 
private int n_prenotazione; 
private ArrayList attesa; 
public Spettacolo(int n){...} 
public boolean libero(){...} 
public int trova(String nome, String tel){...} 
public void prenota(String nome, String tel){...} 
public void disdici(String nome, String tel){...} 
public boolean incompleto(){...} 
} 
 L’array prenotazioni contiene i clienti che hanno il posto, la lista attesa 
contiene i clienti in lista d’attesa. La lista d’attesa deve essere gestita con la 
politica primo arrivato, primo servito. Il costruttore inizializza una classe con 
un array prenotazioni (inizialmente vuoto) avente lunghezza n specificata 
come parametro. Il metodo libero restituisce true solo se vi sono posti ancora 
liberi. Il metodo trova restituisce 0 se il cliente specificato ha il posto, 1 se il 
cliente è in attesa e -1 altrimenti. Il metodo prenota inserisce il cliente 
specificato nell’oggetto (eventualmente in attesa).
 Il metodo disdici rimuove il cliente specificato dall’oggetto. Nel caso venga 
liberato un posto in prenotazioni, viene trasferito il primo cliente da attesa. 
Infine, il metodo incompleto restituisce true se esiste almeno un cliente che 
abbia almeno un posto ed almeno una prenotazione in attesa; il metodo 
restituisce false in caso contrario.
 P
 * 
 */
public class Cliente {
	private String nome;
	private String telefono;

	public Cliente(String nome, String telefono) {
		this.nome = nome;
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente altro = (Cliente) obj;
			return this.nome.equalsIgnoreCase(altro.getNome()) && this.telefono.equals(altro.getTelefono());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return nome.toLowerCase().hashCode() + telefono.hashCode();
	}
}