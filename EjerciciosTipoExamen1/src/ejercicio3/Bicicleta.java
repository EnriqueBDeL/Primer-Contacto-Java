
package ejercicio3;


public class Bicicleta extends Vehiculos {
    
    private boolean electrica;

    public Bicicleta(boolean electrica, String marca, String modelo, int ano, double velocidadMaxima) {
        super(marca, modelo, ano, velocidadMaxima);
        this.electrica = electrica;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "electrica=" + electrica + '}';
    }

    @Override
    public void arrancar() {
        
        if (electrica) {
                 System.out.println("Bicicleta eléctrica encendida.");
             } else {
                 System.out.println("Bicicleta lista para pedalear.");
             }
    }
    
    
    
}
