
package boletin2.ejercicio9;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {


      Vector<Persona> personas = new Vector<>();

        for (int i = 1; i <= 10; i++) {

            String nombre = "nombre" + i;
            String direccion = "direccion" + i;
            String telefono = "telefono" + i;

            personas.add(new Persona(nombre, direccion, telefono));
        }

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}