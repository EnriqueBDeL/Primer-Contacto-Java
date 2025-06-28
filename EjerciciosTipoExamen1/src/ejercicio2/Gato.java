
package ejercicio2;


public class Gato extends Animal{
    
    private String pelaje;

    public Gato(String pelaje, String nombre) {
        super(nombre);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Maulla el gato.");
    }

    @Override
    public void emitirSonido(String estado) {
         System.out.println("Maulla el gato " + estado + ".");
    }
    
}
