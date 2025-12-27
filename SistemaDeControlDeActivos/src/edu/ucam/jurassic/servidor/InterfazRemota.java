package edu.ucam.jurassic.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfazRemota extends Remote {

	public String incubar(String nombre, String especie, String nivelPeligrosidad) throws RemoteException;
	public String localizar(String id) throws RemoteException;
	public String trasladar(String id,String nombre, String especie, String nivelPeligrosidad) throws RemoteException;
	public String darDeBaja(String id) throws RemoteException;	
	
}
