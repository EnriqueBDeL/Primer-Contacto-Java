
package ejercicio8;


public class Cliente extends Persona {
    
    private int puntos;

    public Cliente(int puntos, String nombre, int edad) {
        super(nombre, edad);
        this.puntos = puntos;
    }

    public int getNumeros() {
        return puntos;
    }

    public void setNumeros(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "puntos=" + puntos + '}';
    }
    
}
