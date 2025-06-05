package Biblioteca;

public class BibliotecaTest {
	public static void main(String[] args) {
		Data oggi = new Data(31, 5, 2025);
		Archivio archivio = new Archivio(oggi);

		archivio.nuovoUtente("Anna", "Bianchi");
		archivio.nuovoLibro("Il Signore degli Anelli");

		int indiceUtente = archivio.trovaUtente("Anna", "Bianchi");
		Abbonato anna = archivio.getAbbonati().get(indiceUtente);
		Libro libro = archivio.getLibri().get(0);

		archivio.presta(libro, anna);
		archivio.stampaStato();

		archivio.aggiorna();
		System.out.println("\nDopo aggiornamento:");
		archivio.stampaStato();

		System.out.println("\nNumero libri di Anna: " + archivio.numLibri(anna));
	}
}