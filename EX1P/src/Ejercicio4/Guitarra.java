
package Ejercicio4;


public class Guitarra extends Instrumento {
    
    private int numeroCuerdas;

    public Guitarra(int numeroCuerdas, String nombre) {
        super(nombre);
        this.numeroCuerdas = numeroCuerdas;
    }

    
    @Override
    public void tocar() {
        System.out.println("Guitarra: " + getNombre());
    }

    @Override
    public void tocar(String partitura) {
        System.out.println("Guitarra: " + partitura);
    }

  
    
   
    
}
