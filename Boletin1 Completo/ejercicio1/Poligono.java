
package ejercicio1;

/**
 * Clase que representa al poligono.
 */
public class Poligono {
/**
 * Numero de lados del poligono por defecto.
 */
    private int lados = 0;

    
    /**
     * Constructor por defecto que muestra un mensaje al crear un poligono.
     */  
    public Poligono() {
        System.out.println("Poligono creado.");
    }
    
    
    
    /**
     * Constructor que recibe como parámetro un entero denominado lados inicializando el atributo con el valor del parámetro.
     * @param lados Numero de lados del poligono.
     */  
    public Poligono(int lados) {
         
        this.lados = lados;

    }

    /**
     * Método para obtener el número de lados del polígono.
     * @return Numero de lados del poligono.
     */
    public int getLados() {
        return lados;
    }
    
    
    
     /**
     * Método principal para ejecutar el programa.
     * 
     */
    public static void main(String[] args) {

        Poligono poligono1 = new Poligono(4);

        System.out.println("El poligono contiene: " + poligono1.getLados() + " lados");
        
    }
    
}
