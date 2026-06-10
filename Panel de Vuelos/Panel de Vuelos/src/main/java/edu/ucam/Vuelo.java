package edu.ucam;

public class Vuelo {

	private String codigo;
	private String destino;
	private String aerolinea;
	private double precio;
	
	public Vuelo() {}
	
	public Vuelo(String codigo, String destino, String aerolinea, double precio) {
		super();
		this.codigo = codigo;
		this.destino = destino;
		this.aerolinea = aerolinea;
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
