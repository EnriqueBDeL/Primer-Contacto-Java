
package ejercicio2;


public class Camion extends Vehiculos{

    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void arrancarMotor() {
        System.out.println("El camión " + marca + " " + modelo + " arranca: Bumm Bumm");
    }

    @Override
    public void revision() {
        System.out.println("Revisando camión " + marca + " " + modelo + "… revisión completa.");
    }

    @Override
    public void calcularCosto() {
        double costo = 150.0;
        System.out.println("Costo del servicio estándar para el camión " + marca + " " + modelo + ": $" + costo);
    }
    
}
