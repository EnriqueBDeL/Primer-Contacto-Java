
package ejercicio1;

import java.lang.reflect.Array;
import java.util.Arrays;

import java.util.Scanner;


public class TestColecciones {

   
    
    double[] array = new double[10];
    
    
    
    void rellenarValores(){
        
      Scanner sc = new Scanner(System.in);
     
        for(int i = 0; i < 10 ; i++){

            System.out.print("\nIntroduce un numero en la posicion " + (i+1) + " del array:" );

            array[i] = sc.nextDouble(); 
     }
    }
    
    
    
      void mostrarValores() {
       
          for (int i = 0; i < 10; i++) {
           
              System.out.println("Indice " + i + ": " + array[i]);
              
        }
          
    }
    
    
    
    
    public static void main(String[] args) {

        TestColecciones t = new TestColecciones();
    
        
     t.rellenarValores();
     
    
            System.out.println();
            
            
      System.out.println("\nValores introducidos:");
        t.mostrarValores();
        
        System.out.println();

        Arrays.sort(t.array);

        System.out.println("\nValores ordenados:");
        t.mostrarValores();
    
        
  
     
     

    }
    
}
