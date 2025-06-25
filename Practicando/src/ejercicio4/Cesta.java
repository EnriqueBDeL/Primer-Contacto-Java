
package ejercicio4;

/**
 * Ejercicio A:
 *
    Cesta genérica de productos
    Cree una clase genérica llamada Cesta que permita guardar un único elemento de cualquier tipo.

    Métodos de la clase:

        meter(T elemento): almacena un elemento en la cesta.

        sacar(): devuelve y elimina el elemento de la cesta.

    Crea una clase Zapato con atributos básicos (talla, marca).

    Crea una clase PruebaCesta para guardar un Zapato en la Cesta, sacarlo e imprimir la información por consola.
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

}
