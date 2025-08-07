
package ejercicio2;


public class RobotHospital extends Robot {
    
    
    public RobotHospital(String id, int nivelBateria) {
        super(id, nivelBateria);
    }

    @Override
    public String getModoLimpieza() {
        return "desinfección";
    }
}
