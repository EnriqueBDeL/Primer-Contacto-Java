
package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Principal {
    
/**
 * Ejercicio 6:
 * Crea una excepción personalizada llamada EdadNoValidaException (extiende Exception) que sea lanzada si un método recibe una edad menor a 0 o mayor a 120.
 * Usa try-catch para mostrar un mensaje de error en main.
 */     

public void comprobarEdad(int edad) throws EdadNoValidaException {
   
         
             if(edad < 0 || edad > 120){
             
          
                 throw new EdadNoValidaException("Edad incorrecta.");
                      
             }
                          System.out.println("Edad correcta.");

         
         }
          
  
     
    
    
    
    public static void main(String[] args) {
     
        
        
         Principal p = new Principal();

        System.out.println("Caso 1:");
        try {
            p.comprobarEdad(20);
        } catch (EdadNoValidaException ex) {
            Logger.getLogger(Principal.class.getName())
                  .log(Level.SEVERE, null, ex);
        }

        System.out.println("\nCaso 2:");
        try {
            p.comprobarEdad(444);
        } catch (EdadNoValidaException ex) {
            Logger.getLogger(Principal.class.getName())
                  .log(Level.SEVERE, null, ex);
        }
        
 
        
    }
}
