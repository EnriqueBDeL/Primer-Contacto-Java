
package ucam.poo.aves;

/** 
 * e)Crear una nueva clase que contenga un método main. En el método main, crear un objeto de tipo Jaula, 
 * insertar un ave del tipo águila en la jaula, y luego liberar el águila y llamar al método volar() usando el ave liberada.
 */

public class Main {

 
    
    public static void main(String[] args) {

        Aguila aguila1 = new Aguila(100,"Blanca",23.3f,45.3f);
        
        Jaula jaula = new Jaula();
        
        
        jaula.encerrar(aguila1);
        
        jaula.mostrarAves();
        
        jaula.liberar("Blanca");
        
        jaula.mostrarAves();
        
        
        

    }
    
}
