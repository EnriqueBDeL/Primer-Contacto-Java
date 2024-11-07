
package empleados;


public class Operarios extends Empleados {
    
    protected String hora_entrada;
    protected String hora_salida;
    protected static int salario = 1500;

    public Operarios(String hora_entrada, String hora_salida, String nombre, String apellido) {
        super(nombre, apellido);
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
    }

    @Override
    public String toString() {
         return super.toString() + "Operarios{" + "hora_entrada=" + hora_entrada + ", hora_salida=" + hora_salida + '}';
    }

    
    

  


    
    
}
