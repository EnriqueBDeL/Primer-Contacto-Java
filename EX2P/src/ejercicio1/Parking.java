package ejercicio1;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * dd)Crear una nueva clase llamada Parking que debe contener el método main. 
 * Dentro de esta clase se debe almacenar una colección de vehículos identificados por su matrícula. 
 * Los vehículos se almacenarán y recuperarán a partir de su matrícula. Se debe insertar en el parking,
 * al menos, un vehículo de cada tipo (coche, camión y furgoneta).
 */


public class Parking {

    private Map<String, Vehiculos> coleccionVehiculos = new HashMap<>();

    
/**
 * e)En la clase Parking cree un nuevo método para mostrar la matrícula y
 * el tipo de vehículo de cada vehículo que contiene (por ejemplo: 1234BCD Camión, 9999ZZZ Coche, 3128FGN Furgoneta).
 */
    
    public void mostrarVehiculos() {
        for (Vehiculos v : coleccionVehiculos.values()) {
            System.out.println(v.getMatricula() + " " + v.getClass().getSimpleName());
        }
    }

    
    
    
    public static void main(String[] args) {
        Parking parking = new Parking();

        Coche coche1 = new Coche(4,true,"9999ZZZ");
        Camiones camion1 = new Camiones("1234BCD");
        Furgonetas furgoneta1 = new Furgonetas("3128FGN");

        parking.coleccionVehiculos.put(coche1.getMatricula(), coche1);
        parking.coleccionVehiculos.put(camion1.getMatricula(), camion1);
        parking.coleccionVehiculos.put(furgoneta1.getMatricula(), furgoneta1);

        parking.mostrarVehiculos();
        
        System.out.println();
        
        System.out.println(coche1.equals(camion1));
        
        
        Coche coche2 = new Coche(4,true,"9999ZZZ");
        Camiones camion2 = new Camiones("9999ZZZ");
        
        System.out.println(coche2.equals(camion2));

        
        
        System.out.println();

 
        Remolque remolque = new Remolque("3456YFG", 45);
        Camiones camionConRemolque = new Camiones(remolque, "Ford", "3456GFH", 100);

         
        try {
            camionConRemolque.acelerar(120);
        } catch (DemasiadoRapidoException ex) {
            Logger.getLogger(Parking.class.getName()).log(Level.SEVERE, null, ex);
        }

        
     
        
    }
}
