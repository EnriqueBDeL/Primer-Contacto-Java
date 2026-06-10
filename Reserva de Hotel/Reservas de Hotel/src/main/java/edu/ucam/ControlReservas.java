package edu.ucam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import org.json.JSONObject;
import org.json.JSONArray; 

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/reservas")
public class ControlReservas {

	public static Hashtable<String, Reserva> sistema = new Hashtable<String, Reserva>();
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(InputStream inputStream) {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(inputStream));
		
		StringBuilder sb = new StringBuilder();
		
		String linea = "";
		
		try {
			
			while((linea = br.readLine()) != null) {
				sb.append(linea);
			}
			
		}catch(IOException e) {
			return Response.status(500).build();
		}
		
		JSONObject receptorJSON = new JSONObject(sb.toString());
		
		String localizador =  receptorJSON.getString("localizador");
		
		if(sistema.containsKey(localizador)) {
			
		
			
			Reserva reserva = sistema.get(localizador);
			
			reserva.setNoches(receptorJSON.getInt("noches"));
			reserva.setPrecio(receptorJSON.getDouble("precio"));

			sistema.put(localizador, reserva);
			
			JSONObject reservaJSON = new JSONObject();
			JSONObject resultadoJSON = new JSONObject();
			
			reservaJSON.put("localizador", reserva.getLocalizador());
			reservaJSON.put("cliente", reserva.getCliente());
			reservaJSON.put("noches", reserva.getNoches());
			reservaJSON.put("precio", reserva.getPrecio());

			resultadoJSON.put("reserva", reservaJSON);
			
			return Response.status(200).entity(resultadoJSON.toString()).build();
			
			
		}else {
			return Response.status(404).build();
		}
		
		
	}
	
	
}
