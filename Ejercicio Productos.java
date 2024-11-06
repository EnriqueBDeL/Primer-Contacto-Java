
package ejercicio.productos;


public class EjercicioProductos {

    private String nombre = null; 
    private float precio = 0;
    
    public EjercicioProductos() {
        
        System.out.println("Producto creado.");
        
    }
    
    public EjercicioProductos(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

   public void getInformacion(){
       System.out.println("Nombre: " + nombre + " | Precio: " + precio);
   }
    
    
    
    public static void main(String[] args) {

        EjercicioProductos ep = new EjercicioProductos("Pizza",23f);
        
        ep.getInformacion();
    }
    
}
