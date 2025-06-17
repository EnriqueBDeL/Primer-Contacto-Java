
package ejercicio8;


public class Presenciales extends Alumnos{
    
    private double porcentajeAsistencia;

    public Presenciales(double porcentajeAsistencia, int NIA, String nombre, String apellido, String email) {
        super(NIA, nombre, apellido, email);
        this.porcentajeAsistencia = porcentajeAsistencia;
    }

    public double getPorcentajeAsistencia() {
        return porcentajeAsistencia;
    }

    public void setPorcentajeAsistencia(double porcentajeAsistencia) {
        this.porcentajeAsistencia = porcentajeAsistencia;
    }

    @Override
    public String toString() {
        return "Presenciales{" + super.toString() + ", porcentajeAsistencia=" + porcentajeAsistencia + "}";
    }
    
    
    
}
