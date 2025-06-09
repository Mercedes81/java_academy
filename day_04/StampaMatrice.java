package Day_04;

public class StampaMatrice {

	public static void main(String[] args) {
		// Definizione della matrice 2D
		int[][] matrice = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// Stampa degli elementi della matrice
		System.out.println("Elementi della matrice:");

		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {

				System.out.print(matrice[i][j] + " ");
			}
			System.out.println(); // Vai a capo dopo ogni riga
		}
	}
}