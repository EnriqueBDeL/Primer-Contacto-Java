package edu.ucam.domain;

public class Barco {

	private String matricula;
	private String nombre;
	private int eslora;
	private boolean enPuerto = true;
	
	
	public Barco(String matricula, String nombre, int eslora) {
		super();
		this.matricula = matricula;
		this.nombre = nombre;
		this.eslora = eslora;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEslora() {
		return eslora;
	}


	public void setEslora(int eslora) {
		this.eslora = eslora;
	}


	public boolean isEnPuerto() {
		return enPuerto;
	}


	public void setEnPuerto(boolean enPuerto) {
		this.enPuerto = enPuerto;
	}
	
	
	
}
