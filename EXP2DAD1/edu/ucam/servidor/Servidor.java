package edu.ucam.servidor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String[] args) {
        try {

        	LocateRegistry.createRegistry(1099);
            
            CongresoImpl congreso = new CongresoImpl();
            
            Naming.rebind("rmi://localhost/CongresoService", congreso);
            
            System.out.println("Servidor iniciado y esperando al cliente...");
            
        } catch (Exception e) {
            System.err.println("ERROR: El servidor no se inició correctamente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
