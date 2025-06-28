
package ejercicio2;

import java.util.LinkedList;
import java.util.List;

/**
 * Ejercicio 2:
 * 
                     Animal
              (ID único, nombre)
                        |
        --------------------------------
        |                |            |
     Perro           Gato         Pajaro
     - raza         - pelaje       - tipoVuelo
     Se pide:

    a) (0.25 puntos) Implementa todas las clases.
    b) (0.25 puntos) Añadir un identificador único autocalculado.
    c) (1 punto) Guarda los últimos 5 cuidadores que han cuidado al animal.
    d) (1.5 puntos) Método emitirSonido() que imprima algo como "Perro ladra" o "Gato maúlla".
    e) (1 punto) Sobrecarga emitirSonido(String estado) para mostrar cómo suena si está feliz, triste, etc.
    f) (1 punto) Clase Zoologico, con un método que reciba un Animal y llame a emitirSonido().
    
 */


public abstract class Animal {
    
    private final int id;
    private static int contador = 0;
    private String nombre;
    private List<Cuidador> cuidadores = new LinkedList<>();

    public Animal(String nombre) {
        this.nombre = nombre;
        this.id = contador++;
    }
    
    public void guardarCuidador(Cuidador c){
    
        if(cuidadores.size() == 5){
            
            cuidadores.remove(0);
                cuidadores.add(c);

            
        }else{
            
            cuidadores.add(c);
        }
        
    }

    public int getId() {
        return id;
    }
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Animal.contador = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cuidador> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(List<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }
    
  
    public abstract void emitirSonido();
        public abstract void emitirSonido(String estado);
    
    
}