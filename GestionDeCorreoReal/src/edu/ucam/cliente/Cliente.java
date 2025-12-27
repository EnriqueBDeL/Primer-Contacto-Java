package edu.ucam.cliente;

import java.rmi.Naming;
import java.util.Scanner;
import edu.ucam.servior.InterfazRemota;

public class Cliente {

    public void ejecutar() {
        

    	try (Scanner sc = new Scanner(System.in)) {
        
            InterfazRemota conexion = (InterfazRemota) Naming.lookup("rmi://localhost/GestionCorreoReal");
            
            while(true) {
                
                System.out.println("\n****MENU****:");
                System.out.println("1. Enviar carta.");
                System.out.println("2. Consultar carta.");
                System.out.println("3. Eliminar carta.");
                System.out.println("4. Modificar carta.");
                System.out.println("5. Salir.");
                System.out.println("Introduce una opción: ");

                String entrada = sc.nextLine(); 
                int opcion;
                
                try {
                    opcion = Integer.parseInt(entrada); 
                } catch (NumberFormatException e) {
                    System.err.println("Introduzca un número válido"); 
                    continue; 
                }

                
                switch(opcion) {
                
                    case 1:

                    	System.out.println("Introduce Nombre:");
                        String nom = sc.nextLine();
                        System.out.println("Introduce Regalo:");
                        String reg = sc.nextLine();
                        System.out.println("Introduce Fecha:");
                        String fec = sc.nextLine();
                        
                        System.out.println(conexion.enviarCarta(fec, reg, nom));
                        break;
                    
                    case 2:
                        System.out.println("Introduce ID a consultar:");
                        String idCons = sc.nextLine();
                        System.out.println(conexion.consultarCarta(idCons));
                        break;

                    case 3:
                        System.out.println("Introduce ID a borrar:");
                        String idDel = sc.nextLine();
                        System.out.println(conexion.eliminarCarta(idDel));
                        break;
                        
                    case 4: 
                        System.out.println("Introduce ID a modificar:");
                        String idMod = sc.nextLine();
                        System.out.println("Nuevo Nombre:");
                        String nNom = sc.nextLine();
                        System.out.println("Nuevo Regalo:");
                        String nReg = sc.nextLine();
                        System.out.println("Nueva Fecha:");
                        String nFec = sc.nextLine();
                        
                        System.out.println(conexion.modificarCarta(idMod, nFec, nReg, nNom));
                        break;
                        
                    case 5:
                        System.out.println("Saliendo...");
                        return; 
                    default: 
                        System.out.println("Opción inválida.");
                }
            }
        
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Cliente().ejecutar();
    }
}