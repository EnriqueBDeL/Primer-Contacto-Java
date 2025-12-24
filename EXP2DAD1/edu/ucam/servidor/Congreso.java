package edu.ucam.servidor;

import java.io.Serializable;

public class Congreso implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String id;
    private String descripcion;
    private String fecha;

   
    
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||	
	public Congreso(String id, String descripcion, String fecha) {
     
		this.id = id;
		
        this.descripcion = descripcion;
        
        this.fecha = fecha;
        
    }
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}




	@Override
	public String toString() {
		return "Congreso [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
