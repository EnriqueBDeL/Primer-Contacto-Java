
package ejercicio2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Ejercicio 2:
 * Crea un método leerArchivo(String nombreArchivo) que lance IOException. 
 * Luego crea otro método que llame a leerArchivo y propaga la excepción con throws. Finalmente, en main maneja la excepción con try-catch.
 */

public class Principal {
   
    
    public static void leerArchivo(String nombreArchivo) throws IOException{
       
        
        if (nombreArchivo.equals("noexiste.txt")) {
        throw new IOException("Error: El archivo no existe.");
    }
    System.out.println("Leí correctamente el archivo: " + nombreArchivo);
        
    }
    public static void procesarArchivo (String nombreArchivo) throws IOException{
        
        leerArchivo(nombreArchivo);
        
    }
       
    
    public static void main(String[] args) {

        
        
        try {
            procesarArchivo("noexiste.txt");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
}
