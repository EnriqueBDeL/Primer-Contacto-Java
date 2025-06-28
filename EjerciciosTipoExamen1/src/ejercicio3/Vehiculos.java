
package ejercicio3;

/**
 * Ejercicio 1.
 
    Se desea diseñar una aplicación para gestionar vehículos de transporte. Hay distintos tipos de vehículos: Coche y Bicicleta. De todos los vehículos se conoce la marca, modelo, año y velocidad máxima. Los coches deben registrar el número de puertas, y las bicicletas si son eléctricas o no. Además, todos los vehículos pueden “arrancar”, lo cual debe modelarse como un método.

    Se pide:

    a) Implementar las clases necesarias en el paquete ucam.poo.vehiculos, estableciendo los niveles de visibilidad y los atributos de manera adecuada.
    b) Definir en la clase Coche una versión sobrecargada del método arrancar(). Una que no reciba parámetros e imprima "Coche arrancando...", y otra que reciba un parámetro con el tiempo de arranque en segundos.
    c) En las clases Coche y Bicicleta, definir un constructor que reciba todos los atributos necesarios.
    d) Crear una clase genérica llamada Garaje que pueda almacenar cualquier tipo de vehículo. Debe permitir añadir un vehículo y obtener el vehículo actual.
    e) Crear una clase Main que cree un coche, lo almacene en el garaje, lo obtenga y lo haga arrancar con ambos métodos.
  */




public abstract class Vehiculos {
    
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadMaxima;

    public Vehiculos(String marca, String modelo, int ano, double velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", velocidadMaxima=" + velocidadMaxima + '}';
    }
    
    
   
    public abstract void arrancar();
    
    
    
}
