
package interfazgrafica;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ej1B3 extends JFrame {
    
    
public Ej1B3(){
    
    
    super ("Titulo 3"); //Creamos el marco
    JPanel jp = new JPanel(); //Creamos el lienzo (panel)
    setContentPane(jp); //Ponemos el lienzo en el marco
    setSize(300,200); //Establecemos el tamaño del marco
    setLocationRelativeTo(null); //Centramos la ventana en la pantalla
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al cerrar la ventana, se cierra completamente.
    setVisible(true); //Hacemos visible la ventana
    
    setLayout(new BorderLayout());
    
   
    JTextField campoTexto = new JTextField();
    jp.add(campoTexto,BorderLayout.PAGE_START );
    
    JTextArea areaTexto = new JTextArea();
    jp.add(areaTexto,BorderLayout.CENTER );
    
    JButton btn1 = new JButton("Aceptar");
        
        jp.add(btn1, BorderLayout.PAGE_END);

    }  
    
    


//----------------------------------------------------------------------------|

public static void main(String args[]){
    
Ej1B3 aplicacion = new Ej1B3();

}

}
