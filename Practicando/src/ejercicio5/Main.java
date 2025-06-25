
package ejercicio5;

import java.util.ArrayList;
import java.util.List;



public class Main {

   
    
    public static void main(String[] args) {

        
        Fruta manzana = new Fruta("Manzana", Color.ROJO);
        Fruta pera = new Fruta("Pera", Color.VERDE);
        Fruta uva = new Fruta("Uva", Color.AZUL);
        Fruta cereza = new Fruta("Cereza", Color.ROJO);
        Fruta kiwi = new Fruta("Kiwi", Color.VERDE);

        Cesta<Fruta> c1 = new Cesta<>();
        Cesta<Fruta> c2 = new Cesta<>();
        Cesta<Fruta> c3 = new Cesta<>();
        Cesta<Fruta> c4 = new Cesta<>();
        Cesta<Fruta> c5 = new Cesta<>();
        
        c1.meter(manzana);
        c2.meter(pera);
        c3.meter(uva);
        c4.meter(cereza);
        c5.meter(kiwi);
        
        List<Cesta<Fruta>> paquete = new ArrayList<>();
        
        paquete.add(c1);
        paquete.add(c2);
        paquete.add(c3);
        paquete.add(c4);
        paquete.add(c5);
        
        for(Cesta<Fruta> c : paquete){
            
           System.out.println(c.getElemento());
            
        }
        
        
        
    }
    
}
