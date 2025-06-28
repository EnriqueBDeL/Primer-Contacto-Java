
package ejercicio4;


public class EmpresaMain {


    public static void main(String[] args) {

        Gerente gerente1 = new Gerente(3,"Steve",30,1400);
        Programador programador1 = new Programador("java","Monica",45,1200);
        
        Oficina<Empleado> ofi = new Oficina<>();
        
        ofi.añadirEmpleado(gerente1);
         ofi.añadirEmpleado(programador1);
        
          for (Empleado e : ofi.getTodos()) {
            e.trabajar();
         
           }
   
    }
}
