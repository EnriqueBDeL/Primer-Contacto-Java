
package ejercicio4;

import java.util.ArrayList;
import java.util.List;


public class Oficina<T> {
    
    private List<T> lista = new ArrayList<>();

 
    public void añadirEmpleado(T empleado) {
        lista.add(empleado);
    }

    public T obtenerEmpleado(int index) {
        return lista.get(index);
    }

    public List<T> getTodos() {
        return lista;
    }
    
    
}
