
package ejercicio3;

import java.util.HashMap;
import java.util.Map;


public class Hangar {
    
    
    private Map<Integer,Aeronave> almacen;

    
    public Hangar() {
        
        almacen = new HashMap<>();
        
    }
    
    public void meterAeronave(Aeronave aeronave){
        
        almacen.put(aeronave.getNumeroRegistro(), aeronave);
        
    }
    
    public Aeronave buscarAeronave(int registro){
        
       return almacen.get(registro);
      
    }

    @Override
    public String toString() {
        return "Hangar{" + "almacen=" + almacen + '}';
    }
    
    public Iterable<Aeronave> getAeronaves() {
    return almacen.values();
}

    
    
}
