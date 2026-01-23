package preguntaDesarrollo;

// CORREGIDO: Importar java.sql.Timestamp, NO java.security
import java.sql.Timestamp;

public class Empleado {
    
    private String id;
    private String nombre;
    private Timestamp horaEntrada; 
    private float horasAcumuladas; 
    
    public Empleado(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.horaEntrada = null; 
        this.horasAcumuladas = 0;
    }

    public String getId() { return id; }
    
    public String getNombre() { return nombre; }
    
    public Timestamp getHoraEntrada() { return horaEntrada; }
    
    public void setHoraEntrada(Timestamp ahora) { this.horaEntrada = ahora; }
    
    public float getHorasAcumuladas() { return horasAcumuladas; }
    
    public void sumarHoras(float horas) { this.horasAcumuladas += horas; }
}