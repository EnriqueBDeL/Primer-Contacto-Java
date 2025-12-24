package edu.ucam.servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Hashtable;

public class CongresoImpl extends UnicastRemoteObject implements CongresoIf { 

    private static final long serialVersionUID = 1L;
    
    
    private Hashtable<String, Congreso> baseDeDatos; 
    private int contador = 0;

    
    
    public CongresoImpl() throws RemoteException {
        super();
        baseDeDatos = new Hashtable<>();
    }

    
    
    public String generadorId() {
        contador++;
        return "C" + contador;
    }

    
    
    @Override
    public String registrarCongreso(String descripcion, String fecha) throws RemoteException {
        String id = generadorId();
        baseDeDatos.put(id, new Congreso(id, descripcion, fecha));
        return "Congreso registrado con éxito. ID asignado: " + id;
    }
    
    
    

    @Override
    public String consultarCongreso(String id) throws RemoteException {
        if (baseDeDatos.containsKey(id)) {
            return baseDeDatos.get(id).toString();
        } else {
            return "Error: No existe un congreso con ese ID.";
        }
    }

    
    
    @Override
    public String modificarCongreso(String id, String descripcion, String fecha) throws RemoteException {
        if (baseDeDatos.containsKey(id)) {
            Congreso c = new Congreso(id, descripcion, fecha);
            baseDeDatos.replace(id, c);
            return "Congreso " + id + " actualizado correctamente.";
        } else {
            return "Error: No existe ese ID para modificar.";
        }
    }

    
    
    @Override
    public String eliminarCongreso(String id) throws RemoteException {
        if (baseDeDatos.containsKey(id)) {
            baseDeDatos.remove(id);
            return "Congreso " + id + " eliminado correctamente.";
        } else {
            return "Error: No existe ese ID para eliminar.";
        }
    }
}
