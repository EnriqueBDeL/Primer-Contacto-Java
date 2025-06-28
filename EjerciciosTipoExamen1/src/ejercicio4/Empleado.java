
package ejercicio4;

/**
 * Ejercicio 2. 
 *
    Se va a diseñar un sistema para gestionar empleados de una empresa. Hay dos tipos: Gerente y Programador. Todos los empleados tienen nombre, edad y salario. Los gerentes tienen un número de departamentos a su cargo y los programadores un lenguaje principal de programación. Todos pueden realizar una acción trabajar().

    Se pide:

    a) Implementar la jerarquía de clases en el paquete ucam.poo.empresa con los atributos correctamente encapsulados.
    b) Sobrecargar el método trabajar() en la clase Programador, una sin parámetros y otra que reciba el número de líneas de código a escribir.
    c) Definir los constructores necesarios.
    d) Crear una clase llamada Oficina genérica, que pueda guardar cualquier tipo de empleado.
    e) Crear una clase EmpresaMain que cree un gerente y un programador, los guarde en una oficina, y llame al método trabajar() de ambos.

 */


public abstract class Empleado {
    
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
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
    
    
    public abstract void trabajar();
    
    
    
}
