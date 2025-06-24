
package ejercicio3;

/**
  * Ejercicio 3: Registro de usuario (UserRegistry)
  
  * Planteamiento:
  * 
  * Crea una clase singleton llamada UserRegistry que permita:

   Guardar el nombre del último usuario que inició sesión.

   Obtener el nombre del último usuario registrado.

   Asegurar que solo exista una única instancia de UserRegistry en todo el programa.

   Requisitos:
   
   Implementa la clase UserRegistry con patrón singleton.

   La clase debe tener métodos:

    setLastUser(String username)

    getLastUser()

   En el main, obtén la instancia de UserRegistry varias veces y verifica que la instancia es la misma (compara con ==).

   Cambia el usuario con un objeto y luego obtén el usuario con otro para demostrar que es la misma instancia.


 */


public class Main {


    public static void main(String[] args) {

        UserRegistry registro1 = UserRegistry.getInstance();
        
        registro1.setLastUser("Pepe");
        
        UserRegistry registro2 = UserRegistry.getInstance();
        
        System.out.println("Último usuario: " + registro2.getLastUser());
        
        
            if (registro1 == registro2) {
            System.out.println("registro1 y registro2 son la misma instancia.");
        } else {
            System.out.println("Son instancias diferentes.");
        }
            
        
        registro2.setLastUser("Bob");
        
        System.out.println("Último usuario actualizado: " + registro1.getLastUser());
            
    }
    
}
