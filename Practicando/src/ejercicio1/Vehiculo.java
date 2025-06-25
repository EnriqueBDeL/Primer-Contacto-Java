
package ejercicio1;

/**
 * Ejercicio 1:
 * 
 * Crea el paquete ejercicio1.

    Crea una clase llamada Vehiculo cuyo constructor muestre el texto: Vehiculo creado
   
    Añádele un atributo privado matricula de tipo String con valor por defecto null.

    Crea un segundo constructor que reciba una matrícula e inicialice el atributo correspondiente.

    Añade un método público getMatricula() que devuelva la matrícula.

    En el método main, crea un vehículo con una matrícula de ejemplo e imprime en consola la matrícula
    
 */


public class Vehiculo {

    private String matricula = null;
    
    public Vehiculo() {
        
        System.out.println("Vehiculo creado.");
        
    }
    
    
    public Vehiculo(String matricula) {
        System.out.println("Vehiculo creado.");
        this.matricula = matricula;
        
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("3456RTF");
        
        System.out.println("El vehiculo1 tiene la matricula: " + v1.getMatricula());
        
    }
    
    
}
