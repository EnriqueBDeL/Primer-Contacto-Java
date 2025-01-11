
package Empresa;


public class Empleado extends Persona {
    
    private float sueldo;

    public Empleado(float sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", Edad: " + edad + ", Sueldo: " + sueldo + "$";
    }

    
    

   
    
    
    
}
