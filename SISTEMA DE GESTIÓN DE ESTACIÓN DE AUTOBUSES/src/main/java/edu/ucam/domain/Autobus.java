package edu.ucam.domain;

public class Autobus {

	private String matricula;
	private String destino;
	private int plazas;
	private boolean enRuta = false;
	
	
	public Autobus(String matricula, String destino, int plazas) {
		
		this.matricula = matricula;
		this.destino = destino;
		this.plazas = plazas;
		
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public int getPlazas() {
		return plazas;
	}


	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}


	public boolean isEnRuta() {
		return enRuta;
	}


	public void setEnRuta(boolean enRuta) {
		this.enRuta = enRuta;
	}
	
	

	
	
}
