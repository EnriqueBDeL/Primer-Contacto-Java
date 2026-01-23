package codigos;


import java.sql.Timestamp;



public class GestorTarifas {


	public static Timestamp getHoraActual() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static float calcularImporte(Timestamp entrada, Timestamp salida) {
       
    	long diferenciaMilis = salida.getTime() - entrada.getTime();
        long segundos = diferenciaMilis / 1000;
        
        return segundos * 0.05f; 
        
    }
    
    
    
    public static String getTexto(Timestamp fecha) {
        return fecha.toString();
    }
}