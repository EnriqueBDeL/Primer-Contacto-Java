
package ejercicio5;


public class FehcaConHora extends Fecha{
       
    
    private int hora;
    private int minutos;
    private int segundos;

    public FehcaConHora(int hora, int minutos, int segundos, int dia, int mes, int ano) {
        super(dia, mes, ano);
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
     @Override
    public String toString() {
        return hora + ":" + minutos + ":" + segundos;
    }
    
    
}
