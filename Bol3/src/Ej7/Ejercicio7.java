package Ej7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ejercicio7 extends JFrame {
    private JComboBox<String> seleccionCliente;
    private JTable tablaProductos;
    private Tabla modeloTabla;
    private HashMap<String, List<Producto>> datosClientes;

    public Ejercicio7() {
        setTitle("Listado de Productos y Descuentos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inicializarDatos();

        JPanel panelSuperior = new JPanel();
        panelSuperior.add(new JLabel("Seleccione un cliente: "));

        seleccionCliente = new JComboBox<>(datosClientes.keySet().toArray(new String[0]));
        seleccionCliente.addActionListener((ActionEvent e) -> {
            String clienteSeleccionado = (String) seleccionCliente.getSelectedItem();
            actualizarTabla(clienteSeleccionado);
        });
        panelSuperior.add(seleccionCliente);
        add(panelSuperior, BorderLayout.NORTH);

        modeloTabla = new Tabla(new ArrayList<>());
        tablaProductos = new JTable(modeloTabla);
        add(new JScrollPane(tablaProductos), BorderLayout.CENTER);

        if (!datosClientes.isEmpty()) {
            actualizarTabla((String) seleccionCliente.getItemAt(0));
        }

        setSize(600, 400);
        setLocationRelativeTo(null);
    }

    private void inicializarDatos() {
        datosClientes = new HashMap<>();

        List<Producto> productosCliente1 = new ArrayList<>();
        productosCliente1.add(new Producto("Producto A", 100.0, 10.0));
        productosCliente1.add(new Producto("Producto B", 200.0, 15.0));
        productosCliente1.add(new Producto("Producto C", 150.0, 5.0));

        List<Producto> productosCliente2 = new ArrayList<>();
        productosCliente2.add(new Producto("Producto D", 300.0, 20.0));
        productosCliente2.add(new Producto("Producto E", 400.0, 25.0));

        datosClientes.put("Cliente 1", productosCliente1);
        datosClientes.put("Cliente 2", productosCliente2);
    }

    private void actualizarTabla(String cliente) {
        List<Producto> productos = datosClientes.get(cliente);
        modeloTabla = new Tabla(productos);
        tablaProductos.setModel(modeloTabla);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ejercicio7().setVisible(true);
        });
    }
}
