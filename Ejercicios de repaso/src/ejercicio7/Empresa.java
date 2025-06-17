
package ejercicio7;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    
    private List<Empleados> listaPersonal = new ArrayList();
    
    public void insertar(Empleados empleado){
        
        listaPersonal.add(empleado);
        
    }
    
    
    public void listar(){
        
        for(Empleados empleado : listaPersonal){
            System.out.println(empleado);
        }
        
    }
    
    
}
