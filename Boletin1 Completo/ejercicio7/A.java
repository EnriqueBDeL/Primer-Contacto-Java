/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author enriq
 */
public class A {
    
    final int atFinal = 4 ;

    
    
    public A() {
        
    atFinal = 2 ; // Da error, porque las variables declaradas con final, no pueden ser modificadas.
    
    }
    
   static final int numero = valor(); // Da error porque una variable estatica, no puede valer un que valor no es estatico.

   
    int valor() {

       if (true) return 1 ;

       return 2 ;
    }
    

}
