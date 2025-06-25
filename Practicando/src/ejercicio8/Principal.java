
package ejercicio8;

import java.util.ArrayList;
import java.util.List;


public class Principal {

   
    
    public static void main(String[] args) {

    
        Empleado e1 = new Empleado(1500, "Raul", 23);
        Empleado e2 = new Empleado(1000, "Laura", 35);

        Cliente c1 = new Cliente(345, "Jorge", 22);

        Empresa empresa = new Empresa();

        empresa.getListaE().add(e1);
        empresa.getListaE().add(e2);

        empresa.getListaC().add(c1);

        System.out.println("Empleados:");
        for (Empleado emp : empresa.getListaE()) {
            System.out.println(emp.getNombre() + ", Edad: " + emp.getEdad() + ", Salario: " + emp.getSalario());
        }

        System.out.println("\nClientes:");
        for (Cliente cli : empresa.getListaC()) {
            System.out.println(cli.getNombre() + ", Edad: " + cli.getEdad() + ", Puntos: " + cli.getNumeros());
        }
        
    }
    
}
