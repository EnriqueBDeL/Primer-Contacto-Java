
package ejercicio2;


public class RobotHogar extends Robot {
   
    public RobotHogar(String id, int nivelBateria) {
        super(id, nivelBateria);
    }

   @Override
    public String getModoLimpieza() {
        return "aspirado";
    }
    
}
