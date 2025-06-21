
package ejercicio3;

import java.util.Scanner;

/**
 * Crea una excepción personalizada ValorNegativoException que extienda RuntimeException. 
 * Lanza esta excepción si un método recibe un número negativo.
 */

public class Principal {
    
    public static int metodo(int i) throws ValorNegativoException{
        
        if (i < 0){
            throw new ValorNegativoException("No se permiten numeros negativos.");
        }
        
        return i;
    }
    
        public static void main(String[] args) {
         
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Intorudce un numero: ");
            int n = sc.nextInt();
            
            metodo(n);
            
            System.out.println("\nEl numero introducido es correcto.");
            
            
        }
     
}
