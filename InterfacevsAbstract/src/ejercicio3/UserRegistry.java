
package ejercicio3;


public class UserRegistry {
    
    private static UserRegistry instancia;
    private String ultimoUsuario;

    public UserRegistry() {
    }
    
        public static UserRegistry getInstance() {
        
            if (instancia == null) {
            instancia = new UserRegistry();
        }
            
        return instancia;
        
    }
    
    public void setLastUser(String nombre){
         this.ultimoUsuario = nombre;
    }
    
    public String getLastUser(){    
          return this.ultimoUsuario;     
    }
    
    
    
}
