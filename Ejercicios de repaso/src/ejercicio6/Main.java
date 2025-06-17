
package ejercicio6;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {

    List<String> productos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            productos.add(String.valueOf(i));
        }
        
          Tienda<String> tienda = new Tienda<>();
        
          tienda.abrirTienda(productos);
          
           tienda.mostrarProductos();

        
           System.out.println("Esta el producto '4' en stock? " + tienda.isStock("4"));
        
        boolean vendido = tienda.venderProducto("4");
        System.out.println("Se vendio el producto '4'? " + vendido);
        
      
        tienda.mostrarProductos();
        System.out.println("Esta el producto '4' en stock despues de la venta? " + tienda.isStock("4"));
           
        
        
    }
    
}
