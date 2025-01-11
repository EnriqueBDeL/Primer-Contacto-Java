package boletin2.ejercicio2;

public class Punto4D extends Punto3D {
    
    private double t;
    
    public Punto4D(double x, double y, double z, double t) {
        super(x, y, z);
        this.t = t;
    }
    
    public void setT(double t) {
        this.t = t;
    }

    @Override
    public double calcularDistanciaAlOrigen() {
        return Math.sqrt((x * x) + (y * y) + (z * z) + (t * t));
    }

    @Override
    public String toString() {
        return "Las coordenadas del punto son (" + x + ", " + y + ", " + z + ", " + t + ")";
    }
}
