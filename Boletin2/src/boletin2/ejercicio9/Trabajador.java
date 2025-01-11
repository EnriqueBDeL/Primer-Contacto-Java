
package boletin2.ejercicio9;


public class Trabajador extends Persona {
    
protected float salario;
protected int ccc;

    public Trabajador(float salario, int ccc, String nombre, String apellido, String direccion) {
        super(nombre, apellido, direccion);
        this.salario = salario;
        this.ccc = ccc;
    }
    
   


}
