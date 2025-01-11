
package boletin2.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Cuenta extends ProductoFinanciero implements Cloneable {

    private double saldo;
    private double tipoInteres;
    private EstadoCuenta estado;
    private List<String> operaciones;

    public Cuenta(String titular, double saldo, double tipoInteres, EstadoCuenta estado) {
        super(titular);
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
        this.estado = estado;
        this.operaciones = new ArrayList<>();
    }

    @Override
    public double calcularImpuestos() {
        return saldo * 0.1; 
    }

    public boolean reintegro(double monto) {
        if (estado == EstadoCuenta.INMOVILIZADA) {
            System.out.println("Cuenta inmovilizada. No se puede realizar el reintegro.");
            return false;
        }
        if (estado == EstadoCuenta.EN_NUMEROS_ROJOS && saldo - monto < 0) {
            System.out.println("No puede realizar el reintegro, su cuenta está en números rojos.");
            return false;
        }
        if (saldo >= monto) {
            saldo -= monto;
            operaciones.add("Reintegro: " + monto);
            return true;
        } else {
            System.out.println("Saldo insuficiente para el reintegro.");
            return false;
        }
    }

    @Override
    public Cuenta clone() {
        try {
            Cuenta cuentaClonada = (Cuenta) super.clone();
            cuentaClonada.operaciones = new ArrayList<>(this.operaciones); // Copiar las operaciones
            return cuentaClonada;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}