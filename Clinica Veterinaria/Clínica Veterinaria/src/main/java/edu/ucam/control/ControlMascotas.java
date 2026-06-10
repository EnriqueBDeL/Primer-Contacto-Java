package edu.ucam.control;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Hashtable;

import org.json.JSONObject;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import edu.ucam.objetos.Mascota;

@Path("/mascotas")
public class ControlMascotas {

    public static Hashtable<String, Mascota> clinica = new Hashtable<String, Mascota>();

    // CREAR MASCOTA
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registrar(InputStream inputStream) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            String linea;
            while((linea = br.readLine()) != null) { sb.append(linea); }
            
            JSONObject json = new JSONObject(sb.toString());
            String chip = json.getString("chip");
            
            if(clinica.containsKey(chip)) return Response.status(409).build();
            if(json.getDouble("peso") < 0) return Response.status(400).build();
            
            Mascota m = new Mascota();
            m.setChip(chip);
            m.setNombre(json.getString("nombre"));
            m.setEspecie(json.getString("especie"));
            m.setPeso(json.getDouble("peso"));
            
            clinica.put(chip, m);
            
            JSONObject respuesta = new JSONObject();
            JSONObject mascotaJSON = new JSONObject();
            mascotaJSON.put("chip", m.getChip());
            mascotaJSON.put("nombre", m.getNombre());
            mascotaJSON.put("especie", m.getEspecie());
            mascotaJSON.put("peso", m.getPeso());
            respuesta.put("mascota", mascotaJSON);
            
            return Response.status(200).entity(respuesta.toString()).build();
        } catch(Exception e) {
            return Response.status(500).build();
        }
    }

    // LISTAR MASCOTAS
    @GET
    @Path("/listado")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listar() {
        JSONObject respuesta = new JSONObject();
        for(Mascota m : clinica.values()) {
            JSONObject mascotaJSON = new JSONObject();
            mascotaJSON.put("chip", m.getChip());
            mascotaJSON.put("nombre", m.getNombre());
            mascotaJSON.put("especie", m.getEspecie());
            mascotaJSON.put("peso", m.getPeso());
            respuesta.append("mascotas", mascotaJSON);
        }
        return Response.status(200).entity(respuesta.toString()).build();
    }

    // BORRAR MASCOTA
    @DELETE
    @Path("/{chip}")
    public Response borrar(@PathParam("chip") String chip) {
        if(clinica.containsKey(chip)) {
            clinica.remove(chip);
            return Response.status(200).entity("{}").build();
        }
        return Response.status(404).build();
    }
}