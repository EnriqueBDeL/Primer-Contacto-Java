
package ejercicio4;


public class Programador extends Empleado {
    
    private String lenguajePrincipal;

    public Programador(String lenguajePrincipal, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está programando en " + lenguajePrincipal + ".");
    }
   
    
    public void trabajar(int numeroLineas) {
        System.out.println(getNombre() + " ha programado " + numeroLineas + " líneas de código en " + lenguajePrincipal + ".");
    }

    @Override
    public String toString() {
        return "Programador{" + "lenguajePrincipal=" + lenguajePrincipal + '}';
    }
    
    
    
}
