
package ejercicio1;


public class Camiones extends Vehiculos {

    private Remolque remolque;

    public Camiones(Remolque remolque, String matricula) {
        super(matricula);
        this.remolque = remolque;
    }

    public Camiones(Remolque remolque, String marca, String matricula, float velocidadMaxima) {
        super(marca, matricula, velocidadMaxima);
        this.remolque = remolque;
    }

     public Camiones(String matricula) {
        super(matricula);
    }

    public Camiones(String marca, String matricula, float velocidadMaxima) {
        super(marca, matricula, velocidadMaxima);
    }

    public Remolque getRemolque() {
        return remolque;
    }

    public void setRemolque(Remolque remolque) {
        this.remolque = remolque;
    }


    @Override
    
    public void acelerar(float velocidadAceleracion) throws DemasiadoRapidoException {
        if (remolque != null && velocidadAceleracion > 100) {
            throw new DemasiadoRapidoException("DEMASIADO RAPIDO para un camion con remolque");
        }
    }

    @Override
    public void frenar(float velocidadDesaceleracion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


  

}




