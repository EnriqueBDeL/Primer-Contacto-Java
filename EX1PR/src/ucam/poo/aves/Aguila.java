
package ucam.poo.aves;




public class Aguila extends Aves {
    
    private int alturaMaxima;

    /**
     * c)En las clases Águila y Colibrí, define un constructor que reciba todos los atributos necesarios y
     * que use la palabra clave super para invocar el constructor de la clase padre.
     */
    
    public Aguila(int alturaMaxima, String especie, float peso, float longitud) {
        super(especie, peso, longitud);
        this.alturaMaxima = alturaMaxima;
    }
    
    
    /**
    * b)Definir en la clase Águila dos versiones sobrecargadas del método volar(). 
    * Una versión que no reciba parámetros e imprima “El águila está volando a gran altura”, 
    * y otra que reciba un parámetro int para indicar una altura máxima e imprima un mensaje que incluya esa altura.
    */
  
    
    @Override
    public void volar() {
        
        System.out.println("El águila está volando a gran altura.");
        
    }
      
    public void volar(int nuevaAltura){
        
        this.alturaMaxima = nuevaAltura;
        
        System.out.println("El águila ahora puede volar como maximo a: " + alturaMaxima + " metros de altura.");
        
    }
    
}
