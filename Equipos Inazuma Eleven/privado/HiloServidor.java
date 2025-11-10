package privado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;



public class HiloServidor extends Thread {

	private BufferedReader br;
	private PrintWriter pw;
	private Servidor servidor;
	private Socket socket;
	private String nombreUsuario;
	private boolean salir = false;
	
	
	
	public HiloServidor(BufferedReader br, PrintWriter pw, Servidor servidor, Socket socket, String nombreUsuario) {
		super();
		this.br = br;
		this.pw = pw;
		this.servidor = servidor;
		this.socket = socket;
		this.nombreUsuario = nombreUsuario;
	
	}
	
	
	
	
	public void run() {
	
		
		String lineaRecibida;
		
		boolean salir = false;
		
		try {
			
			while(!salir && (lineaRecibida = br.readLine()) != null) {
			
				String partes[] = lineaRecibida.split(" ");
				String comando = partes[0].toUpperCase();
				String respuesta = ""; 

				
				switch (comando) {
				
				case "ADD": //ADD id nombreEquipo numeroJugadores
					
					
				
						
					if (partes.length == 4) {
					
						try {
						
						String id = partes[1];
						String nombreEquipo = partes[2];
						int numeroJugadores = Integer.parseInt(partes[3]);
						
						respuesta = servidor.agregarEquipo(id, nombreEquipo,numeroJugadores);

					
				} catch (NumberFormatException e) {
					
						respuesta = "ERROR: la cantidad debe ser un valor entero.";
						
					}
						
				} else {
					respuesta = "ERROR: Formato incorrecto. Uso: ADD id nombreEquipo numeroJugadores";
				}
				
				break;
				
				
				
				case "GET": // GET ID
					
					if (partes.length == 2) {
						
						String id = partes[1];

						respuesta = servidor.verEquipo(id);
						
					} else {
						respuesta = "ERROR: Formato incorrecto. Uso: GET ID";
					}
					
					break;	
					
				}
				
				if (respuesta != null && !respuesta.isEmpty()) {
					pw.println(respuesta);
					pw.flush();
				}
			}
		}catch(IOException e) {
			
		}
	}
}
