package calculadora.servidor;


//---------------------|
import java.rmi.Naming;
//---------------------|

//---------------------------------------|
import java.rmi.registry.LocateRegistry;
//---------------------------------------|



public class Servidor {

	
	
	public Servidor() {
		try {
            System.out.println("=========================================");
            System.out.println("      INICIANDO SERVIDOR CALCULADORA      ");
            System.out.println("=========================================");

         
            LocateRegistry.createRegistry(1099);	// Inicia el servicio de directorio (el listín telefónico o RMIRegistry) en el puerto 1099 de tu ordenador para que los clientes puedan buscar y conectar con los objetos remotos.
            System.out.println(">>> [OK] Registro RMI iniciado en puerto 1099.");

      
            Calculadora c = new FuncionesCalculadora(); 
            System.out.println(">>> [OK] Objeto 'FuncionesCalculadora' creado.");

            
            
            Naming.rebind("rmi://localhost:1099/CalculatorService", c);	//Publica (o registra) tu objeto "c" en el directorio del servidor bajo el nombre "CalculatorService", haciéndolo accesible para que los clientes puedan encontrarlo y usarlo .
            System.out.println(">>> [OK] Objeto publicado en: rmi://localhost:1099/CalculatorService");

            
            
            System.out.println("\n>>> El servidor está LISTO y esperando peticiones de clientes...");
            

            
        } catch (Exception e) {
            System.err.println("!!! Error al iniciar el servidor:");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        new Servidor();
    }
}
