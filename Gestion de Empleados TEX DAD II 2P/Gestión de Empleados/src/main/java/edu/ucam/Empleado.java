package edu.ucam;

public class Empleado {

	private int id;
	private String dni;
	private String nombre;
	private double salario;
	private boolean activo;

	public Empleado(String dni, String nombre) {
		
		this.dni = dni;
		this.nombre = nombre;
		
	}
	
	public Empleado(int id, String dni, String nombre, double salario, boolean activo) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.salario = salario;
		this.activo = activo;
	}
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDni() {
		return dni;
	}



	public void setDni(String dni) {
		this.dni = dni;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public boolean isActivo() {
		return activo;
	}



	public void setActivo(boolean activo) {
		this.activo = activo;
	}




	
	
}
