package edu.ucam.jurassic.servidor;

import java.io.Serializable;

public class Dinosaurio implements Serializable{


	private static final long serialVersionUID = 1L;

	
	private String id;
	private String nombre;
	private String especie;
	private String nivelPeligrosidad;
	


	public Dinosaurio(String id, String nombre, String especie, String nivelPeligrosidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.nivelPeligrosidad = nivelPeligrosidad;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getEspecie() {
		return especie;
	}



	public void setEspecie(String especie) {
		this.especie = especie;
	}



	public String getNivelPeligrosidad() {
		return nivelPeligrosidad;
	}



	public void setNivelPeligrosidad(String nivelPeligrosidad) {
		this.nivelPeligrosidad = nivelPeligrosidad;
	}



	@Override
	public String toString() {
		return "Dinosaurio [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", nivelPeligrosidad="
				+ nivelPeligrosidad + "]";
	}



	
	
	
}
