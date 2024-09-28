/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.java.pkg2.personajes;

import static clase.java.pkg2.personajes.TipoPersonaje.MONSTRUO;




enum TipoPersonaje{
    
    HEROE,MONSTRUO,POLICIA,VILLANO
    
}



/**
 * REPRESENTA A MI PERSONAJE
 * @author enriquebdl
 * @version 1.1
 */
public class Personaje {
   
    /**
     * NOMBRE DE MI PERSONAJE.
     */
    // ATRIBUTOS
          private   String nombre;
          private  float fuerza;
          private  float puntosVida;
          private  double recompensa;
          private TipoPersonaje tipoPersonaje; //HEROE o MONSTRUO
          private Bolsa bolsa;
            
    // METODOS
            /**
             * ACTOS QUE LE AFECTAN AL PERSONAJE.
             * @param p comentario...
             * @return comentario...
             */
       private boolean luchar(Personaje p){
           
           if (fuerza > 0){
               //Implementar lucha
               
               
               //tipoPersonaje = "HEROE";  DA ERROR
              // tipoPersonaje = "0";   DA ERROR
               tipoPersonaje = MONSTRUO;
               
               
               return true;
           }
              return false;

       }
    
       private int compararBolsa(Bolsa b){
           
           if (b.getCantidad() > recompensa){
               
               return 1;
           }else if(b.getCantidad() < recompensa){
               return -1;
           }
           return 0;
       }
    
       //Source, Insertar codigo, getter and setter y seleccion los que quieras.
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getFuerza() {
        return fuerza;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }

    public float getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(float puntosVida) {
        this.puntosVida = puntosVida;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }
       
}
