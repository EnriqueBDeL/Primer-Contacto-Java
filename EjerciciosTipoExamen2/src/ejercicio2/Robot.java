
package ejercicio2;



public abstract class Robot {
  
    private String id;
    private int nivelBateria; 

    public Robot(String id, int nivelBateria) {
        this.id = id;
        this.nivelBateria = nivelBateria;
    }

    public String getId() {
        return id;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    protected void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }


    public void limpiar(int minutos) throws BateriaBajaException {
        int bateriaRestante = nivelBateria - minutos;
        if (bateriaRestante < 10) {
            throw new BateriaBajaException("Batería baja en robot " + id + ". Nivel actual: " + bateriaRestante + "%");
        }
        nivelBateria = bateriaRestante;
        System.out.println("Robot " + id + " limpiando (" + minutos + " min) con modo: " + getModoLimpieza());
    }


    public abstract String getModoLimpieza();

  
    public void recargar() {
        nivelBateria = 100;
        System.out.println("Robot " + id + " recargado al 100%");
    }
   
}
