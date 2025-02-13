/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author enriq
 */
public class Main {


    public static void main(String[] args) {
        
        ArrayList<Caja> lista = new ArrayList<>();
        
        for (int i = 1; i <= 10; i++) {
            lista.add(new Caja(i));
        }

        int contador = 0;
        for (Caja caja : lista) {
            contador++;
            System.out.println("Caja " + contador  + " contiene el numero: " + caja.getNumero());
        }
        
    }
    
}
