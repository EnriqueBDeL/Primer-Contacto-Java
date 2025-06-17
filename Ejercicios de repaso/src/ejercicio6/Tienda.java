
package ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Tienda<T> {
    
    private List<T> lista;
    
     public Tienda() {
        lista = new ArrayList<>();
    }
    
    public void abrirTienda(List<T> productos) {
        this.lista = productos;
    }
    
     public boolean isStock(T producto) {
        return lista.contains(producto);
    }
    
    public boolean venderProducto(T producto) {
        return lista.remove(producto);
    }
    
     public void mostrarProductos() {
        System.out.println("Productos en tienda: " + lista);
    }
    
}
