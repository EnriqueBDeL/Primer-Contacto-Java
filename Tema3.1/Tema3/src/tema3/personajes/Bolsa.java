/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3.personajes;

/**
 *
 * @author 48491898
 * @modificacion EnriqueBDL
 * 
 */
public class Bolsa {
    private float cantidad;
    
    
    // Si no declaro un constructor, java creará  "public Bolsa(){}".
    
    public Bolsa(float cantidad, int tipo, String nombre){}
    
    
    public float getCantidad() { 
        return cantidad; 
    }
    
    public void setCantidad(float cantidad) { 
        this.cantidad = cantidad; 
    }
}
