/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin2.ejercicio11;


public class OrdenNombre implements CriterioOrdenacion<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}