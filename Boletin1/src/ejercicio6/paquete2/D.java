/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.paquete2;


public class D {
   
    private ejercicio6.paquete1.A at;

    
    public void reset() {
    at.at1 = 0; // ERROR
    at.at2 = 0; // ERROR  No funciona ninguna, porque solo puede accederse a las variables de otras clase de otros paquetes mediante public.
    at.at3 = 0; // ERROR
    }

}
