/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author enriq
 */
public class Poligono {
    
     private int lados = 0;
    
    public Poligono(){
        
        System.out.println("Poligono creado.");
    }
    
    public Poligono(int lados){
        this.lados = lados;
    }
    
    public int getLados(){
        return lados;
    }
    
    public static void main(String[] args){
       
        Poligono p = new Poligono(4);
        
        System.out.println("El numero de lados es: " + p.getLados());
         
    }
    
}
