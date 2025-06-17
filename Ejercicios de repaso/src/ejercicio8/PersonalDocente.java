
package ejercicio8;


abstract class PersonalDocente {
    
    private String nombre;
    private String apellido;
    private int IDUCAM;
    private String email;
    private static int contador = 0;

    public PersonalDocente(String nombre, String apellido,  String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.IDUCAM = ++contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIDUCAM() {
        return IDUCAM;
    }

    public void setIDUCAM(int IDUCAM) {
        this.IDUCAM = IDUCAM;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        PersonalDocente.contador = contador;
    }

    @Override
    public String toString() {
        return "PersonalDocente{" + "nombre=" + nombre + ", apellido=" + apellido + ", IDUCAM=" + IDUCAM + ", email=" + email + '}';
    }
    
    
    
    
    
    
}
