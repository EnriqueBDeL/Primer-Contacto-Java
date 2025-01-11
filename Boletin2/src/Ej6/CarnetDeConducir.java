
package Ej6;


public class CarnetDeConducir implements CarnetPorPuntos, Comparable<CarnetDeConducir> {
   
    private String nombre;
    private int puntos, mesesSinInfracciones;
    
    
    public CarnetDeConducir(String nombre) {
        this.nombre=nombre;
        puntos = 12;
        mesesSinInfracciones = 0;
    }

    public CarnetDeConducir(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = 24;
        this.mesesSinInfracciones = 0;
    }
    
  
    
    
    public final String getNombre() { return nombre; }
        public final int mesesSinInfracciones(){
        return mesesSinInfracciones;
    }
        
    public final void sumarPuntos(int bonificacion) {
        puntos += bonificacion;
    }
    
    
    public final int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(CarnetDeConducir otroCarnet) {
        return Integer.compare(this.puntos, otroCarnet.puntos);
    }
    
}