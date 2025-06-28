
package ejercicio5;


public class Visitante {
    
    private String nombre;

    public Visitante(String nombre) {
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
        return "Visitante{" + "nombre=" + nombre + '}';
    }
    
    
    
}
