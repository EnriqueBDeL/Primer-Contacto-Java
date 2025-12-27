package edu.ucam.jurassic.servidor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {

	public static void main(String[] args) {

		try {
		
		LocateRegistry.createRegistry(1099);
		LaboratorioCentral laboratorio = new LaboratorioCentral();
		Naming.rebind("rmi://localhost/LaboratorioCentral", laboratorio);
		System.out.println("Servidor concetado. Esperando cliente...");
		
		}catch(Exception e) {
			
		}
	}

}
