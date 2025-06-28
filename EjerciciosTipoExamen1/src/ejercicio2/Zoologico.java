
package ejercicio2;


public class Zoologico {

    
    public static void main(String[] args) {

        Cuidador c1 = new Cuidador("Fer");
        Cuidador c2 = new Cuidador("Laura");
        Cuidador c3 = new Cuidador("Carlos");
        Cuidador c4 = new Cuidador("Ana");
        Cuidador c5 = new Cuidador("Luis");
        Cuidador c6 = new Cuidador("Nina");
       
        Perro p = new Perro("Pastor Aleman", "Loba");
        
        p.guardarCuidador(c1);
        p.guardarCuidador(c2);
        p.guardarCuidador(c3);
        p.guardarCuidador(c4);
        p.guardarCuidador(c5);
        p.guardarCuidador(c6); 
        
        
        p.emitirSonido();
        
        p.emitirSonido("feliz");
  
        System.out.println("\nCuidadores del perro:");
        for (Cuidador cuidador : p.getCuidadores()) {
            System.out.println("\n- " + cuidador);
        }
        
    }
    
}
