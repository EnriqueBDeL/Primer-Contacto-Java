
package ejercicio5;

/**
 * Ejercicio 5:
 * Crea dos excepciones personalizadas: ExcepcionBase (extiende Exception) y ExcepcionDerivada (extiende ExcepcionBase). 
 * Crea métodos que lancen cada una y observa cómo puedes manejarlas en bloques catch separados o combinados.
 */


public class Principal {

    
    // Lanza ExcepcionBase
    public static void lanzarExcepcionBase() throws ExcepcionBase {
        throw new ExcepcionBase("Excepción BASE lanzada");
    }

    // Lanza ExcepcionDerivada
    public static void lanzarExcepcionDerivada() throws ExcepcionDerivada {
        throw new ExcepcionDerivada("Excepción DERIVADA lanzada");
    }

    public static void main(String[] args) {
        System.out.println("=== CASO 1: Captura por separado ===");
        try {
            lanzarExcepcionDerivada();
        } catch (ExcepcionDerivada e) {
            System.out.println("Se capturó ExcepcionDerivada: " + e.getMessage());
        } catch (ExcepcionBase e) {
            System.out.println("Se capturó ExcepcionBase: " + e.getMessage());
        }

        
        
        System.out.println("\n=== CASO 2: Captura en un solo bloque (usando ExcepcionBase) ===");
        try {
            lanzarExcepcionDerivada();
        } catch (ExcepcionBase e) {
            System.out.println("Se capturó en un solo bloque (ExcepcionBase): " + e.getMessage());
        }

        
        
        System.out.println("\n=== CASO 3: Ahora lanzamos ExcepcionBase para mostrar la diferencia ===");
        try {
            lanzarExcepcionBase();
        } catch (ExcepcionBase e) {
            System.out.println("Se capturó ExcepcionBase: " + e.getMessage());
        }
    }
}