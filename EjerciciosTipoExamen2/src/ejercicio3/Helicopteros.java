
package ejercicio3;

enum Tipo{
    privados,emergencia
}

public class Helicopteros extends Aeronave{
    
    private Tipo tipo;

    public Helicopteros(Tipo tipo, String marca, double velocidadMaxima) {
        super(marca, velocidadMaxima);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "Helicopteros{" + "tipo=" + tipo + '}';
    }
   
    
}
