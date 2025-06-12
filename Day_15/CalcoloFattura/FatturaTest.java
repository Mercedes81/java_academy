package Day_15.CalcoloFattura;

public class FatturaTest {

	public static void main(String[] args) {

		/*
		 * //costuttore default Cliente paoloRossi = new Cliente();
		 * paoloRossi.setCf("cf1"); paoloRossi.setNome("paolo");
		 * paoloRossi.setCognome("rossi"); paoloRossi.setPrezzoDaPagare(new BigDecimal
		 * ("1200.00"));
		 * 
		 * System.out.println(paoloRossi.toString());
		 * 
		 * //oggetto con costruttore parametrico Cliente gianlucaVacchi = new Cliente(
		 * " cf2","gianluca","vacchi","1300.00");
		 * System.out.println(gianlucaVacchi.toString());
		 */
//		ClienteLuce paolorossi = new ClienteLuce("cf2","paolo","rossi",80.00);
//		System.out.println(paolorossi.toString());
		ClienteFisso marianeri = new ClienteFisso("cf3", "maria", "neri", ContrattoFisso.SPECIAL);

		System.out.println(marianeri.toString());

	}
}
