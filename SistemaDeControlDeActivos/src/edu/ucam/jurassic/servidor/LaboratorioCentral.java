package edu.ucam.jurassic.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class LaboratorioCentral extends UnicastRemoteObject implements InterfazRemota {




	private static final long serialVersionUID = 1L;

	Hashtable<String,Dinosaurio> almacen = new Hashtable<String,Dinosaurio>();

	private int contador = 0;
	
	
	
	protected LaboratorioCentral() throws RemoteException {
		super();
	}
	
	
	
	public String generadorId(){
		
		contador++;
		
		return "D" + contador;
	}
	
	
	@Override
	public String incubar( String nombre, String especie, String nivelPeligrosidad) throws RemoteException {

		
		String id = generadorId();
		
		if(!almacen.containsKey(id)) {
			
			Dinosaurio d = new Dinosaurio(id,nombre,especie,nivelPeligrosidad);
			
			almacen.put(id, d);
			
			return "Dinosaurio creado correctamente con el id: " + id;
			
		}else {
			
			return "ERRO: El id ya está e uso.";
		}
		
		
	}

	@Override
	public String localizar(String id) throws RemoteException {

		if(almacen.containsKey(id)) {
			
			Dinosaurio d = almacen.get(id);
						
			return d.toString();
			
		}else {
			
			return "ERRO: El dinosaurio con ese id no existe.";
		}
		
	}

	@Override
	public String trasladar(String id,String nombre, String especie, String nivelPeligrosidad) throws RemoteException {

		if(almacen.containsKey(id)) {
			
			Dinosaurio d = new Dinosaurio(id,nombre,especie,nivelPeligrosidad);
			
			almacen.replace(id, d);
						
			return "Dinoasaurio trasladado.";
			
		}else {
			
			return "ERRO: El dinosaurio con ese id no existe.";
		}
		
	}

	@Override
	public String darDeBaja(String id) throws RemoteException {
	
		if(almacen.containsKey(id)) {
			
			almacen.remove(id);
						
			return "Dinoasaurio eliminado.";
			
		}else {
			
			return "ERRO: El dinosaurio con ese id no existe.";
		}
	}
	
	
	
	
}
