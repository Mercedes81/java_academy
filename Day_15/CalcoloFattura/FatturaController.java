package Day_15.CalcoloFattura;

import java.math.BigDecimal;

public class FatturaController {
	public static void calcolofattura(Cliente cliente) {
		if (cliente instanceof ClienteLuce) {

			ClienteLuce clienteLuce = (ClienteLuce) cliente;
			if (clienteLuce.getKwh() < 300) {
				clienteLuce.setPrezzoKwh(new BigDecimal("0.25"));
				clienteLuce.setPrezzoDaPagare(new bigDecimal ("" + (clienteLuce.getKwh() * clienteLuce.getPrezzoDaPagare()).tost;);
			}
		}

	}
}