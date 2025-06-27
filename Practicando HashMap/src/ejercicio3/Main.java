
package ejercicio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

   /**
    * Tienes una tienda y quieres llevar el control del stock de productos. 
    
        Usa un HashMap<String, Integer> donde la clave es el nombre del producto y el valor es la cantidad disponible.

        Haz lo siguiente:
        Crea un HashMap con al menos 5 productos y cantidades iniciales.

        Muestra el inventario completo.

        Pide al usuario un nombre de producto y una cantidad a vender.

        Si el producto existe y hay suficiente stock, resta la cantidad vendida.

        Si no hay suficiente stock, muestra un mensaje.

        Muestra el inventario actualizado.
    */
    
    
    
    public static void main(String[] args) {

        HashMap<String,Integer> stock = new HashMap<>();
        
        stock.put("Manzana",353);
        stock.put("Jamon",82);
        stock.put("Pan",40);
        stock.put("Agua",200);
        stock.put("Queso",242);
        
        System.out.println("Stock actual:");
        
        for(Map.Entry<String,Integer> m : stock.entrySet()){
        
        System.out.println("Producto: " + m.getKey() + " | Cantidad disponible: " + m.getValue());

        }
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nIntroduce el nombre de un producto: ");
        
        String nombre = sc.nextLine();
        
        System.out.print("\nIntroduce la cantidad que deseas vender: ");
        
        int cantidadVender = sc.nextInt();
        
        
        if(stock.containsKey(nombre) ){
            if(stock.get(nombre) > cantidadVender){
                stock.replace(nombre, stock.get(nombre)-cantidadVender);
            }else{
              System.out.println("\nNo hay suficiente estock.");  
            } 
        }
        
        System.out.println("\nStock actual(Actualizado):");
        
        for(Map.Entry<String,Integer> m : stock.entrySet()){
        
        System.out.println("Producto: " + m.getKey() + " | Cantidad disponible: " + m.getValue());

        }
        
    } 
}
