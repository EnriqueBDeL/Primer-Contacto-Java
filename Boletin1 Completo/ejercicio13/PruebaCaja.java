/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author enriq
 */
public class PruebaCaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manzana manzana1 = new Manzana("Roja","Lisa",2);
        
        Caja<Manzana> c1  = new Caja<>(manzana1);
        
        System.out.println("Contenido de la caja: " + c1.dame());

        
    }
    
}
