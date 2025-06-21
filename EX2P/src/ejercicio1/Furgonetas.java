
package ejercicio1;


public class Furgonetas extends Vehiculos {
    
    private int plazas;

    public Furgonetas(String matricula) {
        super(matricula);
    }

    public Furgonetas(String marca, String matricula, float velocidadMaxima) {
        super(marca, matricula, velocidadMaxima);
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
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
