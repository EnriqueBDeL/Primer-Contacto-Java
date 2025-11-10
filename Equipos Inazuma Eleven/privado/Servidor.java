package privado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class Servidor {

	private static final int PUERTO = 4444;
	
	
	private Hashtable<String, HiloServidor> listaHilos= new  Hashtable<String, HiloServidor>();
	
	private Hashtable<String,Equipo> listaEquipo = new Hashtable<String,Equipo>();
	
	
	
	
	public void ejecucion() {
		
		try {
			
		
		ServerSocket socketServer = new ServerSocket(Servidor.PUERTO);
		
		while(true) {
			
			
			System.out.println("Esperando conexión...");
			Socket socket = socketServer.accept();
			
			
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter pw = new PrintWriter( new OutputStreamWriter(socket.getOutputStream()));
			
			
			
			pw.println("Bienvenido al servidor del Inazuma Eleven. Escribe tu nombre");
			pw.flush();
			
			
			
			String nombreUsuario = br.readLine();
			
			
			System.out.println("Cliente '" + nombreUsuario + "' conectado.");
			
			
			pw.println(" Hola " + nombreUsuario + ". Escribe comandos como (ej: ADD ...). Escribe 'EXIT' para salir.");
			pw.flush();
			
			HiloServidor hiloServidor = new HiloServidor(br, pw, this, socket, nombreUsuario);
			hiloServidor.start();
			
			listaHilos.put(nombreUsuario, hiloServidor);
			
		}
		
		
		}catch(IOException e) {
			
		}
		
	}
	
	
	public String agregarEquipo(String id, String nombre, int numeroJugadores) {
		
		
		if (listaEquipo.containsKey(id)) {
			
			return "ERROR: El Equipo '" + nombre + "' ya existe.";
			
		} else {
		
		
		Equipo equipo = new Equipo(nombre, numeroJugadores);
		
		listaEquipo.put(id, equipo);
		
		
		
		System.out.println("SERVIDOR: Equipo añadido -> " + id);
		
		return " Equipo '" + nombre + "' añadido correctamente.";
		
		}
	}
	
	
	public String verEquipo(String id) {
		
		
		Equipo equipo = listaEquipo.get(id); 
		
		
		if (equipo != null) {
			
			return equipo.toString(); 
			
		} else {
			
			return "ERROR: Equipo no encontrado.";
			
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		(new Servidor()).ejecucion();
		
		
	}

}
