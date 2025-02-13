/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6.paquete1;

/**
 *
 * @author enriq
 */
public class B {
    
   
private A at;

public void reset() {
at.at1 = 0; // OK
at.at2 = 0; // ERROR    No funciona, porque al ser privada, solo puede usarse en la misma clase.
at.at3 = 0; // OK
}


}
