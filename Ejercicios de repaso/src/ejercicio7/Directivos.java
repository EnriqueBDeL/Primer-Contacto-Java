
package ejercicio7;


public class Directivos extends Empleados{
    
    private int movilAsociado;

    public Directivos(int movilAsociado, String nombre, String apellido) {
        super(nombre, apellido);
        this.movilAsociado = movilAsociado;
    }

    @Override
    public String toString() {
        return "Directivos{" + super.toString()+ "movilAsociado=" + movilAsociado + '}';
    }
    
    
}


