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

@Path("/peliculas")
public class ControlPeliculas {
	
	public static Hashtable<String,Pelicula> cine = new  Hashtable<String,Pelicula>();
	

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response editar(InputStream inputStream) {
		
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
		
		JSONObject recibidoJSON = new  JSONObject(sb.toString());
		
		if(cine.containsKey(recibidoJSON.getString("codigo"))) {
			
			
			
			Pelicula pelicula = cine.get(recibidoJSON.getString("codigo"));
			
			pelicula.setCodigo(recibidoJSON.getString("codigo"));
			pelicula.setTitulo(recibidoJSON.getString("titulo"));
			
			int nota = recibidoJSON.getInt("nota");
			
			if(nota < 0 || nota > 10) {
				return Response.status(400).build();
			}else {
				pelicula.setNota(recibidoJSON.getInt("nota"));
			}
			
			cine.put(pelicula.getCodigo(), pelicula);
			
			JSONObject respuestaJSON = new  JSONObject();
			JSONObject peliculaJSON = new  JSONObject();
			
			peliculaJSON.put("codigo", pelicula.getCodigo());
			peliculaJSON.put("titulo", pelicula.getTitulo());
			peliculaJSON.put("nota", pelicula.getNota());
			
			respuestaJSON.put("pelicula", peliculaJSON);
			
			return Response.status(200).entity(respuestaJSON.toString()).build();
			
		}else {
			return Response.status(404).build();
		}
				
		
	}
	
	
	@DELETE
	@Path("/{codigo}")
	public Response eliminar(@PathParam("codigo") String codigo) {
		
		if(cine.containsKey(codigo)) {
			
			cine.remove(codigo);
			
			return Response.status(200).build();
			
		}
		return Response.status(404).build();

	}
	
	
	
}
