
package ejercicio4;

/**
 * Ejercicio 4:
 * 
 *Crea una interface llamada Figura que declare los métodos:

        - double calcularArea()

        - double calcularPerimetro()

    Crea las clases Circulo y Rectangulo que implementen esta interface.
    * 
 */
public class Main {

 
    public static void main(String[] args) {

        Circulo c = new Circulo(5.3);
        Rectangulo r = new Rectangulo(45.4, 23.3);

        System.out.println("Area ciculo: " + c.calcularArea());
                System.out.println("Area Perimetro: " + c.calcularPerimetro());
                
        System.out.println("Area rectangulo: " + r.calcularArea());
                System.out.println("Area rectangulo: " + r.calcularPerimetro());

        
    }
    
}
