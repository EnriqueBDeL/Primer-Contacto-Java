package interfazgrafica;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana1 {
    
    
public Ventana1(){
    
    JFrame jf = new JFrame ("Titulo 1"); //Creamos el marco
    JPanel jp = new JPanel(); //Creamos el lienzo (panel)
    
    jf.setContentPane(jp); //Ponemos el lienzo en el marco
    
    jf.setSize(300,200); //Establecemos el tamaño del marco
    
    jf.setLocationRelativeTo(null); //Centramos la ventana en la pantalla
    
    jf.setVisible(true); //Hacemos visible la ventana

}

//----------------------------------------------------------------------------|

    public static void main(String args[]){

        Ventana1 aplicacion = new Ventana1();

        }
}
