
package ejercicio1;


public class Aguila extends Animales implements ComportaminetoVolar {
    
    public Aguila(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
