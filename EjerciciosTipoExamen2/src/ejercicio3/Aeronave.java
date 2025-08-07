
package ejercicio3;


public abstract class Aeronave implements Volador{
    
    private int numeroRegistro;
    private static int contador = 0;
    private String marca;
    private double velocidadMaxima;

    public Aeronave(String marca, double velocidadMaxima) {
        this.numeroRegistro = contador++;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
   
    @Override
    public void despegue(double velocidad) throws VelocidadExcesivaException{
        
        if( velocidad < 500){
            
            System.out.println("Despegando...");
            
        }else{
            
            throw new VelocidadExcesivaException("Vas demasiado rapido.");
            
        }
    }
  
    
    @Override
    public void aterrizar(double velocidad) throws VelocidadExcesivaException{
        
        if( velocidad < 500){
            
            System.out.println("Aterrizando...");
            
        }else{
            
            throw new VelocidadExcesivaException("Vas demasiado rapido.");
            
        }
    }

    @Override
    public String toString() {
        return "Aeronave{" + "numeroRegistro=" + numeroRegistro + ", marca=" + marca + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
  
    
}
