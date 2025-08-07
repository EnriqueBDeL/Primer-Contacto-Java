
package ejercicio2;


public class RobotOficina extends Robot {
   
    public RobotOficina(String id, int nivelBateria) {
        super(id, nivelBateria);
    }

    @Override
    public String getModoLimpieza() {
        return "fregado";
    }
}
