package edu.ucam.cliente;

import java.rmi.Naming;
import java.util.Scanner;
import edu.ucam.servidor.CongresoIf; 

public class Cliente {

    public void ejecutar() {
        try (Scanner sc = new Scanner(System.in)) {

            CongresoIf server = (CongresoIf) Naming.lookup("rmi://localhost/CongresoService");

            while (true) {
                System.out.println("\n**** MENU ****:");
                System.out.println("1. Añadir Congreso");
                System.out.println("2. Consultar Congreso");
                System.out.println("3. Modificar Congreso");
                System.out.println("4. Eliminar Congreso");
                System.out.println("5. Salir");
                System.out.print("\nIntroduce una opción: ");

                String entrada = sc.nextLine();
                int opcion;

                try {
                    opcion = Integer.parseInt(entrada);
                } catch (NumberFormatException e) {
                    System.out.println("ERROR: Introduce un número válido.");
                    continue;
                }

                switch (opcion) {
                    case 1: // AÑADIR
                        System.out.print("Introduce descripción: ");
                        String desc = sc.nextLine();
                        System.out.print("Introduce fecha: ");
                        String fecha = sc.nextLine();
                        System.out.println(server.registrarCongreso(desc, fecha));
                        break;

                    case 2: // CONSULTAR
                        System.out.print("Introduce ID (ej: C1): ");
                        String idGet = sc.nextLine();
                        System.out.println(server.consultarCongreso(idGet));
                        break;

                    case 3: // MODIFICAR
                        System.out.print("Introduce ID a modificar: ");
                        String idUpd = sc.nextLine();
                        System.out.print("Nueva descripción: ");
                        String nDesc = sc.nextLine();
                        System.out.print("Nueva fecha: ");
                        String nFecha = sc.nextLine();
                        System.out.println(server.modificarCongreso(idUpd, nDesc, nFecha));
                        break;

                    case 4: // ELIMINAR
                        System.out.print("Introduce ID a eliminar: ");
                        String idDel = sc.nextLine();
                        System.out.println(server.eliminarCongreso(idDel));
                        break;

                    case 5: // SALIR
                        System.out.println("Cerrando cliente...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Cliente().ejecutar();
    }
}
