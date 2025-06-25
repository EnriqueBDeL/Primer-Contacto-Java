
package ejercicio3;

/**
 *  Ejercicio 3
 * 
 * Crea un paquete ejercicio3. Añade una clase Libro:

    Atributos:

        titulo de tipo String.

        autor de tipo String.

        anioPublicacion de tipo int.

    Constructor estándar que inicialice todos los atributos.

    Constructor sin parámetros que inicialice con:

        titulo = "Desconocido", autor = "Anónimo", anioPublicacion = 1900
    
    Añade un método getInformacion() que devuelva un texto con todos los atributos.

    En el método main, crear un Libro con datos concretos e imprimir la información.
 */

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public Libro() {
        
        this.titulo = "Deconocido";
        this.autor = "Anonimo";
        this.anioPublicacion = 1900;
         
    }

    
    public String getInformacion() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + '}';
    }
    
   
  public static void main(String[] args) {
  
      Libro l1 = new Libro();
      
      System.out.println(l1.getInformacion());
      
      Libro l2 = new Libro("Diez Negritos","Agatha Christie",1939);
       
      System.out.println(l2.getInformacion());
      
  }
    
}
