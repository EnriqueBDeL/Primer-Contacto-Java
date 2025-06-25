
package ejercicio5;

import ejercicio4.*;

/**
 * Ejercicio C
    Almacenar frutas en una colección genérica
    Utilizando la clase Cesta (del ejercicio A) junto con ArrayList, implementa un programa que:

    Guarde en un ArrayList 5 instancias de Cesta<Fruta>.

    Cada Cesta contendrá una Fruta distinta (Fruta será una clase simple con atributos básicos como nombre y color).

    Recorra el ArrayList e imprima por consola el nombre y color de cada fruta contenida en cada Cesta.
 */

public class Cesta<T> {
   
    private T elemento;

 
    public void meter(T elemento) {
        this.elemento = elemento;
    }

       public T sacar() {  
           
        T temp = elemento;   
        
        elemento = null;
        
        return temp;
        
    }

    public T getElemento() {
        return elemento;
    }

       
       
}
