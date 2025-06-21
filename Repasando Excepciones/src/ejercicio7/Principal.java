
package ejercicio7;

/**
 * Ejercicio 7:
 * Crea una excepción llamada OperacionNoPermitidaException (extiende RuntimeException) que sea lanzada si:
 * Se realiza una operación no soportada por un método (puedes simularlo con un String, por ejemplo "dividir" no soportado).
 * Si la operación es correcta, imprime un mensaje en consola
 */

public class Principal {
    
    public void realizarOperacion(String operacion){
        
        if( operacion.equals("suma")){
                 
            System.out.println("Se ejecuta la operacion de sumar");

        } else if ("restar".equals(operacion)) {
       
              System.out.println("Se ejecuta la operacion de restar");
       
          } else {
              
            throw new OperacionNoPermitidaException("La operacion " + operacion + " no se puede realizar");
            
          }
        
    }
            
    
    public static void main(String[] args) {
         
        Principal p = new Principal();
        
        p.realizarOperacion("suma");
        
        System.out.println();
        
        p.realizarOperacion("logaritmo");
        
        
        
    }
}
