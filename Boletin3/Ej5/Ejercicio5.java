package Ej5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

public class Ejercicio5 extends JFrame {

    private JTextArea textArea;

    public Ejercicio5() {
        setTitle("Ventana productos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        Producto producto1 = new Producto("Agua", 1.20);
        Producto producto2 = new Producto("Coca-Cola", 2.60);
        Producto producto3 = new Producto("Fanta", 1.45);

        JComboBox<Producto> comboBox = new JComboBox<>();
        comboBox.addItem(producto1);
        comboBox.addItem(producto2);
        comboBox.addItem(producto3);

        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto seleccionado = (Producto) comboBox.getSelectedItem();
                textArea.setText("Producto: " + seleccionado.getNombre() + "\nPrecio: $" + seleccionado.getPrecio());
            }
        });

        panel.add(comboBox, BorderLayout.NORTH);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio5();
    }
}
