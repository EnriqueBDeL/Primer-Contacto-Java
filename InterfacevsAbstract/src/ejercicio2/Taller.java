
package ejercicio2;

import java.util.ArrayList;
import java.util.List;



public class Taller {

  /**
   * Ejercicio 2:
   * Se necesita representar diferentes vehículos (auto, moto, camión) para un taller mecánico.
   * Cada vehículo debería permitir:

        - Arrancar el motor y mostrar un mensaje acorde.

        - Realizar una revisión general (usando datos como marca y modelo).

        - Calcular el costo de un servicio estándar en base a criterios distintos para cada tipo de vehículo.

   * Se espera crear al menos 3 vehículos diferentes, mostrarlos por consola e invocar todas las acciones para cada uno.
   */  
    
    
    public static void main(String[] args) {

        List<Vehiculos> parking = new ArrayList<>();
        
        
        Auto a = new Auto("Bugatti","Chiron");
        Moto m = new Moto("Dugatti", "PT");
        Camion c = new Camion("Mercedes","GT");
        
        parking.add(a);
        parking.add(m);
        parking.add(c);
        
        for(Vehiculos v : parking){
            
              System.out.println(v.marca + " " + v.modelo);
            
              v.arrancarMotor();
              v.revision();
              v.calcularCosto();
              
              System.out.println();
     
        }   
    } 
}
