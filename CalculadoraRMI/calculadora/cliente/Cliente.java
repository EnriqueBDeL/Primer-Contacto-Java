package calculadora.cliente;

import calculadora.servidor.Calculadora;
import java.rmi.Naming;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
      
    	Scanner scanner = new Scanner(System.in);
        String nombreCliente = "";
        Calculadora c = null;

        try {
        	
            c = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculatorService"); 	// "Naming" proporciona la API para interactuar con el servicio de registro de objetos remotos.
            																		   	// "lookup()" consulta dicho registro para obtener la referencia asociada a un nombre específico.
            																			// Estructura URL según la especificación RMI: rmi://<host_name>::puerto/<nombre_servicio>
            																			/*
            																			    - Protocolo (rmi://): Especifica que se utilizará el protocolo de invocación remota de Java.

																							- Host (localhost): Indica la dirección IP o nombre de host donde se está ejecutando el RMI Registry. En este caso, es la máquina local.
																							
																							- Puerto (1099): Es el puerto TCP donde el servicio de registro escucha las peticiones. El puerto 1099 es el estándar por defecto para RMI.
																							
																							- Nombre del Servicio (/CalculatorService): Es el identificador único (cadena de texto) con el que el servidor registró el objeto previamente usando rebind.
																							            																		
            																			 */
            
            //(!) El método "Naming.lookup" devuelve un objeto de tipo genérico "java.rmi.Remote".
            //    Es necesario realizar una conversión explícita (casting) a la Interfaz del servicio (Calculadora).
            
            
            
            System.out.println("=========================================");
            System.out.println("   BIENVENIDO A LA CALCULADORA RMI");
            System.out.println("=========================================");
            System.out.print("\n\nPor favor, introduce tu nombre: ");
            nombreCliente = scanner.nextLine();
            

            c.conectar(nombreCliente);

            
            int opcion = -1;
            
            do {
                System.out.println("\n--- Menú ---:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("0. Salir");
                System.out.print("Opción: ");

                if (scanner.hasNextInt()) {
                    opcion = scanner.nextInt();
                    
                    if (opcion >= 1 && opcion <= 4) {
                        System.out.print("\nNum 1: ");
                        long a = scanner.nextLong();
                        System.out.print("Num 2: ");
                        long b = scanner.nextLong();
                        
                        // Ejemplo de llamada
                        if (opcion == 1) System.out.println("Resultado: " + c.add(a, b));
                        if (opcion == 2) System.out.println("Resultado: " + c.sub(a, b));
                        if (opcion == 3) System.out.println("Resultado: " + c.mul(a, b));
                        if (opcion == 4 && b != 0) System.out.println("Resultado: " + c.div(a, b));
                    }
                } else {
                    scanner.next(); 
                    opcion = -1;
                }

            } while (opcion != 0);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (c != null && !nombreCliente.isEmpty()) {
                    c.desconectar(nombreCliente);
                    System.out.println("Sesión cerrada correctamente.");
                }
            } catch (Exception ex) {
                System.out.println("No se pudo notificar la desconexión.");
            }
            scanner.close();
        }
    }
}
