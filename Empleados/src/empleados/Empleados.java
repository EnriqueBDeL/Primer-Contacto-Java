
package empleados;


public class Empleados {

    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected int telefono;
    protected String direccion;
    protected int ID;
    protected static int contadorID = 0;

    
    public Empleados(String nombre, String apellido) {
        this.ID = ++contadorID;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    
    
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", telefono=" + telefono + ", direccion=" + direccion + ", ID=" + ID + '}';
    }

  
    

  


  
    
}
