
package Empresa;


public class Cliente extends Persona {
    
    private int puntos;

    public Cliente(int puntos, String nombre, int edad) {
        super(nombre, edad);
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + "puntos=" + puntos + '}';
    }

   
}
