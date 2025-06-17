
package ejercicio7;


abstract class Empleados {
    
    private String nombre;
    private String apellido;
    private String DNI;
    private int telefono;
    private String direccion;
    private int id;
    private static int contador = 0;

    public Empleados(String nombre, String apellido) {
        
        if(nombre == null || nombre.isEmpty() || apellido == null || apellido.isEmpty()){
            throw new IllegalArgumentException("Nombre y apellido son obligatorios");
        }else{
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++contador;
        }
        
        
        
    }

    public Empleados(String nombre, String apellido, String DNI, int telefono, String direccion, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = ++contador;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", telefono=" + telefono + ", direccion=" + direccion + ", id=" + id + '}';
    }
    
    
    
    
}
