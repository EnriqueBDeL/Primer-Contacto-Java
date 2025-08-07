
package ejercicio1;

enum GrupoSanguineo{
    A,B,AB,O;
}

public class MuestraSangre extends Muestra {
    
    private GrupoSanguineo gs;

    public MuestraSangre(GrupoSanguineo gs, Tipo tipo, double nivelRiesgo, boolean urgente) {
        super(tipo, nivelRiesgo, urgente);
        this.gs = gs;
    }

    public GrupoSanguineo getGs() {
        return gs;
    }

    public void setGs(GrupoSanguineo gs) {
        this.gs = gs;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando muestra de sangre. Grupo: " + gs);
    }
    
    
}
