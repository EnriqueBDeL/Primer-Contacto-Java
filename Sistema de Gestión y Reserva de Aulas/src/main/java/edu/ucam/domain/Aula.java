package edu.ucam.domain;

public class Aula {

	private String id;
	private String nombre;
	private int capacidad;
	private boolean tieneProyecto;
	private boolean reservada = false;
	
	
	
	public Aula(String id, String nombre, int capacidad, boolean tieneProyecto) {
		
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad; 
		this.tieneProyecto = tieneProyecto;
		
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneProyecto() {
		return tieneProyecto;
	}

	public void setTieneProyecto(boolean tieneProyecto) {
		this.tieneProyecto = tieneProyecto;
	}

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}
	
	
	
	
}
