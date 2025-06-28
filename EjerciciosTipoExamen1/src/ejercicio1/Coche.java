
package ejercicio1;


public class Coche extends Vehiculo {
    
    private int puertas;

    public Coche(int puertas, String marca, String modelo) {
        super(marca, modelo);
        this.puertas = puertas;
    }



    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }



    @Override
    public void usar() {
        System.out.println("\nSe está usando: " + getClass().getSimpleName());
    }

    @Override
    public void usar(String destino) {
        System.out.println("\nSe está usando: " + getClass().getSimpleName() + " | Para ir a: " + destino);
    }
 
}
