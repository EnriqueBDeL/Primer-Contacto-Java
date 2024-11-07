
package empleados;


public class Directivos extends Empleados {
    
    protected int telefono_asociado;

    public Directivos(int telefono_asociado, String nombre, String apellido) {
        super(nombre, apellido);
        this.telefono_asociado = telefono_asociado;
    }

    @Override
    public String toString() {
        return super.toString() +"Directivos{" + "telefono_asociado=" + telefono_asociado + '}';
    }

  
   
    
    
    
    
}
