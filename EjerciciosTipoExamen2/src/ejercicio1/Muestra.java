
package ejercicio1;


enum Tipo{
    sangre,orina,tejido;
}


public abstract class Muestra implements Procesable {
    
    private String CodigoUnico;
    private Tipo tipo;
    private double nivelRiesgo;
    private boolean urgente;
    private static int contador = 1;

    public Muestra(Tipo tipo, double nivelRiesgo, boolean urgente) {
        this.CodigoUnico = generarCodigoUnico();
        this.tipo = tipo;
        this.nivelRiesgo = nivelRiesgo;
        this.urgente = urgente;
    }

    private String generarCodigoUnico() {
        return "M" + (contador++);
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(double nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getCodigoUnico() {
        return CodigoUnico;
    }

  
 
    
    
   public void analizar(double intensidad) throws RiesgoExcesivoException {
      
       if (nivelRiesgo * intensidad > 0.8) {
           
           throw new RiesgoExcesivoException("¡Riesgo excesivo al analizar la muestra: " + CodigoUnico + "!");
           
        }
       
        System.out.println("Muestra " + CodigoUnico + " analizada con éxito.");
    }
    
}
