
package ejercicio8;

enum TipoContrato{
    Asociado,Exclusiva
}
public class Profesores extends PersonalDocente{
    
    private int creditos;
    private TipoContrato tipo;

    public Profesores(int creditos, TipoContrato tipo, String nombre, String apellido, String email) {
        super(nombre, apellido, email);
        this.creditos = creditos;
        this.tipo = tipo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public TipoContrato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContrato tipo) {
        this.tipo = tipo;
    }

      @Override
    public String toString() {
        return "Profesores{" + super.toString() + ", creditos=" + creditos + ", tipo=" + tipo + "}";
    }

  
    
    
    
}
