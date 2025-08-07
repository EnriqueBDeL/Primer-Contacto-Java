
package ejercicio3;


public class AvionesComerciales extends Aeronave{
    
    private int numeroPasajeros;

    public AvionesComerciales(int numeroPasajeros, String marca, double velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + "AvionesComerciales{" + "numeroPasajeros=" + numeroPasajeros + '}';
    }
    
    
    
}
