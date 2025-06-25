
package ejercicio8;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
    
    private List<Empleado> listaE;
    private List<Cliente> listaC;

    public Empresa() {
        listaE = new ArrayList<>();
        listaC = new ArrayList<>();
    }

    
    
    public List<Empleado> getListaE() {
        return listaE;
    }

    public void setListaE(List<Empleado> listaE) {
        this.listaE = listaE;
    }

    public List<Cliente> getListaC() {
        return listaC;
    }

    public void setListaC(List<Cliente> listaC) {
        this.listaC = listaC;
    }
    
    
    
}
