package edu.ucam;

public class Reserva {

	private String localizador;
	private String cliente;
	private int noches;
	private double precio;
	
	public Reserva() {}
	
	public Reserva(String localizador, String cliente, int noches, double precio) {
		super();
		this.localizador = localizador;
		this.cliente = cliente;
		this.noches = noches;
		this.precio = precio;
	}

	public String getLocalizador() {
		return localizador;
	}

	public void setLocalizador(String localizador) {
		this.localizador = localizador;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNoches() {
		return noches;
	}

	public void setNoches(int noches) {
		this.noches = noches;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
