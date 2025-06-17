
package ejercicio7;


public class Tecnicos extends Operarios{
    
    private String especialidad;

    public Tecnicos(String especialidad, int horaEntrada, int horaSalida, String nombre, String apellido) {
        super(horaEntrada, horaSalida, nombre, apellido);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + super.toString()+ "especialidad=" + especialidad + '}';
    }
    
    
    
}
