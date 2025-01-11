
package Empresa;


public class Principal {

  
    
    public static void main(String[] args) {
       
        Empleado empleado1 = new Empleado( 2500.50f,"Juan Perez", 30);
        Empleado empleado2 = new Empleado(3000.75f,"Maria Gomez", 28);
        
        Cliente cliente1 = new Cliente(150,"Carlos Lopez", 35);

        System.out.println("Empleados:");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println("\nCliente:");
        System.out.println(cliente1.toString());
    }
}
