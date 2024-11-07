
package empleados;



public class Oficiales extends Operarios{
    
    protected int anos_experiencia;

    public Oficiales(int experiencia, String hora_entrada, String hora_salida, String nombre, String apellido) {
        super(hora_entrada, hora_salida, nombre, apellido);
        this.anos_experiencia = experiencia;
    }


    @Override
    public String toString() {
        return "Oficiales{" + "experiencia=" + anos_experiencia + '}';
    }
    
    
}
