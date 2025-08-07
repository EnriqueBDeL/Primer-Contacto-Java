
package ejercicio2;


public class Main {

    
    public static void main(String[] args) {

        CentroLimpieza centro = new CentroLimpieza();

        Robot r1 = new RobotHogar("H001", 50);
        Robot r2 = new RobotOficina("O001", 20);
        Robot r3 = new RobotHospital("HS001", 15);

        centro.meter(r1);
        centro.meter(r2);
        centro.meter(r3);

        centro.limpiezaGeneral();
        
    }
    
}
