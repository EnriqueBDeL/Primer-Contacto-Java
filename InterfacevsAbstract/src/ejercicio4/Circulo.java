
package ejercicio4;


public class Circulo implements Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() {
        
        return Math.PI * radio * radio; // A = π * r^2

    }

    @Override
    public double calcularPerimetro() {

         return 2 * Math.PI * radio; // P = 2 * π * r
        
    }
    
    
    
}
