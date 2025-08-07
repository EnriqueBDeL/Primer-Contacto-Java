
package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

   
    public static void main(String[] args) {

        AvionesComerciales ac1 = new AvionesComerciales(200,"AirBus",600);
        
        Drones d1 = new Drones(true,60,"Xiaomi",50);
        
        Helicopteros h1 = new Helicopteros(Tipo.privados,"Pegasus",300);
        
        
        Hangar h = new Hangar();
        
        h.meterAeronave(ac1);
        h.meterAeronave(d1);
        h.meterAeronave(h1);
        
        System.out.println(h.buscarAeronave(0));
        System.out.println(h.buscarAeronave(1));
        System.out.println(h.buscarAeronave(2));
        
        
        try {
            ac1.despegue(400);
            d1.despegue(100);
            h1.despegue(501);
        } catch (VelocidadExcesivaException ex) {
                System.out.println(ex.getMessage());         
        }
       
        
        
        try {
            ac1.aterrizar(600);
            d1.aterrizar(200);
            h1.aterrizar(300);
        } catch (VelocidadExcesivaException ex) {
            System.out.println(ex.getMessage());        
        }
        
        
       System.out.println("\nListado de aeronaves en el hangar:");
        for (Aeronave a : h.getAeronaves()) {
            System.out.println("Registro: " + a.getNumeroRegistro() + " - Tipo: " + a.getClass().getSimpleName() + " - Marca: " + a.getMarca());
        }

        
        
    }
    
}
