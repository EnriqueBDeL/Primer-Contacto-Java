
package ejercicio5;


public class Instalacion extends ObraArte  {
    
    private int duracion;

    public Instalacion(int duracion, String titulo, String autor) {
        super(titulo, autor);
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Instalacion{" + "duracion=" + duracion + '}';
    }

  
     @Override
    public void ver(Visitante v) {
        guardar(v);
        System.out.println("Instalación de " + getAutor() + " vista por " + v.getNombre() + ". Duración: " + duracion + " minutos");
    }

    @Override
    public void ver(String partitura) {
        System.out.println("Instalación '" + getTitulo() + "' interpretada con: " + partitura);
    }
    
}
