
package Ejercicio4;


public class Piano extends Instrumento{
    
    private boolean cola; // True = Si es cola. | False = No es cola.

    public Piano(boolean cola, String nombre) {
        super(nombre);
        this.cola = cola;
    }

    @Override
    public void tocar() {
        System.out.println("Piano: " + getNombre());
    }

    @Override
    public void tocar(String partitura) {
        System.out.println("Piano: " + partitura);
    }
    
}
