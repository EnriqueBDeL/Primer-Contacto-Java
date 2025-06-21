
package ejercicio1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {

 
    public static void main(String[] args) {

       
            Scanner sc = new Scanner(System.in);
            
            
            System.out.print("Introduce el dividendo: ");
            int divD = sc.nextInt();
            
            System.out.print("\nIntroduce el divisor: ");
            int divS = sc.nextInt();
            
            
            Principal p = new Principal();
            
            int resul = 0;
        
            
        try {
            resul = p.dividir(divD, divS);
        } catch (DivisionPorCeroException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          System.out.print("\nResultado: " + resul);
        
    }
    
}
