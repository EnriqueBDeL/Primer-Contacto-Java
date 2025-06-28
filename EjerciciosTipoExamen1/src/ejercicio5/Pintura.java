
package ejercicio5;


public class Pintura extends ObraArte {
    
    private String estilo;

    public Pintura(String estilo, String titulo, String autor) {
        super(titulo, autor);
        this.estilo = estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Pintura{" + "estilo=" + estilo + '}';
    }

 
    
    @Override
    public void ver(Visitante v) {
        guardar(v);
        System.out.println("Pintura de " + getAutor() + " vista por " + v.getNombre() + ". Estilo: " + estilo);
    }

    @Override
    public void ver(String partitura) {
        System.out.println("Pintura '" + getTitulo() + "' interpretada con: " + partitura);
    }
    
}
