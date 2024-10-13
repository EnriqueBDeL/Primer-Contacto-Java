/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author enriq
 */
public class Producto {
    
    
       
   private  String nombre = null;
   private  float precio  = 0f;
    
    
    
    public Producto(){
        
        System.out.println("Producto creado.");
    }
       
    
           
     public Producto (String nombre, float precio){
         
         this.nombre = nombre;
         this.precio = precio;
         
         
     }
     
     
     public String getInformacion (){
         
         return "Nombre:" + this.nombre+", Precio: " + this.precio;
         
         
     }
         
    
           
    public static void main(String[] args) {
       
             Producto p = new Producto();
        
           Producto p2 = new Producto(" Enrique",2.34f);
           
           System.out.println(p2.getInformacion());

           
    }  
}
