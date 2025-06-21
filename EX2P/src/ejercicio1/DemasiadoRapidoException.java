
package ejercicio1;

/**
 * c)Cree una excepción llamada DemasiadoRapidoException que se lance cuando un camión tiene remolque 
 * y además su velocidad de aceleración supere los 100 km/h.
 */

public class DemasiadoRapidoException extends Exception {

    public DemasiadoRapidoException(String message) {
        super(message);
    }
    
}
