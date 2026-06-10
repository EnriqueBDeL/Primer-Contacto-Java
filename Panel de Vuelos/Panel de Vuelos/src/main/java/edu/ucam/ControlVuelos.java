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

@Path("/vuelos")
public class ControlVuelos {


	public static Hashtable<String, Vuelo> panel = new Hashtable<String, Vuelo>();
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response registrar(InputStream inputStream) {
		
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
		
		JSONObject recibidoJSON = new JSONObject(sb.toString());
		
		String codigo = recibidoJSON.getString("codigo");
		
		if(panel.containsKey(codigo)) {
			return Response.status(409).build();
		}
		
		Vuelo vuelo = new Vuelo();
		
		vuelo.setCodigo(codigo);
		vuelo.setAerolinea(recibidoJSON.getString("aerolinea"));	
		vuelo.setDestino(recibidoJSON.getString("destino"));
		
		double precio = recibidoJSON.getDouble("precio");
		
		if(precio < 0) {
			return Response.status(400).build();
		}
		
		vuelo.setPrecio(precio);
		
		panel.put(codigo, vuelo);
	
		JSONObject respuestaJSON = new JSONObject();

		JSONObject vueloJSON = new JSONObject();

		
		vueloJSON.put("codigo", codigo);
		vueloJSON.put("aerolinea", vuelo.getAerolinea());
		vueloJSON.put("destino", vuelo.getDestino());
		vueloJSON.put("precio", vuelo.getPrecio());
		
		respuestaJSON.put("vuelo", vueloJSON);
		
		return Response.status(200).entity(respuestaJSON.toString()).build();

	}
	
	
	@GET
	@Path("/listado")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listar() {
		
		JSONObject respuestaJSON = new JSONObject();
		
		for(Vuelo vuelo : panel.values()) {
			
			JSONObject vueloJSON = new JSONObject();
			
			vueloJSON.put("codigo", vuelo.getCodigo());
			vueloJSON.put("aerolinea", vuelo.getAerolinea());
			vueloJSON.put("destino", vuelo.getDestino());
			vueloJSON.put("precio", vuelo.getPrecio());
			
			respuestaJSON.append("vuelo", vueloJSON);
			
		}
		return Response.status(200).entity(respuestaJSON.toString()).build();
	}
	
	
	
	@DELETE
	
	@Path("/{codigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response borrar(@PathParam("codigo") String codigo) {
		
		if(panel.containsKey(codigo)) {
			
			panel.remove(codigo);
			
			return Response.status(200).entity(true).build();
			
		}else {
			
			return Response.status(404).build();
			
		}	
		
	}
	
}
