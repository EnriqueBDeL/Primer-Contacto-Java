/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author enriq
 */
public class Manzana {
    
    public String color;
    public String textura;
    public int precio;

    public Manzana(String color, String textura, int precio) {
        this.color = color;
        this.textura = textura;
        this.precio = precio;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Manzana{" + "color=" + color + ", textura=" + textura + ", precio=" + precio + '}';
    }
    
    
}
