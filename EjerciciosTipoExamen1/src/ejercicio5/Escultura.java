
package ejercicio5;


public class Escultura extends ObraArte {
    
    private String material;

    public Escultura(String material, String titulo, String autor) {
        super(titulo, autor);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Escultura{" + "material=" + material + '}';
    }

   
     @Override
    public void ver(Visitante v) {
        guardar(v);
        System.out.println("Escultura de " + getAutor() + " vista por " + v.getNombre() + ". Material: " + material);
    }

    @Override
    public void ver(String partitura) {
        System.out.println("Escultura '" + getTitulo() + "' interpretada con: " + partitura);
    }
    
}
