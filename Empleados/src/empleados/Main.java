
package empleados;


public class Main {
        
    
    public static void main(String[] args) {

        Empleados[] lista = new Empleados[100];
        
        
        Operarios e1 = new Operarios("9:00", "14:30", "Ana", "Torres");
        e1.setDNI("3452345R");
        e1.setTelefono(45634563);
        e1.setDireccion("Espana");
        lista[0] = e1;

        Directivos e2 = new Directivos(5435234, "Luis", "Martinez");
        e2.setDNI("45656345H");
        e2.setTelefono(563456);
        e2.setDireccion("Italia");
        lista[1] = e2;
          
     
          for (Empleados empleado : lista) {
            if (empleado != null) {
                System.out.println(empleado);
            }
          
        }
    }
        
    
 }
        
       

