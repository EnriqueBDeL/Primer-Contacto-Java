
package ejercicio7;


public class Operarios extends Empleados{
    
        private int horaEntrada;
        private int horaSalida;
        private final static double salarioMensual = 1500;

    public Operarios(int horaEntrada, int horaSalida, String nombre, String apellido) {
        super(nombre, apellido);
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
        
        
    public int horasTrabajadas(int numeroSemanas){
        
        int total = (this.horaSalida - this.horaEntrada) * numeroSemanas;
        
        return total;
        
    }

    @Override
    public String toString() {
        return "Operarios{" + super.toString()+ "horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
        
    
    
}
