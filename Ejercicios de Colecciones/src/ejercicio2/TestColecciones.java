
package ejercicio2;

import java.util.LinkedList;
import java.util.Scanner;


public class TestColecciones {

    private LinkedList<Double> lista = new LinkedList();
    
    
    
    public void relleanrValores(){
        
        Scanner sc = new Scanner(System.in);
        
           for(int i = 0; i < 10 ; i++){

            System.out.print("\nIntroduce un numero en la posicion " + (i+1) + " del array:" );

            lista.add(sc.nextDouble());
     }
        
    }
    
    public void mostrar(){
        
        if(lista.isEmpty()){
        
            System.out.println("La lista esta vacia.");
            
        }else{
        
        System.out.println(lista.subList(0, 3));
        
        }
    }
    
    
    public static void main(String[] args) {

        TestColecciones tc = new TestColecciones();
        
        tc.relleanrValores();
        
        System.out.println();
        
        tc.mostrar();
        
        
      if (tc.lista.contains(4.0)) { // se puede poner con ".0" o con "d" pero no solo.
            System.out.println("El numero 4 si esta en la lista.");
        } else {
            System.out.println("El numero 4 no esta en la lista.");
        }

        
       if (tc.lista.contains(300d)) {
            System.out.println("El numero 300 si esta en la lista.");
        } else {
            System.out.println("El numero 300 no esta en la lista.");
        }
       
        
    }
    
}
