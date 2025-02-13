
package ejercicio5;


public class Cronometro {
    
    private long inicio;
    private long fin;
    
    
    public void iniciar() {
        inicio = System.currentTimeMillis();
        System.out.println("Cronometro iniciado.");
    }
    
    public void finalizar() {
        fin = System.currentTimeMillis();
        System.out.println("Cronometro finalizado.");
    }
    
    public double tiempoTranscurrido(){
        
        return (fin - inicio)/1000.0;
        
    }
    
    
}
