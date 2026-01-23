package preguntaDesarrollo; 

import java.sql.Timestamp;

public class GestionFechas {

    public static Timestamp getHoraActual() {
        return new Timestamp(System.currentTimeMillis());
    }

    public static float getHorasEntre(Timestamp fechaInicio, Timestamp fechaFin) {
        long diferenciaMilisegundos = fechaFin.getTime() - fechaInicio.getTime();
        return diferenciaMilisegundos / (1000f * 60 * 60);
    }

    public static String getTexto(Timestamp fecha) {
        return fecha.toString(); 
    }
}