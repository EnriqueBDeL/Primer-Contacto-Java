
package ejercicio2;

import java.util.HashMap;
import java.util.Map;


public class Main {

  
    
    public static void main(String[] args) {

        /**
         * Invertir un HashMap
            Tienes un HashMap<String, Integer> con claves como nombres y valores como ID. 
            Invierte el mapa: crea uno nuevo que tenga los ID como clave y nombres como valor. ¿Qué problema podrías encontrar?
        */
        
        HashMap<String, Integer> personas = new HashMap<>();
        
        personas.put("Alfonso", 343);
                personas.put("Mike", 456);
                    personas.put("Agustin", 745);
         
                    
                    
           System.out.println(personas);
                  
           
           
             System.out.println();
             
           
         HashMap<Integer, String> empleados = new HashMap<>();
        
         
         
         for(Map.Entry<String, Integer> e : personas.entrySet()){
           
         empleados.put(e.getValue(), e.getKey());
         
         }
         
           System.out.println(empleados);
         
           
           
                System.out.println();
           
         /**
          * Detectar duplicados usando HashMap
            Dado un arreglo de números enteros, encuentra qué elementos aparecen más de una vez usando un HashMap.
          */     
                
                
                
         int[] numeros = {1,2,5,3,6,8,3,2,1};
         
         HashMap<Integer,Integer> detectorDuplicados = new HashMap<>();
         
         for(Integer n : numeros){
             
             if(detectorDuplicados.containsKey(n)){
             
             detectorDuplicados.put(n,detectorDuplicados.get(n)+ 1);
             
             }else{
                 
                 detectorDuplicados.put(n,1);
                         
             }
             
         }
            
         
         System.out.println(detectorDuplicados + "\n");
         
    for (Integer n : detectorDuplicados.keySet()) {
           if (n.intValue()> 1) {
               
           }
        System.out.println(n + " aparece " + detectorDuplicados.get(n) + " veces.");
    }
         
         
     System.out.println();
     
     
    
    
    
    } 
}
