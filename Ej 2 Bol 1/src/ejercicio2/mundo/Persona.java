/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2.mundo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author enriq
 */
public class Persona {
    
   private String NIF;
   private int anioNacimiento = 1994;
   private String nombre;
   private float altura = 1.70f;
    
    
    public Persona(String NIF){
      
        this.NIF = NIF;
      
    }
    
    public Persona(Persona p){
        
        this.NIF = p.NIF;
        this.nombre = p.nombre;
    }
    
    public void cambiarNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int calcularEdad(int anioNacimiento){
        return anioNacimiento - this.anioNacimiento;
    }
    
    
}
