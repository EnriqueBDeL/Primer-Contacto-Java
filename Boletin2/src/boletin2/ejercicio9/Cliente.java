
package boletin2.ejercicio9;

public class Cliente extends Persona{
 
protected int cif;

    public Cliente(int cif, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.cif = cif;
    }
 


}
