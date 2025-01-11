package Ej7;

public class Producto {
    private String nombre;
    private double precio;
    private double descuento;

    public Producto(String nombre, double precio, double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getDescuento() {
        return descuento;
    }
}
