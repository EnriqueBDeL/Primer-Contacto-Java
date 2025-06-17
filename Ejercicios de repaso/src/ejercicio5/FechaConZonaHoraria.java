
package ejercicio5;


public class FechaConZonaHoraria extends Fecha {
    
    private int diferenciaGMT;

    public FechaConZonaHoraria(int dia, int mes, int anio, int diferenciaGMT) {
        super(dia, mes, anio);
        this.diferenciaGMT = diferenciaGMT;
    }
    
    @Override
    public String toString() {
        String signo = diferenciaGMT >= 0 ? "+" : "";
        return super.toString() + " GMT" + signo + diferenciaGMT;
    }
    
}
