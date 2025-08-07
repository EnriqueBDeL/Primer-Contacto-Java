
package ejercicio1;


public class MuestraOrina extends Muestra {
    
    private boolean infeccion;

    public MuestraOrina(boolean infeccion, Tipo tipo, double nivelRiesgo, boolean urgente) {
        super(tipo, nivelRiesgo, urgente);
        this.infeccion = infeccion;
    }

    public boolean isInfeccion() {
        return infeccion;
    }

    public void setInfeccion(boolean infeccion) {
        this.infeccion = infeccion;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando muestra de orina. Infección: " + (infeccion ? "Sí" : "No"));
    }
   
    
}
