
package ejercicio2.mundo;

/**
 * Ejercicio 2:
    
    Crea el paquete ejercicio2.mundo y añade una clase llamada Empleado con:

    Atributos:

        nombre de tipo String.

        edad de tipo int.

        salario de tipo double.

    Constructor estándar que reciba los 3 atributos para inicializarlos.

    Constructor de copia.

    Métodos:

        getNombre() para obtener el nombre.

        getEdad() para obtener la edad.

        getSalario() para obtener el salario.

    aumentarSalario(double porcentaje) para aumentar el salario en un porcentaje dado.

    Clase Principal con main para crear un Empleado, aumentar su salario e imprimir la información actualizada.
 */


public class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }


    public Empleado(Empleado empleado) {
        this.nombre = empleado.nombre;
        this.edad = empleado.edad;
        this.salario = empleado.salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public double aumentarSalario(double  porcentaje){
        
        double salarioActualizado = this.salario + (this.salario * porcentaje);
        this.salario = salarioActualizado;
        return salarioActualizado;
    }
    
    
}
