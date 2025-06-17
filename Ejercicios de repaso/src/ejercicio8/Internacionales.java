
package ejercicio8;


public class Internacionales extends Alumnos{
    
       private String universidadOrigen;

    public Internacionales(String universidadOrigen, int NIA, String nombre, String apellido, String email) {
        super(NIA, nombre, apellido, email);
        this.universidadOrigen = universidadOrigen;
    }

    public String getUniversidadOrigen() {
        return universidadOrigen;
    }

    public void setUniversidadOrigen(String universidadOrigen) {
        this.universidadOrigen = universidadOrigen;
    }

    @Override
    public String toString() {
        return "Internacionales{" + super.toString() + "universidadOrigen=" + universidadOrigen + '}';
    }
    
       
       
}
