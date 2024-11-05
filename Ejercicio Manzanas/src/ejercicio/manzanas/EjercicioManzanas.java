
package ejercicio.manzanas;

import java.util.ArrayList;
import java.util.HashSet;
        
public class EjercicioManzanas {

  
    public static void main(String[] args) {
        
        Manzana m1 = new Manzana(Colores.ROJO, 23.34f);
        m1.mensaje();
        
        
        Manzana m2 = new Manzana(Colores.VERDE, 2.0f);
        m2.mensaje();
        
        
        
        
        System.out.println();
        
        
        
        
        Manzana m3 = new Manzana(m1);
        m3.mensaje();
        
        
        
        Manzana m4 = m1.duplicar();
        m4.mensaje();
        
        
         System.out.println();
        
         
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m2));
        
        
        
        System.out.println();
        
        
        
        
        ArrayList<Manzana> lm = new ArrayList<>();
        
        lm.add(m1);
        lm.add(m2);
        lm.add(m3);
        lm.add(m4);
        
        System.out.println("Lista:");
        for (Manzana manzana : lm) {
            manzana.mensaje();
        }
        
        
        
        System.out.println();

                
        HashSet<Manzana> setManzanas = new HashSet<>();
        
        setManzanas.add(m1);
        setManzanas.add(m2);
        setManzanas.add(m3);
        setManzanas.add(m4);
        
        
        System.out.println("Lista:");
        for (Manzana manzana : setManzanas) {
            manzana.mensaje();
        }
                
                
    }
    
}
