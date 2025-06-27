
package ejercicio1;

import java.util.HashMap;
import java.util.Scanner;


public class Main {


    
    public static void main(String[] args) {
  
      /**
       * Contar frecuencias de palabras
            Dado un arreglo de palabras, usa un HashMap para contar cuántas veces aparece cada palabra.
            Ejemplo de entrada:
            ["manzana", "pera", "manzana", "naranja", "pera", "manzana"]
            Salida esperada:
            {manzana=3, pera=2, naranja=1}
       */ 
        
        
        
        String[] palabras = {"manzana", "pera", "manzana", "naranja", "pera", "manzana"};

        HashMap<String, Integer> contador = new HashMap<>();
        
          
        for (String palabra : palabras) {
            
            if (contador.containsKey(palabra)) {
                
                contador.put(palabra, contador.get(palabra) + 1);
                
            } else {
                
                contador.put(palabra, 1);
            }
        }

      
        System.out.println(contador);
        
        
        System.out.println();
        
        /**
         * Buscar valor por clave
           Crea un HashMap con nombres de personas como clave y su edad como valor. 
           Luego pide al usuario un nombre y muestra la edad correspondiente (si existe).
         */
        
        HashMap<String,Integer> personas = new HashMap<>();
        
        personas.put("Jose",23);
        personas.put("Ramona",45);
        personas.put("Paula",20);
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();

        
        if ( personas.get(nombre) != null ){
                System.out.println(nombre + " tiene " +  personas.get(nombre) + " años.");
        }

      
        
                
         
         System.out.println();
                
         /**
          * Eliminar un elemento
            Usa un HashMap con países como clave y sus capitales como valor. 
            Elimina un país dado y muestra el nuevo mapa.
          */       
         
       HashMap<String,String> paises = new HashMap<>();

        paises.put("España", "Madrid");
        paises.put("Francia", "París");
        paises.put("Italia", "Roma");
        paises.put("Alemania", "Berlín");
        paises.put("Japón", "Tokio");
         
        System.out.println(paises);
        
  
        System.out.print("\nIntroduce el nombre de un país para eliminar: ");
        String paisEliminar = sc.nextLine();
        
        if (paises.containsKey(paisEliminar)){
            paises.remove(paisEliminar);
                System.out.println(paisEliminar + " ha sido eliminado.");

        }else {
                System.out.println("El país no existe en el mapa.");
        }
         
                System.out.println();
                
       
        System.out.println(paises);
        
        sc.close();
       
    }
    
}
