

package boletin2.ejercicio10;

public abstract class ProductoFinanciero {

    private String titular;

    public ProductoFinanciero(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public abstract double calcularImpuestos();
}
