
package empleados;


public class Tecnicos extends Operarios{
    
    protected String especialidad;

    public Tecnicos(String especialidad, String hora_entrada, String hora_salida, String nombre, String apellido) {
        super(hora_entrada, hora_salida, nombre, apellido);
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "especialidad=" + especialidad + '}';
    }

    

}
