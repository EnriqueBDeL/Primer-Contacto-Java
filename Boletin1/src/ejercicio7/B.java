/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author enriq
 */
public class B {
    
    int miAtributo;
    
static int atStatic = 3 ;
 
final int atFinal = 4 ;

static final int CONSTANTE = 5 ;



    void modifica(int value) {

    atStatic = 2; // no hay error
    miAtributo = 3; // no hay error

    }


    static void modifica2(int value) {

    atStatic = 2; // no da error
    miAtributo = 3; // Da error porque un metodo estatico no puede acceder a una variable no estatica.


    }

    
final int a = 1;
static int b = 2 ;
static final int c = b ; // no da error
static final int d = a ; // Da error, porque una varable estatica debe vale lo mismo que una variable estatica y en este caso a no lo es.
    
    
}
