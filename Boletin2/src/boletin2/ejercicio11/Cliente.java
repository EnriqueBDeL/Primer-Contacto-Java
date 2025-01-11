/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin2.ejercicio11;

/**
 *
 * @author enriq
 */
public class Cliente {
    private String nombre;
    private int antigüedad;

    public Cliente(String nombre, int antigüedad) {
        this.nombre = nombre;
        this.antigüedad = antigüedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre='" + nombre + '\'' + ", antigüedad=" + antigüedad + '}';
    }
}
