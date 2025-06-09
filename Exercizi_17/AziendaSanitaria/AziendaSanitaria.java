package Exercizi_17.AziendaSanitaria;

/*
 * Un’azienda sanitaria desidera creare un archivio elettronico per la gestione
 * dei propri medici di base e delle liste dei relativi pazienti. Si sviluppi
 * una classe Medico avente il nominativo (stringa) come variabili d’istanza, un
 * metodo d’accesso ed un costruttore. Si sviluppi inoltre una classe Paziente
 * avente come variabili d’istanza il numero (intero) di tessera sanitaria ed un
 * riferimento al proprio medico curante, con i relativi metodi di accesso ed un
 * costruttore. Si sviluppi la classe AziendaSanitaria, coi seguenti metodi: Il
 * metodo aggPaziente inserisce un oggetto paziente nella arraylist pazienti,
 * con un riferimento al proprio medico curante nella arraylist medici. Non
 * devono mai essere duplicati pazienti o medici. Il metodo listaMedico
 * restituisce una arraylist con tutti e soli i pazienti che hanno il medico
 * specificato dal parametro esplicito come medico curante. Il metodo statMedico
 * restituisce un riferimento al medico nella arraylist medici avente il maggior
 * numero di pazienti. Sviluppare tutti i metodi della classe AziendaSanitaria
 * 
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AziendaSanitaria {
	private ArrayList<Medico> medici;
	private ArrayList<Paziente> pazienti;

	public AziendaSanitaria() {
		medici = new ArrayList<>();
		pazienti = new ArrayList<>();
	}

	public boolean aggPaziente(Paziente p) {
		if (!pazienti.contains(p)) {
			pazienti.add(p);
		} else {
			return false; // paziente già presente
		}

		if (!medici.contains(p.getMedicoCurante())) {
			medici.add(p.getMedicoCurante());
		}

		return true;
	}

	public ArrayList<Paziente> listaMedico(Medico medico) {
		ArrayList<Paziente> lista = new ArrayList<>();
		for (Paziente p : pazienti) {
			if (p.getMedicoCurante().equals(medico)) {
				lista.add(p);
			}
		}
		return lista;
	}

	public Medico statMedico() {
		HashMap<Medico, Integer> conteggio = new HashMap<>();

		for (Paziente p : pazienti) {
			Medico m = p.getMedicoCurante();
			conteggio.put(m, conteggio.getOrDefault(m, 0) + 1);
		}

		Medico maxMedico = null;
		int max = 0;

		for (Map.Entry<Medico, Integer> entry : conteggio.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxMedico = entry.getKey();
			}
		}

		return maxMedico;
	}
}
