
package ejercicio3;


public class Drones extends Aeronave{
    
    private boolean camara;
    private int autonomia;

    public Drones(boolean camara, int autonomia, String marca, double velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.camara = camara;
        this.autonomia = autonomia;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return super.toString() + "Drones{" + "camara=" + camara + ", autonomia=" + autonomia + '}';
    }
    
    
    
}
