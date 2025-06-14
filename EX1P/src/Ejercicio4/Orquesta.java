
package Ejercicio4;

public class Orquesta {

    /**
     * f)Crear una clase principal, llamada Orquesta. 
     * Añada un método a la nueva clase que reciba un Instrumento como parámetro y llame al método tocar() para mostrar su nombre.
     */
    
    private void tocarInstrumento(Instrumento i){
     
        i.tocar();
        
    }
  
    public static void main(String[] args) {

    Guitarra guitarra = new Guitarra(6, "Guitarra Flamenca");
        
        guitarra.agregarMusico("Carlos");   
        guitarra.agregarMusico("Ana");

    Piano piano = new Piano(true, "Piano Steinway");
     
     piano.agregarMusico("Beethoven");

    Saxofon saxofon = new Saxofon(Tipo.TENOR, "Saxo Dorado");
       
        saxofon.agregarMusico("John");

    Orquesta orquesta = new Orquesta();
    orquesta.tocarInstrumento(guitarra);
    orquesta.tocarInstrumento(piano);
    orquesta.tocarInstrumento(saxofon);

    guitarra.tocar("Do Re Mi Fa");
    piano.tocar("Lalalalala");
    saxofon.tocar("Jazz piece");
            
    }
    
}
