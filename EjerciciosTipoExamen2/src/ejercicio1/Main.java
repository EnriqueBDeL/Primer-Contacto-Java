
package ejercicio1;


public class Main {

   
    public static void main(String[] args) {

        MuestraSangre ms1 = new MuestraSangre(GrupoSanguineo.AB, Tipo.tejido, 0, true);
        
        MuestraOrina mo1 = new MuestraOrina(true, Tipo.tejido, 0.9, true);
        
        MuestraTejido mt1 = new MuestraTejido("pies", Tipo.tejido, 0, true);
        
        Almacen almacenaje = new Almacen();
        
        almacenaje.almacenar(ms1);
        almacenaje.almacenar(mo1);
        almacenaje.almacenar(mt1);
        
        ms1.procesar();
        mo1.procesar();
        mt1.procesar();
        
        
           try {
               
            ms1.analizar(1.2);   
            mo1.analizar(1.0);
            mt1.analizar(0.5);
            
        } catch (RiesgoExcesivoException e) {
            
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
