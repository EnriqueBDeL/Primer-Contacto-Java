
package ejercicio1;

import java.util.LinkedList;
import java.util.List;

/**
 * Ejercicio 1:
 * 
                     Vehiculo
           (ID único, marca, modelo)
                     |
   ------------------------------------------
   |                    |                   |
Coche              Moto              Camion
- puertas          - cilindrada      - cargaMax

Se pide:

a) (0.25 puntos) Implementa todas las clases. Cada vehículo tiene un ID autocalculado, una marca y un modelo.
b) (0.25 puntos) Añade un código único para identificar cada vehículo.
c) (1 punto) Almacena los últimos 5 conductores (nombre como String) que han conducido el vehículo.
d) (1.5 puntos) Implementa un método usar() que imprima qué vehículo se está usando.
e) (1 punto) Sobrecarga el método usar(String destino) para imprimir el destino al que va el vehículo.
f) (1 punto) Crea una clase Flota, que reciba un vehículo y llame al método usar().


 * 
 */



public abstract class Vehiculo {
    
    private final int id;
    private static int contador = 0;
    private String marca;
    private String modelo;
    private List<Conductor> conductores = new LinkedList<>();

    
    public Vehiculo(String marca, String modelo) {
       
        this.marca = marca;
        this.modelo = modelo;
        this.id = contador++;
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


      public void agregarConductor(Conductor c) {
        if (conductores.size() == 5) {
            conductores.removeFirst();
        }
        conductores.addLast(c);
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public int getId() {
        return id;
    }
    
   
    
    public abstract void usar();
    
    
    public abstract void usar(String destino);
  
    
    
}
