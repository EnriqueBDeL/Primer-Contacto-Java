
package Garaje;


public class Coche extends Vehiculo{
    
        public int numPlazas;

    public Coche(int potencia,int numPlazas) {
        super(potencia);
        this.numPlazas = numPlazas;
    }
}
