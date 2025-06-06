
package ejercicio5;


public class PruebaConometro {

    
    public static void main(String[] args) throws InterruptedException {

        Cronometro c1 = new Cronometro();
        
        c1.iniciar();
        
        
        Thread.sleep(3000); //hace un paron de 3 segundos
        
        
        c1.finalizar();
        
        System.out.println("Tiempo transcurrido: " + c1.tiempoTranscurrido() + " segundos");
        
    }
    
}
