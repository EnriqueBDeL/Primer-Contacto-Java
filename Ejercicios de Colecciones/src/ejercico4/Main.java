
package ejercico4;

import java.util.HashMap;
import java.util.Map;


public class Main {

   
    public static void main(String[] args) {

            Map<String,String> diccionario = new HashMap<>();
            
            diccionario.put("Español", "Hola Mundo");
            diccionario.put("Inglés", "Hello World");
            diccionario.put("Francés", "Bonjour le Monde");
            diccionario.put("Italiano", "Ciao Mondo");
            
            if (diccionario.containsKey("Español")) {
                System.out.println("En Español: " + diccionario.get("Español"));
            } else {
                System.out.println("No existe la frase en Español en el diccionario.");
            }

              System.out.println();
            
                System.out.println("Idiomas disponibles en el diccionario:");
               for (String idioma : diccionario.keySet()) {
                   System.out.println(idioma);
               }            

    }
    
}
