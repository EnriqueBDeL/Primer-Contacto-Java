
package ejercicio7;


public class Main {

   
    
    
    public static void main(String[] args) {

        Oficiales oficial1 = new Oficiales(5,10,8,"Ramon","Martinez");
        
        Directivos directivo1 = new Directivos(2345345,"Antonio","Pelirrojo");
        
        Empresa ep = new Empresa();
        
        ep.insertar(oficial1);
        ep.insertar(directivo1);
        
        ep.listar();
        
    }
    
}
