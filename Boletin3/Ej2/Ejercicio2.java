package Ej2;

import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {

    public Ejercicio2() {
        setTitle("Mi primera ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        JPasswordField passwordField = new JPasswordField(20);
        JTextArea textAreaMedio = new JTextArea(5, 30);
        textAreaMedio.setEditable(false);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout());

        JButton botonAceptar = new JButton("Aceptar");
        JTextField textFieldInferior = new JTextField(10);

        panelInferior.add(textFieldInferior);
        panelInferior.add(botonAceptar);

        panelPrincipal.add(passwordField, BorderLayout.NORTH);
        panelPrincipal.add(new JScrollPane(textAreaMedio), BorderLayout.CENTER);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        add(panelPrincipal);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio2();
    }
}
