package Vistas;

import javax.swing.JFrame;
import java.awt.*;

public class Ventana extends JFrame {
    private static Ventana instancia;
    private PanelPrincipal pp;
    private Ventana(){
        pp = new PanelPrincipal();
        this.add(pp);
        this.setTitle("Anger's App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(1000,800));
        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true); 
    }

    public static synchronized Ventana frame() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }
    public Dimension windowSize() {
        return frame().getSize();
    }
}