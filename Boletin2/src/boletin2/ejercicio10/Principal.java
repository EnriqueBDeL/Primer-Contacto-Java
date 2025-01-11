
package boletin2.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Principal {

   public static void main(String[] args) {
        List<ProductoFinanciero> productos = new ArrayList<>();

        // Crear cuentas
        productos.add(new Cuenta("Juan Pérez", 5000, 3.0, EstadoCuenta.OPERATIVA));
        productos.add(new Cuenta("Ana Gómez", 2000, 4.5, EstadoCuenta.EN_NUMEROS_ROJOS));
        productos.add(new Cuenta("Luis Martín", 1500, 2.5, EstadoCuenta.OPERATIVA));
        productos.add(new Cuenta("Carlos Rodríguez", 7000, 3.5, EstadoCuenta.INMOVILIZADA));
        productos.add(new Cuenta("Marta Fernández", 6000, 5.0, EstadoCuenta.OPERATIVA));

        // Crear depósitos
        productos.add(new Deposito("Jorge Sánchez", 10000, 2.5, 365));
        productos.add(new Deposito("Lucía García", 5000, 3.0, 180));
        productos.add(new Deposito("Pedro Martínez", 12000, 4.0, 365));
        productos.add(new Deposito("Sofía Pérez", 15000, 2.8, 240));
        productos.add(new Deposito("Ricardo López", 8000, 3.2, 300));

        // Crear depósitos estructurados
        productos.add(new DepositoEstructurado("David Díaz", 5000, 2000, 3.5, 4.0, 180));
        productos.add(new DepositoEstructurado("Eva Gómez", 10000, 3000, 2.5, 3.5, 365));
        productos.add(new DepositoEstructurado("Antonio Ruiz", 7000, 1000, 3.0, 3.0, 240));
        productos.add(new DepositoEstructurado("Isabel Martínez", 15000, 5000, 2.0, 3.2, 180));
        productos.add(new DepositoEstructurado("Raúl Sánchez", 8000, 2500, 4.0, 4.5, 365));

        // Imprimir información de productos
        for (ProductoFinanciero producto : productos) {
            System.out.println("Titular: " + producto.getTitular());
            System.out.println("Impuestos: " + producto.calcularImpuestos());

            // Si el producto es amortizable, amortizamos con una cantidad arbitraria
            if (producto instanceof Amortizable) {
                Amortizable amortizable = (Amortizable) producto;
                amortizable.amortizar(1000); // Amortizamos 1000
            }
            System.out.println();
        }
    }
}