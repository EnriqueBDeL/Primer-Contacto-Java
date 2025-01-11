/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin2.ejercicio10;

/**
 *
 * @author enriq
 */
import java.util.ArrayList;
import java.util.List;

public class DepositoEstructurado extends ProductoFinanciero implements Amortizable {

    private double capitalFijo;
    private double capitalVariable;
    private double tipoInteresFijo;
    private double tipoInteresVariable;
    private int plazoDias;
    private List<String> operaciones;

    public DepositoEstructurado(String titular, double capitalFijo, double capitalVariable, double tipoInteresFijo, double tipoInteresVariable, int plazoDias) {
        super(titular);
        this.capitalFijo = capitalFijo;
        this.capitalVariable = capitalVariable;
        this.tipoInteresFijo = tipoInteresFijo;
        this.tipoInteresVariable = tipoInteresVariable;
        this.plazoDias = plazoDias;
        this.operaciones = new ArrayList<>();
    }

    @Override
    public double calcularImpuestos() {
        double interesesFijos = capitalFijo * tipoInteresFijo * plazoDias / 365;
        double interesesVariables = capitalVariable * tipoInteresVariable * plazoDias / 365;
        return (interesesFijos + interesesVariables) * 0.1; // Impuesto del 10% sobre los intereses
    }

    @Override
    public void amortizar(double monto) {
        if (monto <= capitalVariable) {
            capitalVariable -= monto;
            operaciones.add("Amortización: " + monto);
        } else {
            System.out.println("Monto de amortización mayor al capital variable disponible.");
        }
    }
}