/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

import java.util.Date;

/**
 *
 * @author enriq
 */
public class Perecedero extends Producto{
    
    protected Date fechaCaducidad;

    @Override
    public Date getFecha() {
        return fechaCaducidad;
    }
    
    
    
}
