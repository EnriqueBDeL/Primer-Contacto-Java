
package ejercicio2;


public class Cuidador {
    
    private String nombre;

    public Cuidador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuidador{" + "nombre=" + nombre + '}';
    }
    
}
