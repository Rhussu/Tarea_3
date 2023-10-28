package Vistas;

import javax.swing.JFrame;
import java.awt.*;

public class Ventana extends JFrame {
    public static final int ALTO = 800;
    public static final int ANCHO = 1000;
    private static Ventana instancia;
    private PanelPrincipal panelPrincipal;
    private Ventana(){
        panelPrincipal = new PanelPrincipal();
        add(panelPrincipal);
        setTitle("Anger's App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(1016,816));
        setSize(1016,816);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static synchronized Ventana frame() {
        if (instancia == null) {
            instancia = new Ventana();
        }
        return instancia;
    }
}