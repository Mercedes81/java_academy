package Exercizi_17.ArchivioElettronico;

import java.util.ArrayList;

public class Archivio {
	private ArrayList<Brano> brani;
	private ArrayList<Artista> artisti;
	private ArrayList<Cd> cds;
	private ArrayList<Genere> generi;

	public Archivio() {
		brani = new ArrayList<>();
		artisti = new ArrayList<>();
		cds = new ArrayList<>();
		generi = new ArrayList<>();
	}

	public void aggiungiBrano(String titoloBrano, String nomeArtista, String titoloCd, String nomeGenere) {
		Artista artista = trovaOcreaArtista(nomeArtista);
		Cd cd = trovaOcreaCd(titoloCd);
		Genere genere = trovaOcreaGenere(nomeGenere);

		Brano brano = new Brano(titoloBrano, artista, cd, genere);
		brani.add(brano);
	}

	private Artista trovaOcreaArtista(String nome) {
		for (Artista a : artisti) {
			if (a.getNome().equalsIgnoreCase(nome)) {
				return a;
			}
		}
		Artista nuovo = new Artista(nome);
		artisti.add(nuovo);
		return nuovo;
	}

	private Cd trovaOcreaCd(String titolo) {
		for (Cd c : cds) {
			if (c.getTitolo().equalsIgnoreCase(titolo)) {
				return c;
			}
		}
		Cd nuovo = new Cd(titolo);
		cds.add(nuovo);
		return nuovo;
	}

	private Genere trovaOcreaGenere(String nome) {
		for (Genere g : generi) {
			if (g.getNome().equalsIgnoreCase(nome)) {
				return g;
			}
		}
		Genere nuovo = new Genere(nome);
		generi.add(nuovo);
		return nuovo;
	}

	public void stampaArchivio() {
		for (Brano b : brani) {
			System.out.println(b);
		}
	}
}
