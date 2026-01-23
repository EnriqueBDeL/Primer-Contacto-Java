package codigos;

import java.sql.Timestamp;

public class Coche {

	private String matricula;
	private Timestamp horaEntrada;
	
	
	public Coche(String matricula) {
		super();
		this.matricula = matricula;
		this.horaEntrada = null;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public Timestamp getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(Timestamp horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	
	
	
	 
}
