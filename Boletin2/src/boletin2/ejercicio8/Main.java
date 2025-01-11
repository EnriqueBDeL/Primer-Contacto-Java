package boletin2.ejercicio8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       
        File archivo = new File("coche.txt");
        Coche miCoche;

        if (archivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                String modelo = br.readLine(); 
                String marca = br.readLine();
                float precio = Float.parseFloat(br.readLine());
                
                miCoche = new Coche(modelo, marca, precio);
                System.out.println("Objeto recuperado del archivo:");
                System.out.println(miCoche);

            
                miCoche.setModelo("Veyron");
                miCoche.setMarca("Bugatti");
                miCoche.setPrecio(2500);
                System.out.println("Objeto actualizado:");
                System.out.println(miCoche);
            } catch (IOException | NumberFormatException e) {
                System.err.println("Error al leer el objeto del archivo: " + e.getMessage());
                return;
            }
        } else {
       
            miCoche = new Coche("Chiron", "Bugatti", 1234);
            System.out.println("Archivo no encontrado. Se ha creado un nuevo objeto:");
            System.out.println(miCoche);
        }


        try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
            pw.println(miCoche.getModelo()); 
            pw.println(miCoche.getMarca()); 
            pw.println(miCoche.getPrecio()); 
            System.out.println("El objeto se ha guardado correctamente en el fichero 'coche.txt'.");
        } catch (IOException e) {
            System.err.println("Error al guardar el objeto: " + e.getMessage());
        }
    }
}
