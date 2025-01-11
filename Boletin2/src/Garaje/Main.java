

package Garaje;


public class Main {

    
    public static void main(String[] args) {
    
        Garaje garaje = new Garaje(3);

        Coche coche = new Coche(12,5);
        Moto moto = new Moto(45);    

        garaje.guardarVehiculo(0, coche); 
        garaje.guardarVehiculo(1, moto); 

        garaje.leerCuota();
    
    }
    
    
}
