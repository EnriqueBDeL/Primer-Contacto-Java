package boletin2.ejercicio2;

public class Punto3D extends Punto {
   
    protected double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public double calcularDistanciaAlOrigen() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    @Override
    public String toString() {
        return "Las coordenadas del punto son (" + x + ", " + y + ", " + z + ")";
    }
}
