
package ucam.poo.claseobject;


public class ClaseObject {

  
    
    public static void main(String[] args) throws CloneNotSupportedException {

        Object objeto;
    
        objeto = 7f;
        
        System.out.println("Valor del objeto: " + objeto);
        
        
        objeto = (float) objeto + 3.5f;
        
        
        System.out.println("Resultado de la suma: " + objeto);

        
        Coche coche1 = new Coche();
        
        coche1.setMarca("Bugatti");
        coche1.setMatricula("2355RGT");
        coche1.setModelo("Chiron");
        
        System.out.println(coche1);
        
        
        Coche coche2 = new Coche(coche1);
        
        
        System.out.println(coche2);

        
       
         Coche coche3 = (Coche) coche1.clone();
           
           
        System.out.println("Coche 3 (copia clonada): " + coche3);

        
         System.out.println("coche1 == coche? " +coche1.equals(coche2));
         System.out.println("coche2 == coche3?" +coche2.equals(coche3));

        System.out.println("coche3 pertenece a la clase: " + coche3.getClass().getSimpleName());
        
         
        System.out.println("hashCode coche1: " + coche1.hashCode());
        System.out.println("hashCode coche2: " + coche2.hashCode());
        System.out.println("hashCode coche3: " + coche3.hashCode());
        
    }
    
}
