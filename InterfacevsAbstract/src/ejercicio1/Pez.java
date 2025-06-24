
package ejercicio1;


public class Pez extends Animales implements ComportaminetoNadar {
    
    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void nadar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
