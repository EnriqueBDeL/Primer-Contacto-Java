package boletin2.ejercicio2;

public class Punto {
    
    protected double x;
    protected double y;
    
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto() {
        this.x = 0;
        this.y = 0;
    }
    
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double calcularDistanciaAlOrigen() {
        return Math.sqrt((x * x) + (y * y));
    }
    
    @Override
    public String toString() {
        return "Las coordenadas del punto son (" + x + ", " + y + ")";
    }
}
