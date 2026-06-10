package edu.ucam;

public class Pelicula {
	
	private String codigo;
	private String titulo;
	private double nota;

	public Pelicula() {}
	
	public Pelicula(String codigo, String titulo, double nota) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.nota = nota;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}
	
	

}
