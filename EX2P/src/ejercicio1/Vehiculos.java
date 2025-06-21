

package ejercicio1;

import java.util.Objects;

/**
 * a)Implemente el código de la estructura de clases necesaria para el desarrollo de la aplicación. 
 * Se deben crear los métodos get y set que sean necesarios.
 */

public abstract class Vehiculos {
    
        private String marca;
        private String matricula;
        private float velocidadMaxima;

    public Vehiculos(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculos(String marca, String matricula, float velocidadMaxima) {
        this.marca = marca;
        this.matricula = matricula;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
  
   
    
    
    public abstract void acelerar (float velocidadAceleracion) throws DemasiadoRapidoException;
    public abstract void frenar(float velocidadDesaceleracion);

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

 /**
 * b)Implemente un método heredado de la clase Object que compare dos vehículos. 
 * Se considera que dos vehículos son iguales si tienen la misma matrícula. En otro caso, son diferentes.
 */    
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        
        if (!(obj instanceof Vehiculos)) {
            return false;
         }
        
        final Vehiculos other = (Vehiculos) obj;
        return Objects.equals(this.matricula, other.matricula);
    }    
}
