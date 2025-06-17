
package ejercicio2;

import java.util.Scanner;



public class Main {

    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el radio del circulo: ");
        double radio = sc.nextDouble();
        
         double area = Math.PI * Math.pow(radio, 2);
         
        System.out.println("El area del circulo es: " + area);
        
        
    }
    
}
