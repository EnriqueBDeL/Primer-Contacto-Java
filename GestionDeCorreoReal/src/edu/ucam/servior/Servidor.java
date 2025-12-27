package edu.ucam.servior;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

	public static void main(String[] args){

		try {
		
		LocateRegistry.createRegistry(1099);
		ConstruccionCartas cc = new ConstruccionCartas();
		Naming.rebind("rmi://localhost/GestionCorreoReal",cc);
		
		System.out.println("Servidor iniciado y esperando al cliente...");
		
		}catch(Exception e) {
			
			System.err.println("ERROR al iniciar el servidor.");

		}
		
	}
	

}
