
package ejercicio4;


public class Zapato {
    
    private String marca;
    private int talla;

    public Zapato(String marca, int talla) {
        this.marca = marca;
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Zapato{" + "marca=" + marca + ", talla=" + talla + '}';
    }
    
   
}
