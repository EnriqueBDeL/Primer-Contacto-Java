package edu.ucam.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import org.json.JSONObject;
import org.json.JSONArray; 

import jakarta.ws.rs.core.Response;
import edu.ucam.objetos.Coche;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/coches")
public class ControlCoches {

	public static Hashtable<String,Coche> parking = new Hashtable<String,Coche>();
    
    
    @POST 
    @Produces(MediaType.APPLICATION_JSON) 
    @Consumes(MediaType.APPLICATION_JSON) 
    public Response alta(InputStream inputStream) { 
        BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        String linea = "";
        
        try {
            while((linea = bReader.readLine()) != null) { 
                sb.append(linea); 
            }
        } catch (IOException e) {
            return Response.status(500).build();
        }
        
        JSONObject jsonRecibido = new JSONObject(sb.toString()); 
        String matriculaRecibida = jsonRecibido.getString("matricula");

        if(parking.containsKey(matriculaRecibida)) {
            return Response.status(409).entity(false).build(); 
        } 

        Coche coche = new Coche();
        coche.setMatricula(matriculaRecibida);
        coche.setModelo(jsonRecibido.getString("modelo"));
        coche.setPrecio(jsonRecibido.getDouble("precio"));        
        parking.put(coche.getMatricula(), coche);
        
        JSONObject respuestaJSON = new JSONObject();
        JSONObject cocheJSON = new JSONObject();
        cocheJSON.put("matricula", coche.getMatricula());
        cocheJSON.put("modelo", coche.getModelo());
        cocheJSON.put("precio", coche.getPrecio());
        respuestaJSON.put("coche", cocheJSON);
        
        return Response.status(200).entity(respuestaJSON.toString()).build();
    }
    
    
    
    @GET 
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON) 
    
    public Response listado() { 
    	
        JSONObject respuestaCoches = new JSONObject(); 
        
        for(Coche coche : parking.values()) {
            JSONObject cocheJSON = new JSONObject();
            cocheJSON.put("matricula", coche.getMatricula());
            cocheJSON.put("modelo", coche.getModelo());
            cocheJSON.put("precio", coche.getPrecio());
            
            respuestaCoches.append("coches", cocheJSON); 
        }
        
        return Response.status(200).entity(respuestaCoches.toString()).build();
    }
    
    
    
    @DELETE
    @Path("/{matricula}")
    public Response borraCoche(@PathParam("matricula") String matricula) {
        if(parking.containsKey(matricula)) {
            parking.remove(matricula);
            return Response.status(200).entity(true).build();
        }
        return Response.status(404).entity(false).build();
    }
    
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response modificar(InputStream inputStream) {
		
    	BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
    	StringBuilder sb = new StringBuilder();
    	String linea = "";
    	
    	try {
    		while((linea = br.readLine()) != null){
    			sb.append(linea);
    		}
    	}catch(IOException e) {
    		return Response.status(500).build();
    	}
    	
    	JSONObject jsonRecibido = new JSONObject(sb.toString());
    	String matriculaRecibida = jsonRecibido.getString("matricula");
    
    	Coche coche = parking.get(matriculaRecibida);
    	
    	coche.setModelo(jsonRecibido.getString("modelo"));
        coche.setPrecio(jsonRecibido.getDouble("precio"));
        parking.put(coche.getMatricula(), coche);
        
        
        JSONObject respuestaJSON = new JSONObject();
        JSONObject cocheJSON = new JSONObject();
        cocheJSON.put("matricula", coche.getMatricula());
        cocheJSON.put("modelo", coche.getModelo());
        cocheJSON.put("precio", coche.getPrecio());
        respuestaJSON.put("coche", cocheJSON);
        
        return Response.status(200).entity(respuestaJSON.toString()).build();
    	
    }
    
    
}
