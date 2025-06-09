package Exercizi_17.ArchivioElettronico;

public class TestArchivio {
	public static void main(String[] args) {
		Archivio archivio = new Archivio();

		archivio.aggiungiBrano("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock");
		archivio.aggiungiBrano("Love of My Life", "Queen", "A Night at the Opera", "Rock");
		archivio.aggiungiBrano("Thriller", "Michael Jackson", "Thriller", "Pop");
		archivio.aggiungiBrano("Beat It", "Michael Jackson", "Thriller", "Pop");
		archivio.aggiungiBrano("Billie Jean", "Michael Jackson", "Thriller", "Pop");
		archivio.aggiungiBrano("Smooth Criminal", "Michael Jackson", "Bad", "Pop");

		archivio.stampaArchivio();
	}
}
