
package Ej3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3 extends JFrame {

    private JTextField textField;
    private JTextArea textArea;

    public Ejercicio3() {
        setTitle("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        textField = new JTextField(20);
        textArea = new JTextArea(10, 30);
        textArea.setEditable(false);

        JButton botonAceptar = new JButton("Aceptar");
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textField.getText());
            }
        });

        panel.add(textField);
        panel.add(botonAceptar);
        panel.add(new JScrollPane(textArea));

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}
