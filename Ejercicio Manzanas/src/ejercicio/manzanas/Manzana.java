
package ejercicio.manzanas;

enum Colores{
    VERDE,ROJO,AMARILLO
}

public class Manzana {  


    
    private Colores colores;
    private float peso;
    private float precio;
    private static float precio_por_kilo = 2.34f;

    
//----------------------------------------------------------------------------------------------------------------------|    
    public Manzana(Colores colores, float peso) {
        this.colores = colores;
        this.peso = peso;
        preciokilo();
    }

 //----------------------------------------------------------------------------------------------------------------------|   
    public float preciokilo(){
      
        precio = peso * precio_por_kilo;
        
        return precio;
    }
 //----------------------------------------------------------------------------------------------------------------------|   
    public void mensaje(){
        System.out.println("Soy una manzana de color " + colores + " y el precio del kilo es " + precio + "$.");
    }
 //----------------------------------------------------------------------------------------------------------------------|
    public Manzana(Manzana duplicadaManzana) { //Constructor Duplicado
        this.colores = duplicadaManzana.colores;
        this.peso = duplicadaManzana.peso;
        preciokilo();
    } 
//----------------------------------------------------------------------------------------------------------------------|
    public Manzana duplicar() { // Explicitamente
        
        return new Manzana(this); 
    }
  //----------------------------------------------------------------------------------------------------------------------|  

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manzana other = (Manzana) obj;
        if (Float.floatToIntBits(this.peso) != Float.floatToIntBits(other.peso)) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        return this.colores == other.colores;
    }


    
//----------------------------------------------------------------------------------------------------------------------|
    public Colores getColores() {
        return colores;
    }

    public void setColores(Colores colores) {
        this.colores = colores;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static float getPeso_por_kilo() {
        return precio_por_kilo;
    }

    public static void setPeso_por_kilo(float peso_por_kilo) {
        Manzana.precio_por_kilo = peso_por_kilo;
    }
    
    
    public static float getPrecio_por_kilo() {
        return precio_por_kilo;
    }

    public static void setPrecio_por_kilo(float precio_por_kilo) {
        Manzana.precio_por_kilo = precio_por_kilo;
    }
//----------------------------------------------------------------------------------------------------------------------|
    
       
    
}
