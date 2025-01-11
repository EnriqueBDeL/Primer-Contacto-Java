package Ej1;

import javax.swing.*;
import java.awt.*;

public class Ejercicio1 extends JFrame {

    public Ejercicio1() {
        setTitle("Mi primera ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JTextArea textAreaSuperior = new JTextArea(5, 30);
        JTextArea textAreaMedio = new JTextArea(5, 30);
        JButton boton = new JButton("Aceptar");

        panel.add(new JScrollPane(textAreaSuperior), BorderLayout.NORTH);
        panel.add(new JScrollPane(textAreaMedio), BorderLayout.CENTER);
        panel.add(boton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio1();
    }
}
