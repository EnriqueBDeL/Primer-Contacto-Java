
package boletin2.ejercicio9;


public class ClienteVIP extends Cliente {
   
protected int descuento;

    public ClienteVIP(int descuento, int cif, String nombre, String apellido, String direccion) {
        super(cif, nombre, apellido, direccion);
        this.descuento = descuento;
    }



}
