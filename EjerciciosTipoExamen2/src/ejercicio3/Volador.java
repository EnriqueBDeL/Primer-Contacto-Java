
package ejercicio3;

public interface Volador {
    
    
    public void despegue(double velocidad)throws VelocidadExcesivaException;
    
    public void aterrizar(double velocidad)throws VelocidadExcesivaException;
    
}
