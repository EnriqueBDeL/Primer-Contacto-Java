
package ejercicio4;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Intorduce un numero: ");
        int numero = sc.nextInt();
        
       String numeroS = String.valueOf(numero);
       
       StringBuilder sb = new StringBuilder(numeroS);
       
       String invertido = sb.reverse().toString();
       
        System.out.println("Numero al reves: " + invertido);

        
    }
    
}
