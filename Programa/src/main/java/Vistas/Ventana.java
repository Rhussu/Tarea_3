package Vistas;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Ventana extends JFrame {
    public Ventana(){
        this.setLayout(new BorderLayout());//definir layout
        //Agregar componentes según layout:
        //(Inserte código)
        //Las últimas líneas deben ser:

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//activar cierre en la X
        this.setSize(1000,800); //se pueden pasar como parámetros del constructor
        this.setVisible(true); //para que se abra y sea visible
    }
}

