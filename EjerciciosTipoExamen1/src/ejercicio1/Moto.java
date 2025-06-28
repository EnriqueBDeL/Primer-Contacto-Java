
package ejercicio1;


public class Moto extends Vehiculo {
    
    private int cilindradas;

    public Moto(int cilindradas, String marca, String modelo) {
        super( marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
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
