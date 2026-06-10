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

@Path("/libros/")
public class ControlLibros {

	public static Hashtable<String,Libro> biblioteca = new Hashtable<String,Libro>();
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response agregar(InputStream inputStream) {
		
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
		
		JSONObject recibido = new JSONObject(sb.toString());
		String isbn = recibido.getString("isbn");
		
		if(biblioteca.containsKey(isbn)) {
			
			return Response.status(409).build();
			
		}
		
		Libro libro = new Libro();
		
		libro.setIsbn(recibido.getString("isbn"));
		libro.setTitulo(recibido.getString("titulo"));
		
		int n = recibido.getInt("paginas");
				
		if(n > 0) {
		libro.setPaginas(recibido.getInt("paginas"));
		}else {
			return Response.status(400).build();
		}
		
		biblioteca.put(libro.getIsbn(), libro);
		
		
		JSONObject libroJSON = new JSONObject();
		JSONObject respuesta = new JSONObject();
		
		libroJSON.put("isbn", libro.getIsbn());
		libroJSON.put("titulo", libro.getTitulo());
		libroJSON.put("paginas", libro.getPaginas());
		
		respuesta.put("libro",libroJSON);
		
		return Response.status(200).entity(respuesta.toString()).build();

		
	}
	
	
	@GET
	@Path("/{isbn}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscar(@PathParam("isbn") String isbn){
		
		if(biblioteca.containsKey(isbn)) {
			
			Libro libro = biblioteca.get(isbn);
			
			JSONObject respuesta = new	JSONObject();
			
			JSONObject JSONlibro = new JSONObject();
			
			JSONlibro.put("isbn", libro.getIsbn());
			JSONlibro.put("titulo", libro.getTitulo());
			JSONlibro.put("paginas", libro.getPaginas());
			
			respuesta.put("libro", JSONlibro);
			
			return Response.status(200).entity(respuesta.toString()).build();
			
		}else {
			return Response.status(404).build();
		}
		
	}
	
	
	
}
