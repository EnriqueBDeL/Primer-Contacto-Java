package edu.ucam.servior;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class ConstruccionCartas extends UnicastRemoteObject implements InterfazRemota {



	private static final long serialVersionUID = 1L;

	Hashtable<String, Carta> buzon = new Hashtable<String, Carta>();

	private int contador = 0;
	
	
	
	
	protected ConstruccionCartas() throws RemoteException {
		super();
		
		
	}

	
	
	@Override
	public String gestionarId() throws RemoteException {

		contador ++;
		return "C" + contador;
	
	}
	
	
	

	@Override
	public String enviarCarta(String fecha, String regalo, String nombre) throws RemoteException {

		 String idBuzon = gestionarId();
		
		if(buzon.containsKey(gestionarId())) {
			
			Carta c = new Carta(idBuzon, nombre, regalo, fecha);
			
			buzon.put(idBuzon, c);
			
			return "Carta enviada correctamente.";
			
		}else {
			
			return "La carta no se pudo crear.";
			
		}
	
	}


	
	@Override
	public String consultarCarta(String id) throws RemoteException {

	if(buzon.containsKey(id)) {
			
			Carta c2 = buzon.get(id);
			
			return c2.toString();
		
		}else {
			
			return "ID no encontrado";
			
		}
		
	}
	
	
	@Override
	public String eliminarCarta(String id) throws RemoteException {

		if(buzon.containsKey(id)) {
			
			buzon.remove(id);
			
			return "Carta eliminada.";
		
		}else {
			
			return "ID no encontrado";
			
		}
		
	}

	
	
	
	@Override
	public String modificarCarta(String id,String fecha, String regalo, String nombre) throws RemoteException {

		
		Carta c3 = new Carta(id, nombre, regalo, fecha);
		
		if(buzon.containsKey(id)) {
				
				buzon.replace(id, c3);
				
				return "Carta modificada con exito.";
			
			}else {
				
				return "ID no encontrado";
				
			}
	}




}
