package edu.ucam.jurassic.cliente;

import java.rmi.Naming;
import java.util.Scanner;
import edu.ucam.jurassic.servidor.InterfazRemota;

public class TabletDeControl {

    public void ejecutar() {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            InterfazRemota server = (InterfazRemota) Naming.lookup("rmi://localhost/LaboratorioCentral");
            
            while(true) {
                
                System.out.println("\n****MENU JURASSIC****:");
                System.out.println("1. Incubar nuevo especimen.");
                System.out.println("2. Consultar estado (Localizar).");
                System.out.println("3. Registrar baja (Eliminar).");
                System.out.println("4. Actualizar datos (Trasladar).");
                System.out.println("5. Salir del sistema.");
                System.out.println("-----------------------");
                System.out.println("Introduce una opción: ");
                
                String entrada = sc.nextLine();
                int opcion = 0;

                try {
                	
                    opcion = Integer.parseInt(entrada);
                    
                } catch (NumberFormatException e) {
                    System.err.println("Error: Debes introducir un número válido.");
                    continue; 
                }
                
                switch(opcion) {
                
                    case 1: // INCUBAR
                        System.out.println("Introduce el nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce la especie: ");
                        String especie = sc.nextLine();
                        System.out.println("Introduce el nivel de peligrosidad: ");
                        String nivelPeligrosidad = sc.nextLine();
                        
                        System.out.println(server.incubar(nombre, especie, nivelPeligrosidad));
                        break;
                    
                    case 2: // CONSULTAR / LOCALIZAR
                        System.out.println("Introduce el ID del dinosaurio a buscar:");
                        String idBuscar = sc.nextLine();
                        
                        System.out.println(server.localizar(idBuscar));
                        break;

                    case 3: // DAR DE BAJA
                        System.out.println("Introduce el ID del dinosaurio a eliminar:");
                        String idBorrar = sc.nextLine();
                        
                        System.out.println(server.darDeBaja(idBorrar));
                        break;

                    case 4: // ACTUALIZAR / TRASLADAR
                        System.out.println("Introduce el ID del dinosaurio a modificar:");
                        String idMod = sc.nextLine();
                        
                        System.out.println("Introduce el NUEVO nombre: ");
                        String nNombre = sc.nextLine();
                        System.out.println("Introduce la NUEVA especie: ");
                        String nEspecie = sc.nextLine();
                        System.out.println("Introduce el NUEVO nivel de peligrosidad: ");
                        String nPeligro = sc.nextLine();
                        
                        System.out.println(server.trasladar(idMod, nNombre, nEspecie, nPeligro));
                        break;

                    case 5: // SALIR
                        System.out.println("Cerrando conexión con Jurassic World...");
                        return; 
                    
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                        break;
                }
            }
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new TabletDeControl().ejecutar();
    }
}