package codigos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.Hashtable;




public class HiloParking extends Thread{

	
	private Socket socket;
	
	private static float recaudacion = 0;
	
	
	
	
	private static Hashtable<String,Coche> parking = new Hashtable<>(); 
	
	
	
	public HiloParking(Socket socket) {
		super();
		this.socket = socket;
	}

	


	public void run() {
		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			PrintWriter pw = new PrintWriter( new OutputStreamWriter(socket.getOutputStream()),true);
			
			
			
			while(true) {
				
				
				
				String linea = br.readLine();
				
				String[] partes = linea.split(" ");
				
				String comando = partes[0];
				
				
				
				
				switch(comando){
				
				
				
				case "ENTRAR":
					
					if(partes.length < 2) {
						
						pw.println("\nComando erroneo.");
						
					}else {
						
						String matricula = partes[1];
						
						if(parking.containsKey(matricula)) {
							
							pw.println("\nError. El coche ya está dentro.");
							
						}else {
							
							Coche c1 = new Coche(matricula);
							
							parking.put(matricula, c1);
							
							Timestamp hora = GestorTarifas.getHoraActual();
							c1.setHoraEntrada(hora);
							
							pw.println("Barrera abierta. " + GestorTarifas.getTexto(hora));
							
						}
						
					}
					
					break;
					
					//--------------------------------------------------------------------------------|
					
				case "SALIR":
					
					if(partes.length < 2) {
						
						pw.println("\nComando erroneo.");
						
					}else {
						
						String matricula = partes[1];
						
						if(parking.containsKey(matricula)) {
							
							Coche c1 = parking.get(matricula);
							
							Timestamp horaSalida = GestorTarifas.getHoraActual();
							
							float precio = GestorTarifas.calcularImporte(c1.getHoraEntrada(), horaSalida);							
							
							recaudacion += precio;
							
							parking.remove(matricula);
							
							pw.println("\nSalida correcta. Importe:"+ precio + "€");

							
						}else {
							
							pw.println("\nError. El coche no ha entrado");

						}
						
					}
					
					break;
					
					//--------------------------------------------------------------------------------|

				case "VER":
					
						if(partes.length < 2) {
						
							pw.println("\nComando erroneo.");
						
						}else {
							
							String matricula = partes[1];

							if(parking.containsKey(matricula)) {
								
								Coche c1 = parking.get(matricula);
								
								String fechaBonita = GestorTarifas.getTexto(c1.getHoraEntrada());
								
								pw.println("El coche entró a las " + fechaBonita);
								
							}else {
								
								pw.println("\nEl coche no está en el parking.");

							}
							
						}
					
					break;
					
					//--------------------------------------------------------------------------------|

				case "CAJA":
					
					if(partes.length > 1) {
						
						pw.println("\nComando erroneo.");
					
					}else {
						
						pw.println("\nRecaudación total:" + recaudacion + "€");
						
					}
					
				
				break;

				
				}
								
				
			}
			
			
		}catch(IOException e) {
			
			
			
		}
		
	}
	
	
}
