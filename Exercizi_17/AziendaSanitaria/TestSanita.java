package Exercizi_17.AziendaSanitaria;

public class TestSanita {
	public static void main(String[] args) {
		AziendaSanitaria azienda = new AziendaSanitaria();

		Medico m1 = new Medico("Dott. Rossi");
		Medico m2 = new Medico("Dott.ssa Verdi");
		Medico m3 = new Medico("Dott. Bianchi");

		azienda.aggPaziente(new Paziente(1001, m1));
		azienda.aggPaziente(new Paziente(1002, m2));
		azienda.aggPaziente(new Paziente(1003, m1));
		azienda.aggPaziente(new Paziente(1004, m2));
		azienda.aggPaziente(new Paziente(1005, m1));
		azienda.aggPaziente(new Paziente(1006, m3));
		azienda.aggPaziente(new Paziente(1007, m3));
		azienda.aggPaziente(new Paziente(1008, m1));
		azienda.aggPaziente(new Paziente(1009, m2));
		azienda.aggPaziente(new Paziente(1010, m2));

		System.out.println("Pazienti del " + m1.getNominativo() + ":");
		for (Paziente p : azienda.listaMedico(m1)) {
			System.out.println(p);
		}

		System.out.println("\nMedico con più pazienti:");
		System.out.println(azienda.statMedico());
	}
}
