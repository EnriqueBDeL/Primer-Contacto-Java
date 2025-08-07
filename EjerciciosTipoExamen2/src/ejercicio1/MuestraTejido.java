
package ejercicio1;


public class MuestraTejido extends Muestra {
    
    private String zonaCuerpo;

    public MuestraTejido(String zonaCuerpo, Tipo tipo, double nivelRiesgo, boolean urgente) {
        super(tipo, nivelRiesgo, urgente);
        this.zonaCuerpo = zonaCuerpo;
    }

    public String getZonaCuerpo() {
        return zonaCuerpo;
    }

    public void setZonaCuerpo(String zonaCuerpo) {
        this.zonaCuerpo = zonaCuerpo;
    }

    @Override
    public void procesar() {
        System.out.println("Procesando muestra de tejido. Zona: " + zonaCuerpo);
    }
    
    
    
}
