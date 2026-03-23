package edu.ucam.domain;

public class Cancion {
	private String id;
	private String titulo;
	private String artista;
	private int reproducciones;
	private boolean favorita;
	
	
	public Cancion(String id, String titulo, String artista, int reproducciones) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.artista = artista;
		this.reproducciones = reproducciones;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public int getReproducciones() {
		return reproducciones;
	}


	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}


	public boolean isFavorita() {
		return favorita;
	}


	public void setFavorita(boolean favorita) {
		this.favorita = favorita;
	}
	
	
	
	
}
