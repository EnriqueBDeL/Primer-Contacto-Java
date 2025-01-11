package boletin2.ejercicio8;

import java.io.Serializable;

public class Coche implements Serializable {
    
   

    private String modelo;
    private String marca;
    private float precio;

    public Coche(String modelo, String marca, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" + "modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + '}';
    }
}
