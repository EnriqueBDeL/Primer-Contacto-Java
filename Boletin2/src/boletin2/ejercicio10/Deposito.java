
package boletin2.ejercicio10;


public class Deposito extends ProductoFinanciero {

    private double capital;
    private double tipoInteres;
    private int plazoDias;

    public Deposito(String titular, double capital, double tipoInteres, int plazoDias) {
        super(titular);
        this.capital = capital;
        this.tipoInteres = tipoInteres;
        this.plazoDias = plazoDias;
    }

    @Override
    public double calcularImpuestos() {
        return (capital * tipoInteres * plazoDias / 365) * 0.1; // Impuestos sobre los intereses generados
    }
}