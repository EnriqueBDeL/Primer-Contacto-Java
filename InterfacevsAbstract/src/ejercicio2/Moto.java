
package ejercicio2;


public class Moto extends Vehiculos{

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

  @Override
    public void arrancarMotor() {
        System.out.println("La moto " + marca + " " + modelo + " arranca: Ruuututu!");
    }

    @Override
    public void revision() {
        System.out.println("Revisando moto " + marca + " " + modelo + "… revisión completa.");
    }

    @Override
    public void calcularCosto() {
        double costo = 60.0;
        System.out.println("Costo del servicio estándar para la moto " + marca + " " + modelo + ": $" + costo);
    }
    
}
