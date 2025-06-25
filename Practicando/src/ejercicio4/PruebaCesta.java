
package ejercicio4;


public class PruebaCesta {

 
    public static void main(String[] args) {

        Zapato z = new Zapato("Adidas",44);
        
        Cesta<Zapato> c = new Cesta<>();
        
        c.meter(z);
        
        System.out.println(c.sacar());
        
    }
    
}
