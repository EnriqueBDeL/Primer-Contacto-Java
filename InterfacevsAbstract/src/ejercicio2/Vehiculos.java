
package ejercicio2;


public abstract class Vehiculos {
    
    public String marca;
    public String modelo;

    public Vehiculos(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    public abstract void arrancarMotor();
    public abstract void revision();
    public abstract void calcularCosto();
    
    
    
}
