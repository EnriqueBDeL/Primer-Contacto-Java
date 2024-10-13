/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.mundo;

/**
 *
 * @author enriq
 */
public class Principal {
    
    
     public static void main(String[] args){
        
        Persona p = new Persona("346546");
        
        int edad = p.calcularEdad(2025);
        System.out.println("Edad: "+ edad);
        
    }
    
    
}
