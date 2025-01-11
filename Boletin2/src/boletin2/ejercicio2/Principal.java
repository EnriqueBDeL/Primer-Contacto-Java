package boletin2.ejercicio2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el nombre de la clase (Punto, Punto3D, Punto4D):");
            String nombreClase = scanner.nextLine();
            String nombreCompletoClase = "boletin2.ejercicio2." + nombreClase;

            Class<?> clase = Class.forName(nombreCompletoClase);
            Object instancia;

            if (clase == Punto.class) {
                instancia = clase.getDeclaredConstructor(double.class, double.class).newInstance(0.0, 0.0);
            } else if (clase == Punto3D.class) {
                instancia = clase.getDeclaredConstructor(double.class, double.class, double.class).newInstance(0.0, 0.0, 0.0);
            } else if (clase == Punto4D.class) {
                instancia = clase.getDeclaredConstructor(double.class, double.class, double.class, double.class).newInstance(0.0, 0.0, 0.0, 0.0);
            } else {
                throw new IllegalArgumentException("Clase no válida");
            }

            double x = obtenerCoordenada(scanner, "Ingrese la coordenada X: ");
            double y = obtenerCoordenada(scanner, "Ingrese la coordenada Y: ");

            Method setX = clase.getMethod("setX", double.class);
            Method setY = clase.getMethod("setY", double.class);
            setX.invoke(instancia, x);
            setY.invoke(instancia, y);

            if (instancia instanceof Punto3D) {
                double z = obtenerCoordenada(scanner, "Ingrese la coordenada Z: ");
                Method setZ = clase.getMethod("setZ", double.class);
                setZ.invoke(instancia, z);
            }

            if (instancia instanceof Punto4D) {
                double t = obtenerCoordenada(scanner, "Ingrese la coordenada T: ");
                Method setT = clase.getMethod("setT", double.class);
                setT.invoke(instancia, t);
            }

            System.out.println(instancia.toString());
            scanner.close();

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static double obtenerCoordenada(Scanner scanner, String mensaje) {
        double coordenada = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print(mensaje);
                coordenada = scanner.nextDouble();
                entradaValida = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada invalida. Por favor ingrese un numero decimal valido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
        return coordenada;
    }
}
