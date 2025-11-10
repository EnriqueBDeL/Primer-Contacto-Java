package privado;

public class Equipo {

	private String nombre;
	private int numeroJugadores;
	
	
	
	
	public Equipo(String nombre, int numeroJugadores) {
		this.nombre = nombre;
		this.numeroJugadores = numeroJugadores;
	}


	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNumeroJugadores() {
		return numeroJugadores;
	}


	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}





	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", numeroJugadores=" + numeroJugadores + "]";
	}
	
	
	
	
	
	
	
}
