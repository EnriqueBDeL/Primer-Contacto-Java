
package ejercicio3;

import java.util.TreeSet;


public class Main {

   

    
   
    
    public static void main(String[] args) {

    TreeSet<String> conjunto = new TreeSet<>();
        
         conjunto.add("Estoy");
        conjunto.add("en");
        conjunto.add("la");
        conjunto.add("clase");
        conjunto.add("de");
        conjunto.add("POO");
        conjunto.add("en");    
        conjunto.add("la");    
        conjunto.add("UCAM");
        
        System.out.println("Palabras en el TreeSet:");
        for (String palabra : conjunto) {
            System.out.println(palabra);
        }

        
         System.out.println();
        
         
        System.out.println("El tamaño del conjunto es: " + conjunto.size());
        System.out.println("El primer elemento es: " + conjunto.first());
        System.out.println("El ultimo elemento es: " + conjunto.last());
        
        
        conjunto.remove("POO");
        
        
                 System.out.println();

        
        System.out.println("Palabras en el TreeSet con 'POO' eliminada:");
        for (String palabra : conjunto) {
            System.out.println(palabra);
        }
        
    }
    
}
