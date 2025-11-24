CODIGO:

import java.io.*;
import java.net.*;


public class Servidor {

    public static final int PUERTO = 8000;

    public void ejecutar() {
        try {
            ServerSocket serverSocket = new ServerSocket(Servidor.PUERTO);
            System.out.println("Esperando cliente...");
            Socket socket = serverSocket.accept();

            BufferedReader br = new
                BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            while(true) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fin de servidor");
        }
    }

    public static void main(String[] args) {
        (new Servidor()).ejecutar();
    }
}


||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||


¿Cuál es el motivo para que salte la siguiente excepción al ejecutar dos veces seguidas el programa? java.net.BindException: Address already in use


RESPUESTA:

Porque estás intentando iniciar el servidor en el puerto 8000 cuando este ya está ocupado por la primera ejecución del programa.
