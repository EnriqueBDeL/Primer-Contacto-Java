
package ejercicio1;


public class Flota {

    
    public static void main(String[] args) {

      Conductor co =new Conductor("Javi");
        
        
      Coche c1 = new Coche(4,"Mercedes","SLS");
        
      
        c1.agregarConductor(new Conductor("Javi"));
        c1.agregarConductor(new Conductor("María"));
        c1.agregarConductor(new Conductor("Luis"));
        c1.agregarConductor(new Conductor("Sofía"));
        c1.agregarConductor(new Conductor("Pepe"));
        
      
       c1.usar();
       
       c1.usar("Cartagena");
        
        System.out.println("\nÚltimos conductores:");
        for (Conductor c : c1.getConductores()) {
            System.out.println("- " + c);
        }
       
    }
    
}
