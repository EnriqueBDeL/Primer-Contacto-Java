
package ejercicio2;


public class Perro extends Animal{
    
    private String raza;

    public Perro(String raza, String nombre) {
        super(nombre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("Perro ladra.");
    }

    @Override
    public void emitirSonido(String estado) {
        System.out.println("Perro ladra " + estado + ".");
    }
    
    
    
}
