/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;

//import tema3.personajes.Bolsa;
//import tema3.personajes.Personaje;
import tema3.personajes.*;
    
/**
 *
 * @author 48491898
 * @modificacion EnriqueBDL
 */
public class Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personaje p = new Personaje();
        p.setNombre("Hercules");
        Personaje o = new Personaje(75.6f);
         Personaje s = new Personaje("Marte");
        //Bolsa b;
        
        
        System.out.println("P fuerza: " + p.getFuerza() );
        System.out.println("O fuerza: " + o.getFuerza() );
        
         System.out.print("\n");
         
        System.out.println(p.getNombre()+" fuerza: " + p.getFuerza() );
          System.out.println(s.getNombre()+" fuerza: " + o.getFuerza() );
          
         System.out.print("\n");
          
        Personaje x = new Personaje(80f);

    }
    
}
