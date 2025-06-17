
package ejercicio1;

import java.util.Scanner;


public class Main {

    private static final float IVA = 0.21f; 
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el precio de un producto: ");
        float precio = sc.nextFloat();
        
        
        float precioFinal = precio + (precio * IVA);

        System.out.println("El precio final con IVA es: " + precioFinal);
        
    }
    
}
