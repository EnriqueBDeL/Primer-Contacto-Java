/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.personajes;

import static tema3.personajes.TipoPersonaje.HEROE;
import static tema3.personajes.TipoPersonaje.MONSTRUO;

enum TipoPersonaje {
    HEROE, MONSTRUO, POLICIA, VILLANO;
}

/**
 * Representa un personaje de mi videojuego que va a vivir maravillosas aventuras.
 * 
 * @author ajbanegas@ucam.edu
 * @modificacion EnriqueBDL
 * @version 1.0
 */
public class Personaje {
    // ATRIBUTOS
    /**
     * El nombre asignado a mi personaje.
     */
    private String nombre;
    /**
     * La fuerza que tiene mi personaje para luchar contra otros.
     */
    private float fuerza;
    private float puntosVida;
    private double recompensa;
    private TipoPersonaje tipoPersonaje; // HEROE o MONSTRUO
    private Bolsa bolsa;

    
    public Personaje(){
        
      fuerza = 100.0f;
      puntosVida = 99.8f;
      recompensa = 0;
      
    }
    
    
    public Personaje(float fuerza){
        
      /* 
      
      this.fuerza = fuerza;
      this.puntosVida = 99.8f;
      this.recompensa = 0;
        
      */
      
      this(fuerza,0,99.8f);
    }
    
    
    
    public Personaje(float fuerza, double recompensa){
        
     /*
        
      this.fuerza = fuerza;
      this.puntosVida = 99.8f;
      this.recompensa = recompensa;
        
      */
     
       this(fuerza,recompensa,99.8f);
    }
    
    
    
        
    public Personaje(float fuerza, double recompensa, float puntosVida){
        
      this.fuerza = fuerza;
      this.puntosVida = puntosVida;
      this.recompensa = recompensa;

      
    }
    
    
    
    
    
    
    
    
    
    public Personaje(String nombre){
        this.nombre = nombre;
    }
    
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
    
    // METODOS
    /**
     * Mi personaje lucha contra un enemigo para vencerle.
     * @param p El enemigo contra quién va a luchar.
     * @return Verdadero si mi personaje vence, Falso en otro caso.
     */
    public boolean luchar(Personaje p) {
        if (fuerza > 0) {
            // TODO implementar la lucha
            //tipoPersonaje = "HEROE";
            //tipoPersonaje = 0;
            tipoPersonaje = MONSTRUO;
            
            return true;
        }
        return false;
    }
    
    /**
     * Compara la bolsa recién recogida con la mejor obtenida hasta ahora.
     * @param b La bolsa que acaba de conseguir.
     * @return +1 si la nueva bolsa tiene más dinero, -1 si tiene menos dinero, 0 si son iguales.
     */
    public int compararBolsa(Bolsa b) {
        if (b.getCantidad() > recompensa) {
            return 1;
        } else if (b.getCantidad() < recompensa) {
            return -1;
        }
        return 0;
    }
    
}
