
package ejercicio3;

import java.util.ArrayList;
import java.util.List;


public class Garaje<T> {
   
    private List<T> almacen = new ArrayList<>();

    
    public void añadirVehiculo(T vehiculo) {
        almacen.add(vehiculo);
    }

    public T obtenerVehiculo(int indice) {
        return almacen.get(indice);
    }

   

    
    
    @Override
    public String toString() {
        return "Garaje{" + "almacen=" + almacen + '}';
    }
 
   
    
}
