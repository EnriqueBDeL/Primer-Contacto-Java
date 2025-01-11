package boletin2.ejercicio7;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        
        Coche miCoche = new Coche("Chiron", "Bugatti", 1234);

        try (PrintWriter pw = new PrintWriter(new FileWriter("coche.txt"))) {
            pw.println("Modelo: " + miCoche.getModelo());
            pw.println("Marca: " + miCoche.getMarca());
            pw.println("Precio: " + miCoche.getPrecio());

            System.out.println("El coche se ha guardado correctamente en el fichero 'coche.txt'.");
        } catch (IOException e) {
            System.err.println("Error al guardar el coche: " + e.getMessage());
        }
    }
}
