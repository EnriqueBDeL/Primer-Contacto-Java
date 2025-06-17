
package ejercicio8;


public class Online extends Alumnos{
    
    private String sede;

    public Online(String sede, int NIA, String nombre, String apellido, String email) {
        super(NIA, nombre, apellido, email);
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    @Override
    public String toString() {
        return "Online{" + super.toString() + "sede=" + sede + '}';
    }
    
    
    
}
