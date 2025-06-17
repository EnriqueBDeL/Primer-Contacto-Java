
package ucam.poo.claseobject;

import java.util.Objects;

public class Coche implements Cloneable{
    
    private String marca;
    private String modelo;
    private String matricula;

    
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    
    
    
    
    public Coche(Coche coche) {
       this.marca = coche.marca;
       this.matricula = coche.matricula;
       this.modelo = coche.modelo;
    }
    
    
    
    
     public Coche() {
       
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

     
     
     
     
    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.marca);
        hash = 83 * hash + Objects.hashCode(this.modelo);
        hash = 83 * hash + Objects.hashCode(this.matricula);
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
        final Coche other = (Coche) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }
  
    
}
