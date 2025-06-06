/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author enriq
 */
public class Caja<T> {
    
  public T elemneto;

    public Caja(T elemneto) {
        this.elemneto = elemneto;
    }

    
    public void pon(T elemneto) {
        this.elemneto = elemneto;
    }
    
    public T dame() {
        return elemneto;
    }

    
    
        
    
    
    
    
}
