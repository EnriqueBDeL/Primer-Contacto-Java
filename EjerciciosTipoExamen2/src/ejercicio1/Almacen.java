
package ejercicio1;

import java.util.HashMap;
import java.util.Map;


public class Almacen {
    
    private  Map<String,Muestra> almacenar;

    public Almacen() {
       
        almacenar = new HashMap<>();
        
    }
    
    
    public void almacenar(Muestra muestra){
        almacenar.put(muestra.getCodigoUnico(), muestra);
        
    }
    
    public Muestra recuperar(String codigo){
        return almacenar.get(codigo);
    }
    
}
