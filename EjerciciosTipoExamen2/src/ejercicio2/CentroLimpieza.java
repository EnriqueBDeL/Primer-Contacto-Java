
package ejercicio2;

import java.util.HashMap;
import java.util.Map;


public class CentroLimpieza {
   
    private Map<String,Robot> almacen;

    public CentroLimpieza() {
        almacen = new HashMap<>();
    }

    
    
    public void meter(Robot robot) {
           almacen.put(robot.getId(), robot);
       }

    public void limpiezaGeneral() {
       
        for (Robot robot : almacen.values()) {
            try {
                
                robot.limpiar(30);
                
            } catch (BateriaBajaException e) {
                
                System.out.println("Error: " + e.getMessage());
                System.out.println("Recargando robot " + robot.getId());
                robot.recargar();
                
                try {
                    
                    robot.limpiar(30);
                    
                } catch (BateriaBajaException ex) {
                    
                    System.out.println("Error después de recargar: " + ex.getMessage());
                }
            }
        }
    }
}
