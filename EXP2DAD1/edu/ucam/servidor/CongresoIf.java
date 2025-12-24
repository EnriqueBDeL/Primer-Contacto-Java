package edu.ucam.servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CongresoIf  extends Remote{

	
	public String registrarCongreso(String descripcion,String fecha)throws RemoteException;
	public String consultarCongreso(String id)throws RemoteException;
	public String modificarCongreso(String id, String descripcion, String fecha)throws RemoteException;
	public String eliminarCongreso(String id)throws RemoteException;
	
	
}
