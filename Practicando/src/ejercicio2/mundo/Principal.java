
package ejercicio2.mundo;


public class Principal {

  
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Antonio",46,1500);
        
        e1.aumentarSalario(0.10);
        
        System.out.println(e1.getNombre() + " " + e1.getEdad() + " " + e1.getSalario());
        
    }
    
}
