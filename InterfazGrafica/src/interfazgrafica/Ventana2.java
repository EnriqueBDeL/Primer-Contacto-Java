
package interfazgrafica;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Ventana2 extends JFrame {
    
    
public Ventana2(){
    
    
    super ("Titulo 2"); //Creamos el marco
    JPanel jp = new JPanel(); //Creamos el lienzo (panel)
    setContentPane(jp); //Ponemos el lienzo en el marco
    setSize(300,200); //Establecemos el tamaño del marco
    setLocationRelativeTo(null); //Centramos la ventana en la pantalla
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al cerrar la ventana, se cierra completamente.
    setVisible(true); //Hacemos visible la ventana
    
    setLayout(new GridLayout(0, 2, 10, 5));
    
    JButton btn1 = new JButton("Boton1");
    jp.add(btn1);
    JButton btn2 = new JButton("Boton2");
    jp.add(btn2);
    JButton btn3 = new JButton("Boton3");
    jp.add(btn3);
    
    
}

//----------------------------------------------------------------------------|

public static void main(String args[]){
    
Ventana2 aplicacion = new Ventana2();

}

}

