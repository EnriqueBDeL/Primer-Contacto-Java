package Ej6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio6 extends JFrame {

    public Ejercicio6() {
        setTitle("Ventana Principal");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(1, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(250, 30));

        JButton botonAceptar = new JButton("Aceptar");

        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textArea.getText();
                abrirVentanaSecundaria(texto);
            }
        });

        panel.add(scrollPane);
        panel.add(botonAceptar);

        add(panel);
        setVisible(true);
    }

    private void abrirVentanaSecundaria(String texto) {
        JFrame ventanaSecundaria = new JFrame("Ventana Secundaria");
        ventanaSecundaria.setSize(400, 300);
        ventanaSecundaria.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ventanaSecundaria.setLocationRelativeTo(this);

        JTextArea textArea = new JTextArea();
        textArea.setText(texto);
        textArea.setEditable(false);
        ventanaSecundaria.add(new JScrollPane(textArea), BorderLayout.CENTER);

        ventanaSecundaria.setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio6();
    }
}
