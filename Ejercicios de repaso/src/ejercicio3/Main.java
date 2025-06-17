
package ejercicio3;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor de 'a': ");
        double a = sc.nextInt();
        
        System.out.print("\nIntroduce el valor de 'b': ");
        double b = sc.nextInt();
        
        System.out.print("\nIntroduce el valor de 'c': ");
        double c = sc.nextInt();
        
        double descriminante = Math.pow(b,2) - 4 * a * c;
        
        if (descriminante < 0){
            
                 System.out.print("\nERROR");
            
        }else{
            
            
            double x1 = (-b +  Math.sqrt(descriminante)) / 2 * a;
            
            double x2 = (-b -  Math.sqrt(descriminante)) / 2 * a;
            
            System.out.printf("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);


            
        }
        
        
    }
    
}
