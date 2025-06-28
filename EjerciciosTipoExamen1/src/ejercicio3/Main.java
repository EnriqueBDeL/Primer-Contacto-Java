
package ejercicio3;

import java.util.List;


public class Main {

   
    public static void main(String[] args) {

        Coche c = new Coche(4,"Ford","Mustang",2024,240);
        
        Garaje<Vehiculos> g = new Garaje<>();
        
        g.añadirVehiculo(c);
        
        System.out.println(g.obtenerVehiculo(0));
        
        c.arrancar();
        c.arrancar(2);
      
    }
    
}
