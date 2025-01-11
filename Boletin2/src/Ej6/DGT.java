
package Ej6;

import java.util.Arrays;
import java.util.Comparator;


public class DGT {
    
    public static CarnetDeConducir obtenerCarnetConMenosPuntos(CarnetDeConducir[] carnets) {
      
        return Arrays.stream(carnets).min(Comparator.comparingInt(CarnetDeConducir::getPuntos)).orElse(null);
    }

    public static <T extends CarnetPorPuntos> void bonificarSiAplica(T[] carnets) {
        for (T carnet : carnets) {
            if (carnet.mesesSinInfracciones() > 24) {
                carnet.sumarPuntos(1);
            }
        }
    }
}
