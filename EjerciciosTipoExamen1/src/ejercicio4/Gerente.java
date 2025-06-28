
package ejercicio4;


public class Gerente extends Empleado{
    
    private int departamentos;

    public Gerente(int departamentos, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.departamentos = departamentos;
    }

    public int getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(int departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está supervisando " + departamentos + " departamentos.");
    }

    @Override
    public String toString() {
        return "Gerente{" + "departamentos=" + departamentos + '}';
    }
   
    
}
