package edu.ucam.servior;

import java.io.Serializable;

public class Carta implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String nombre;
	private String ragalo;
	private String fecha;

	public Carta(String id, String nombre, String ragalo, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ragalo = ragalo;
		this.fecha = fecha;
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

	public String getRagalo() {
		return ragalo;
	}

	public void setRagalo(String ragalo) {
		this.ragalo = ragalo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [id=" + id + ", nombre=" + nombre + ", ragalo=" + ragalo + ", fecha=" + fecha + "]";
	}

}
