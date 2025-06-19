
package ucam.poo.aves;

/** 
 * a)Implementar las clases necesarias en el paquete “ucam.poo.aves” estableciendo
 * los niveles de visibilidad de los atributos de manera adecuada.
 */

public abstract class Aves {
    
     private String especie;
     private float peso;
     private float longitud;

     
     
    public Aves(String especie, float peso, float longitud) {
        this.especie = especie;
        this.peso = peso;
        this.longitud = longitud;
    }

    
    
    public String getEspecie() {
        return especie;
    }

    public float getPeso() {
        return peso;
    }

    public float getLongitud() {
        return longitud;
    }

    
    
    
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
     
   
     public abstract void volar();
     
}
