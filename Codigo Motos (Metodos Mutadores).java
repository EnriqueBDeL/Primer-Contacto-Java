
//CONTENIDO: Métodos Mutadores en Java

package clase.java.pkg10;


public class ClaseJava10 {

      double velocidad_maxima;
      
      
      
    public ClaseJava10(double velocidad_maxima_inicial) {
           
        this.velocidad_maxima = velocidad_maxima_inicial;
        
    }
      
    public double aumentarVelocidad(double km) {
        this.velocidad_maxima += km; 
        return this.velocidad_maxima; 
    }
      
    
    public void mostrarVelocidad() {
        System.out.println("La velocidad maxima actual de la moto es: " + this.velocidad_maxima + " km/h");
    }
      
//----------------------------------------------------------------------------------------------------------------|
//|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//----------------------------------------------------------------------------------------------------------------| 

    public static void main(String[] args) {
        
        ClaseJava10 moto1 = new ClaseJava10(200.0);
        
        moto1.mostrarVelocidad();
        
        double edicionPro = moto1.aumentarVelocidad(50.0);
        
        System.out.println("La velocidad maxima de la moto edicion Pro es: " + edicionPro + " km/h");
        
    }
    
}
