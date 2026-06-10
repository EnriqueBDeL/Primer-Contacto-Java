package edu.ucam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;

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

@Path("/empleado")
public class ControlEmpleados {

	public static Hashtable<Integer,Empleado> lista = new Hashtable<Integer,Empleado>();
	
	public static int id = 1;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alta(InputStream inputStream) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
	    StringBuilder sb = new StringBuilder();
	    String linea = "";
	    
	    try {
	        while((linea = br.readLine()) != null) {
	            sb.append(linea);
	        }
	    } catch(IOException e) {
	        return Response.status(500).build();
	    }
	    
	    JSONObject recibidoJSON = new JSONObject(sb.toString());
	    
	    if (!recibidoJSON.has("dni") || !recibidoJSON.has("nombre")) {
	        return Response.status(400).build(); 
	    }
	    
	    String dni = recibidoJSON.getString("dni");
	    String nombre = recibidoJSON.getString("nombre");
	    
	    if (dni.isEmpty() || nombre.isEmpty()) {
	        return Response.status(400).build();
	    }
	    
	    for (Empleado e : lista.values()) {
	        if (e.getDni().equals(dni)) {
	            return Response.status(409).build(); 
	        }
	    }
	    
	    Empleado empleado = new Empleado(dni, nombre);
	    empleado.setId(id);
	    id++; 
	    
	    if (recibidoJSON.has("salario")) {
	        double salario = recibidoJSON.getDouble("salario");
	        if(salario < 0) {
	            return Response.status(400).build(); 
	        }
	        empleado.setSalario(salario);
	    }
	    
	    if (recibidoJSON.has("activo")) {
	        empleado.setActivo(recibidoJSON.getBoolean("activo"));
	    }
	    
	    lista.put(empleado.getId(), empleado);
	    
	    JSONObject respuestaJSON = new JSONObject();
	    JSONObject empleadoJSON = new JSONObject();
	    
	    empleadoJSON.put("id", empleado.getId());
	    empleadoJSON.put("dni", empleado.getDni());
	    empleadoJSON.put("nombre", empleado.getNombre());
	    empleadoJSON.put("salario", empleado.getSalario());
	    empleadoJSON.put("activo", empleado.isActivo());
	    
	    respuestaJSON.put("empleado", empleadoJSON);
	    
	    return Response.status(200).entity(respuestaJSON.toString()).build();
	}
	
	
	@GET
	@Path("/listar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarOrdenado() {
	    
	    JSONArray resultado = new JSONArray();
	    
	    List<Empleado> listaEmpleados = new ArrayList<>(lista.values());
	    
	    listaEmpleados.sort(Comparator.comparing(Empleado::getNombre));
	    
	    for(Empleado e : listaEmpleados) {
	        
	        JSONObject empleadoJSON = new JSONObject();
	        
	        empleadoJSON.put("id", e.getId());
	        empleadoJSON.put("dni", e.getDni());
	        empleadoJSON.put("nombre", e.getNombre());
	        empleadoJSON.put("salario", e.getSalario());
	        empleadoJSON.put("activo", e.isActivo());
	        
	        resultado.put(empleadoJSON);
	    }
	    
	    return Response.status(200).entity(resultado.toString()).build();
	}
	

	
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarID(@PathParam("id") int id) {
		
		JSONObject respuestaJSON = new JSONObject();
		
		if(lista.containsKey(id)) {
			
			JSONObject empleadoJSON = new JSONObject();

			Empleado empleado = lista.get(id);
			
			 empleadoJSON.put("id", empleado.getId());
			    empleadoJSON.put("dni", empleado.getDni());
			    empleadoJSON.put("nombre", empleado.getNombre());
			    empleadoJSON.put("salario", empleado.getSalario());
			    empleadoJSON.put("activo", empleado.isActivo());
			    
			    respuestaJSON.put("empleado", empleadoJSON);
			
			    return Response.status(200).entity(respuestaJSON.toString()).build();

		}else {
        return Response.status(404).build();
    }
	}
	
	
	@DELETE
	@Path("/{id}")
	public Response borrar(@PathParam("id") int id) {
		
		if(lista.containsKey(id)) {
			
			lista.remove(id);
			
			return Response.status(200).build();
			
		}
		
        return Response.status(404).build();

	}
	
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(InputStream inputStream) {
	    
	    BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
	    StringBuilder sb = new StringBuilder();
	    String linea = "";
	    
	    try {
	        while((linea = br.readLine()) != null) {
	            sb.append(linea);
	        }
	    } catch(IOException e) {
	        return Response.status(500).build();
	    }
	    
	    JSONObject recibidoJSON = new JSONObject(sb.toString());
	    
	    if (!recibidoJSON.has("id")) {
	        return Response.status(400).build();
	    }
	    
	    int id = recibidoJSON.getInt("id");
	    
	    if(lista.containsKey(id)) {
	        
	        Empleado empleado = lista.get(id);
	        
	        if (recibidoJSON.has("salario")) {
	            double salario = recibidoJSON.getDouble("salario");
	            if (salario < 0) {
	                return Response.status(400).build(); 
	            }
	            empleado.setSalario(salario);
	        }
	        
	        if (recibidoJSON.has("activo")) {
	            empleado.setActivo(recibidoJSON.getBoolean("activo"));
	        }
	        
	        lista.put(id, empleado);
	        
	        JSONObject respuestaJSON = new JSONObject();
	        JSONObject empleadoJSON = new JSONObject();

	        empleadoJSON.put("id", empleado.getId());
	        empleadoJSON.put("dni", empleado.getDni());
	        empleadoJSON.put("nombre", empleado.getNombre());
	        empleadoJSON.put("salario", empleado.getSalario());
	        empleadoJSON.put("activo", empleado.isActivo());
	        
	        respuestaJSON.put("empleado", empleadoJSON);
	        
	        return Response.status(200).entity(respuestaJSON.toString()).build();
	        
	    } else {
	        return Response.status(404).build();
	    }
	}
}
