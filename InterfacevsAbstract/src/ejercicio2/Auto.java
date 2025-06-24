
package ejercicio2;


public class Auto extends Vehiculos{

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

 
    @Override
    public void arrancarMotor() {
        System.out.println("El auto " + marca + " " + modelo + " arranca: Brum Brum");
    }

    @Override
    public void revision() {
        System.out.println("Revisando auto " + marca + " " + modelo + "… revisión completa.");
    }

    @Override
    public void calcularCosto() {
        double costo = 100.0;
        System.out.println("Costo del servicio estándar para el auto " + marca + " " + modelo + ": $" + costo);
    }
    
}
