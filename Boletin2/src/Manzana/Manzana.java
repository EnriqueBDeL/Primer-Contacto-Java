
package Manzana;

import java.util.ArrayList;
import java.util.HashSet;

enum Colores{VERDES, ROJAS, AMARILLAS}

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

  
    public static void main(String[] args) {
    Manzana m1 = new Manzana(Colores.ROJAS, 23.34f);
        m1.mensaje();
        
        
        Manzana m2 = new Manzana(Colores.VERDES, 2.0f);
        m2.mensaje();
        
        
        
        
        System.out.println();
        
        
        
        
        Manzana m3 = new Manzana(m1);
        m3.mensaje();
        
        
        
        Manzana m4 = m1.duplicar();
        m4.mensaje();
        
        
         System.out.println();
        
         
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m2));
        
        
        
        System.out.println();
        
        
        
        
        ArrayList<Manzana> lm = new ArrayList<>();
        
        lm.add(m1);
        lm.add(m2);
        lm.add(m3);
        lm.add(m4);
        
        System.out.println("Lista:");
        for (Manzana manzana : lm) {
            manzana.mensaje();
        }
        
        
        
        System.out.println();

                
        HashSet<Manzana> setManzanas = new HashSet<>();
        
        setManzanas.add(m1);
        setManzanas.add(m2);
        setManzanas.add(m3);
        setManzanas.add(m4);
        
        
        System.out.println("Lista:");
        for (Manzana manzana : setManzanas) {
            manzana.mensaje();
        }
          
    }
    
}
