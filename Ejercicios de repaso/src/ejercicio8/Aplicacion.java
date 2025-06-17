
package ejercicio8;

import java.util.ArrayList;
import java.util.List;



public class Aplicacion {
    
     private String nombreApp = "UCAM";
    private double version = 1.0;
    private String fechaLanzamiento = "2025-06-17";

    private List<PersonalDocente> personasRegistradas = new ArrayList<>();
    
    
    
    
    
    public void iniciar() {
    
    Profesores prof1 = new Profesores(18, TipoContrato.Exclusiva, "Ana", "Martínez", "ana@ucam.edu");
    Presenciales alumno1 = new Presenciales(85.5, 1001, "Luis", "García", "luisg@ucam.edu");
    Online alumno2 = new Online("Murcia", 1002, "Marta", "Lopez", "marta@ucam.edu");
    Internacionales alumno3 = new Internacionales("Oxford University", 1003, "John", "Doe", "john@ucam.edu");

        personasRegistradas.add(prof1);
        personasRegistradas.add(alumno1);
        personasRegistradas.add(alumno2);
        personasRegistradas.add(alumno3);

        mostrarTodasLasPersonas();
    }

    public void mostrarTodasLasPersonas() {
        System.out.println("=== Personas registradas en la aplicacion " + nombreApp + " v" + version + " ===");
        for (PersonalDocente persona : personasRegistradas) {
            System.out.println(persona);
        }
    }
    
    

}
