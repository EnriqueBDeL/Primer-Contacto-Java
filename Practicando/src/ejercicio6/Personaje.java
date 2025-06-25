
package ejercicio6;

enum Bando{
   JEDI,SITH,REBELDE,IMPERIO;
}

public class Personaje {
    
    private String nombre;
    private Bando bando;

    public Personaje(String nombre, Bando bando) {
        this.nombre = nombre;
        this.bando = bando;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Bando getBando() {
        return bando;
    }

    public void setBando(Bando bando) {
        this.bando = bando;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", bando=" + bando + '}';
    }

    
    
    
    
}
