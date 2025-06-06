
package ejercicio3;


public class Producto {

    private String nombre;
    private float precio = 0;
     
    
    
    public Producto() {  
        System.out.println("Producto creado.");   
    }

    public Producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;  
    }
    
    public String getInformacion(){
        return "Nombre: " + nombre + ", Precio: " + precio;
    }
    

    public static void main(String[] args) {

        Producto producto = new Producto("Coca-cola",2.34f);

         System.out.println(producto.getInformacion());
        
    }
    
}
