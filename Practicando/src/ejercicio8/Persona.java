
package ejercicio8;

/**
 * Ejercicio 3: Empresa con empleados y clientes
* 
    Crea clases Persona (nombre, edad), Empleado (hereda de Persona, añade salario) y Cliente (hereda de Persona, añade puntos).

    Crea una clase Empresa que contenga listas de empleados y clientes.

    En Principal crea dos empleados y un cliente y muestra toda la información.
 */
public abstract class Persona {
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}


