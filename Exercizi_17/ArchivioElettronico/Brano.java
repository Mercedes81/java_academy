package Exercizi_17.ArchivioElettronico;

public class Brano {
	private String titolo;
	private Artista artista;
	private Cd album;
	private Genere genere;

	public Brano(String titolo, Artista artista, Cd album, Genere genere) {
		this.titolo = titolo;
		this.artista = artista;
		this.album = album;
		this.genere = genere;
	}

	public String getTitolo() {
		return titolo;
	}

	public Artista getArtista() {
		return artista;
	}

	public Cd getAlbum() {
		return album;
	}

	public Genere getGenere() {
		return genere;
	}

	@Override
	public String toString() {
		return titolo + " | " + artista + " | " + album + " | " + genere;
	}
}
