
package ejercicio2.mundo;


public class Persona {
    
    private String NIF;
    private int anioNacimiento = 1994;
    private String nombre;
    private double altura = 1.70;

    
    
    public Persona(String NIF) {
        this.NIF = NIF;
    }

    
    
    public Persona(Persona copia) {
        this.NIF = copia.NIF;
        this.anioNacimiento = copia.anioNacimiento;
        this.nombre = copia.nombre;
        this.altura = copia.altura;
    }

    
    
    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
   
    
    public int calculaEdad(int anio){
        
        return anio - this.anioNacimiento;
        
    }

    public String getNIF() {
        return NIF;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }
    
    
    
    
}
