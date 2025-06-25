
package ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *  Ejercicio 1: Frutas y precios:
 * 
    Crea una clase Fruta con atributos: tipo (usando enum), peso y precio por kilo (estático para todas las frutas).

    Método que diga: “Soy una fruta tipo X y el precio por kilo es Y”.

    Implementa dos formas de duplicar una fruta.

    Sobrescribe equals() para que dos frutas sean iguales si tienen mismo tipo y precio.

    Crea una lista y un set con varias frutas (al menos dos iguales).

    Imprime su contenido.
 */



enum Tipo{
  DULCE,AMARGA;  
}

public class Fruta {
    
    private double peso;
    private static final double precioKilo = 12.34;
    private Tipo tipo;
    
    public void info(){
        System.out.println("Soy una furta tipo " + this.tipo + " y el precio por kilo es " + precioKilo);
    }

    public Fruta(double peso, Tipo tipo) {
        this.peso = peso;
        this.tipo = tipo;
    }

    


    public Fruta(Fruta fruta) {
           this.peso = fruta.peso;
           this.tipo = fruta.tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

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
        final Fruta other = (Fruta) obj;
        return this.tipo == other.tipo;
    }

    @Override
    public String toString() {
        return "Fruta{" + "peso=" + peso + ", tipo=" + tipo + '}';
    }

 

  
    
    
    
    public static void main(String[] args) {
    
        Fruta f1 = new Fruta(22.3,Tipo.AMARGA);
        Fruta f2 = new Fruta(f1);
        
        
        List<Fruta> lista = new ArrayList<>(Arrays.asList(f1, f2));
        Set<Fruta> conjunto = new HashSet<>(lista);
        
          System.out.println("Lista:");
        for (Fruta f : lista) {
            f.info();
        }

        System.out.println("\nConjunto (sin duplicados):");
        for (Fruta f : conjunto) {
            f.info();
        }
        
        
    }
}
