
package Ejercicio4;


enum Tipo{
ALTO,BAJO,TENOR
}

public class Saxofon extends Instrumento {
    
    private Tipo t;

    public Saxofon(Tipo t, String nombre) {
        super(nombre);
        this.t = t;
    }

    @Override
    public void tocar() {
        System.out.println("Saxofón " + t + ": " + getNombre());
    }

    @Override
    public void tocar(String partitura) {
        System.out.println("Saxofón " + t + ": " + partitura);
    }
    
    
    
}
