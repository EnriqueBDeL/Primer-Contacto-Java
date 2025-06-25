
package ejercicio5;

enum Color{
    ROJO,VERDE,AZUL;
}

public class Fruta {
    
    private String nombre;
    private Color color;

    public Fruta(String nombre, Color color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    
    
    
    @Override
    public String toString() {
        return "Fruta{" + "nombre=" + nombre + ", color=" + color + '}';
    }
    
    
    
}
