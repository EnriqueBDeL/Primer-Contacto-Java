
package ejercicio1;


public class Camion extends Vehiculo{
    
    private int cargaMax;

    public Camion(int cargaMax, String marca, String modelo) {
        super( marca, modelo);
        this.cargaMax = cargaMax;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
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
