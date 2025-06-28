/**
 *  Ejercicio: Galería de Arte Interactiva 
 * 
        Se desea diseñar una aplicación para gestionar una galería de arte donde se exponen diferentes tipos de obras: Pintura, Escultura y Instalación.
        Todas las obras tienen en común un título, un autor, y un código único autocalculado (número entero incremental).

        Cada tipo de obra tiene información adicional:

        La Pintura tiene un estilo (por ejemplo, “Impresionismo”).

        La Escultura tiene un material (por ejemplo, “Mármol”, “Bronce”).

        La Instalación tiene una duración en minutos (lo que dura la experiencia de la obra).

        Se pide:
        a) 
        Implementar la jerarquía de clases necesaria en el paquete ucam.poo.galeria. Asegúrese de que la clase base ObraArte sea abstracta, tenga el código único autocalculado (static), el título y el autor, y que cada subclase tenga sus atributos específicos.

        b)
        Añadir en la clase ObraArte un mecanismo para guardar los nombres de los últimos 5 visitantes que hayan visto la obra. Use una estructura adecuada (como una lista de tamaño limitado).

        c) 
        Implementar un método abstracto ver() en la clase ObraArte que será sobrescrito en cada subclase para mostrar un mensaje personalizado. Por ejemplo:

        "Pintura de Van Gogh vista por Carla. Estilo: Impresionismo"

        "Instalación de Marina Abramović vista por Luis. Duración: 45 minutos"

        Este método deberá recibir el nombre del visitante y añadirlo a la lista de visitantes.

        d) 
        Implementar una sobrecarga del método ver(String partitura) que muestre el título de la obra acompañado de un texto descriptivo.
        Ejemplo: "Escultura 'David' interpretada con: Partitura barroca".

        e) 
        Crear una clase Galeria con un método mostrarObra(ObraArte obra) que reciba una obra y llame al método ver() con un visitante ficticio para simular la visita.
 */


package ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public abstract class ObraArte {
    
    private String titulo;
    private String autor;
    private final int id;
    private static int contador;
    
    private List<Visitante> visitantes;
            
            
    
    public ObraArte(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = contador++;
        this.visitantes = new LinkedList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        ObraArte.contador = contador;
    }

    @Override
    public String toString() {
        return "Obras{" + "titulo=" + titulo + ", autor=" + autor + ", id=" + id + '}';
    }
    
    
    
    public void guardar(Visitante v) {
        if (visitantes.size() == 5) {
            visitantes.remove(0); 
        }
        visitantes.add(v);
    }
    
    
    public abstract void ver(Visitante v);
    
    public abstract void ver(String partitura);
    
    
}
