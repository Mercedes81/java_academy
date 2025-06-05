package day_07.dipendente;

public class DipendenteController {
	public static void raiseSalary(Employee emp, double byPercent) {
		double incremento = emp.getStipendio() * (1 + byPercent);
		emp.setStipendio(incremento + emp.getStipendio());
	}
}