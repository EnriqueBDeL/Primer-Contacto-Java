package Ej7;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class Tabla extends DefaultTableModel {
    private List<Producto> productos;
    private String[] columnas = {"Nombre", "Precio", "Descuento"};

    public Tabla(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public int getRowCount() {
        return (productos == null) ? 0 : productos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int columna) {
        return columnas[columna];
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Producto producto = productos.get(fila);
        switch (columna) {
            case 0:
                return producto.getNombre();
            case 1:
                return producto.getPrecio();
            case 2:
                return producto.getDescuento();
            default:
                return null;
        }
    }

    @Override
    public boolean isCellEditable(int fila, int columna) {
        return false;
    }
}
