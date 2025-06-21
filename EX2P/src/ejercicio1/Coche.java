
package ejercicio1;


public class Coche extends Vehiculos{
    
    private int numeroPuertas;
    private boolean electrico;  // true --> es electrico | false --> no es electrico

    public Coche(int numeroPuertas, boolean electrico, String matricula) {
        super(matricula);
        this.numeroPuertas = numeroPuertas;
        this.electrico = electrico;
    }

    public Coche(int numeroPuertas, boolean electrico, String marca, String matricula, float velocidadMaxima) {
        super(marca, matricula, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
        this.electrico = electrico;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    
    
    
    
    
    @Override
    public void acelerar(float velocidadAceleracion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void frenar(float velocidadDesaceleracion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
