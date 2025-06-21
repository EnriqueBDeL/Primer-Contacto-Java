
package ejercicio4;

/**
 * Ejercicio 4:
 * Escribe un método que abra un recurso (simula con un mensaje), lance una excepción, y usa finally para cerrar el recurso (otro mensaje). 
 * Observa el orden de ejecución.
 */

public class Principal {
    
    
    public void abrirRecurso() throws Exception{
        
        try{
            System.out.println("Recurso abierto");
            
            throw new Exception("ERROR: No se ha podido leer.");
            
        }finally{
        
            System.out.println("Recurso cerrado");
        }
        
    }
    
    
    public static void main(String[] args) throws Exception {
         
        Principal p = new Principal();
        
        p.abrirRecurso();
            
            
    }
}
