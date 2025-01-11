

package Ej4;


public class Caja<T extends Number> {
    private T contenido;

    public Caja(T contenido) {
        this.contenido = contenido;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public int obtenerParteEntera() {
        return contenido.intValue();
    }

    public void mostrarContenido() {
        System.out.println("Contenido de la caja: " + contenido);
    }

    public static void main(String[] args) {

        Caja<Integer> cajaEntera = new Caja<>(123);
        cajaEntera.mostrarContenido();
        System.out.println("Parte entera: " + cajaEntera.obtenerParteEntera());

        Caja<Double> cajaDecimal = new Caja<>(456.78);
        cajaDecimal.mostrarContenido();
        System.out.println("Parte entera: " + cajaDecimal.obtenerParteEntera());

        Caja<Float> cajaFloat = new Caja<>(789.12f);
        cajaFloat.mostrarContenido();
        System.out.println("Parte entera: " + cajaFloat.obtenerParteEntera());
    }
    
}
