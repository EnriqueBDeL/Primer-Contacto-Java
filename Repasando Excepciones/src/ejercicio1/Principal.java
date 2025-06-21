
package ejercicio1;

/**
 * Ejercicio 1:
 * Crea un método que divida dos números enteros y lance una excepción personalizada DivisionPorCeroException si el divisor es cero. 
 * Usa try-catch para manejarla e imprimir un mensaje.
 */


public class Principal {
    

  
  
    
    public int dividir(int i, int j)throws DivisionPorCeroException{

      int resultado;
        
      if (j == 0){
          throw new DivisionPorCeroException("No se puede dividir entre cero!!!");
      }
      
      
        resultado = i / j;
        
        
        return resultado;
    }
    
}
