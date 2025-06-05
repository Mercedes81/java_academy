package Dia_09.Ereditarieta;

import java.time.LocalDate;

public class PersonaTest {

	public static void main(String[] args) {
		Uomo adamo = new Uomo("CF1", "Adamo", "Rossi", LocalDate.of(1970, 12, 8), "Roma", true);
		Donna eva = new Donna("CF2", "Eva", "Verdi", LocalDate.of(1982, 7, 12), "Firenze", "rosa");
		System.out.println(adamo.toString());
		System.out.println(eva.toString());
		Persona[] persona = persona
	}
}