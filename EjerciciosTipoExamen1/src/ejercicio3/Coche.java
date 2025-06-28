
package ejercicio3;


public class Coche extends Vehiculos {
    
    private int numeroPuertas;

    public Coche(int numeroPuertas, String marca, String modelo, int ano, double velocidadMaxima) {
        super(marca, modelo, ano, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "numeroPuertas=" + numeroPuertas + '}';
    }

    @Override
    public void arrancar() {
        System.out.println("Coche arrancando...");
    }
    
    
    public void arrancar(int tiempo) {
        System.out.println("Coche arrancando... (Tiempo aproximado de " + tiempo + "s)");
    }
    
    
}
