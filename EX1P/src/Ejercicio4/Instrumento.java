
package Ejercicio4;

import java.util.ArrayList;

/**
 * a)Implementar todas las clases. Tenga en cuenta que todos los instrumentos tienen un nombre. 
 * Además, las guitarras tienen un número de cuerdas, el piano puede ser de cola o no, 
 * y el saxofón debe tener un tipo que tiene que estar limitado a los valores ALTO, BAJO y TENOR.
 */

public abstract class Instrumento {
    
    protected String nombre;
    
    private static int contador = 0;
    
    private int id;

    private ArrayList<String> ultimosMusicos;
    
    
    /**
     * b)Añadir un código único autocalculado (un número entero) que sirva como identificador de todos los instrumentos. 
     * Cada vez que se cree un instrumento se le tiene que asignar dicho código.
     */
    
    public Instrumento(String nombre) {
        this.nombre = nombre;
        this.id = ++contador;
        this.ultimosMusicos = new ArrayList();
    }
    
    
    /**
     * c)Añada lo necesario para que, de cada instrumento, se almacenen los nombres de los últimos 5 músicos que lo han tocado. 
     * De cada músico solamente hay que saber el nombre.
     */
    
      public void agregarMusico(String nombreMusico) {
          
        ultimosMusicos.add(0, nombreMusico);      // Añade al principio (posición 0)


        if (ultimosMusicos.size() > 5) {     // Si hay más de 5, elimina el último

            ultimosMusicos.remove(ultimosMusicos.size() - 1);
        }
    }

      
     
    
      public void mostrarMusicos(){
         
          System.out.println("Últimos músicos que tocaron " + nombre + ":");
          
          for (String musico : ultimosMusicos) {
            System.out.println(" - " + musico);
        }
      }

    public String getNombre() {
        return nombre;
    }

    public static int getContador() {
        return contador;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getUltimosMusicos() {
        return ultimosMusicos;
    }
    
      
      
     /**
      * d)Implementar un método tocar() en la clase Instrumento que imprima el nombre del instrumento que se está tocando. 
      * Si es necesario, puede sobreescribirse el método en las clases que se considere oportunas.
      */
      
      public abstract void tocar();
      
      
      
      /**
       * e)Implementar un método tocar() (diferente al anterior) que reciba una partitura (String) y la imprima junto al nombre del instrumento. 
       * Por ejemplo: "Piano: lalalalalala".
       */
      
      public abstract void tocar (String partitura);
      
      
}
