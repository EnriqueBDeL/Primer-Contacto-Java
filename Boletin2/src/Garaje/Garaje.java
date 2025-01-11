
package Garaje;


public class Garaje {

    private int numeroPlazas; 
    private Vehiculo[] plazas;

    
    
    public Garaje(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
        this.plazas = new Vehiculo[numeroPlazas];
    }

        
  
    
    
 public double cuotaMensual(int indicePlaza) {
    if (indicePlaza < 0 || indicePlaza >= plazas.length) {
        return 0;
    }

    Vehiculo vehiculo = plazas[indicePlaza];

    if (vehiculo == null) {
        return 0;
    }

    if (vehiculo instanceof Coche) {
        return vehiculo.getPotencia() * numeroPlazas;
    } else if (vehiculo instanceof Moto) {
        return vehiculo.getPotencia() * 2;
    }

    return 0;
}

    
    
    
    public boolean guardarVehiculo(int indicePlaza, Vehiculo vehiculo) {

        if (indicePlaza < 0 || indicePlaza >= numeroPlazas) {
            return false; 
        }

        if (plazas[indicePlaza] == null) {
            plazas[indicePlaza] = vehiculo;
            return true; 
        }

        return false;
    }
    
    
    
    
    public void leerCuota() {
        for (int i = 0; i < numeroPlazas; i++) {
            double cuota = cuotaMensual(i);
            System.out.println("Plaza " + i + ": Cuota mensual = " + cuota);
        } 
    }
} 

