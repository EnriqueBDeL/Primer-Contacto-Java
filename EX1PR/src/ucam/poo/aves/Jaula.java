
package ucam.poo.aves;

import java.util.ArrayList;
import java.util.List;

/**
 * d)Crear una clase genérica llamada Jaula que pueda almacenar aves de cualquier tipo. 
 * Implementar un método que almacene un ave y luego obtenerla.
 */

public class Jaula {
    
    
    private List<Aves> encerrada;

  
    
    public Jaula() {
        encerrada = new ArrayList<>();
    }

    public void encerrar(Aves ave) {
        encerrada.add(ave);
    }

    public void mostrarAves() {
        for (Aves ave : encerrada) {
            System.out.println("Ave: " + ave.getClass().getSimpleName() + " "+ ave.getEspecie());
           
        }
    }

    public List<Aves> getAves() {
        return encerrada;
    }
    
    
    public void liberar(String especie) {
    for (int i = 0; i < encerrada.size(); i++) {
        Aves ave = encerrada.get(i);
        if (ave.getEspecie().equalsIgnoreCase(especie)) {
            encerrada.remove(i);   
            ave.volar();           
            return;
        }
    }
    System.out.println("No se encontró un ave con la especie: " + especie);
}

    
}
