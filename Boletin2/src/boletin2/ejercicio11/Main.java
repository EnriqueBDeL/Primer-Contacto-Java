/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2.ejercicio11;

/**
 *
 * @author enriq
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
  
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Carlos", 3000));
        empleados.add(new Empleado("Ana", 4500));
        empleados.add(new Empleado("Luis", 2800));

       
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", 5));
        clientes.add(new Cliente("María", 10));
        clientes.add(new Cliente("Pedro", 3));

      
        System.out.println("Empleados ordenados por nombre:");
        Collections.sort(empleados, new OrdenNombre());
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

     
    }
 
}
