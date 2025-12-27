package edu.ucam.servior;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazRemota extends Remote {

	public String gestionarId() throws RemoteException;
	public String enviarCarta(String fecha, String regalo, String nombre) throws RemoteException;
	public String consultarCarta(String id) throws RemoteException;
	public String eliminarCarta(String id) throws RemoteException;
	public String modificarCarta(String id,String fecha, String regalo, String nombre) throws RemoteException;
		
	
}
