
package ejercicio7;


public class Oficiales extends Operarios{
    
    private int anosExperiencia;

    public Oficiales(int anosExperiencia, int horaEntrada, int horaSalida, String nombre, String apellido) {
        super(horaEntrada, horaSalida, nombre, apellido);
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Oficiales{"+ super.toString() + "anosExperiencia=" + anosExperiencia + '}';
    }
    
    
}
