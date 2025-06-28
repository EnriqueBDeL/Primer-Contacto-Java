
package ejercicio5;


public class Galeria {

    
    public void mostrarObra(ObraArte obra, Visitante v) {
        obra.ver(v);
    }
    
    
    public static void main(String[] args) {

          Pintura pintura1 = new Pintura("Barroco", "Luz", "L.K.");
        Visitante visitante1 = new Visitante("Clara");

        Galeria galeria = new Galeria();
        
        
        galeria.mostrarObra(pintura1, visitante1);

        
        pintura1.ver("Partitura clásica");
        
        
    }
    
}
