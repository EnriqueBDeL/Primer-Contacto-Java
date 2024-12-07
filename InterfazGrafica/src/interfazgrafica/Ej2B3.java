
package interfazgrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ej2B3 extends JFrame {

public Ej2B3(){   
    
    super ("Ej2B3"); //Creamos el marco
    JPanel jp = new JPanel(); //Creamos el lienzo (panel)
    setContentPane(jp); //Ponemos el lienzo en el marco
    setSize(300,200); //Establecemos el tamaño del marco
    setLocationRelativeTo(null); //Centramos la ventana en la pantalla
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al cerrar la ventana, se cierra completamente.
   
    
    setLayout(new BorderLayout());
    
   
    JPasswordField campoTexto = new JPasswordField(10);
    jp.add(campoTexto,BorderLayout.PAGE_START );
    
    JTextArea areaTexto = new JTextArea();
    jp.add(areaTexto,BorderLayout.CENTER );
   
   //----------------------------------------------------
    
    JPanel jp2 = new JPanel(new FlowLayout() ); //Creamos el lienzo (panel
    jp2.setBackground(Color.red);
    jp.add(jp2, BorderLayout.PAGE_END);

    JButton btn1 = new JButton("Aceptar");
       jp2.add(btn1);
       
       
       JTextField ct = new JTextField("Escribe algo...");
       jp2.add(ct);
       
         setVisible(true); //Hacemos visible la ventana (siempre se pone esto lo ultimo)
}
//------------------------------------------------------------
    public static void main(String[] args) {
        
        Ej2B3 aplicacion = new Ej2B3();
        
    }
    
}
