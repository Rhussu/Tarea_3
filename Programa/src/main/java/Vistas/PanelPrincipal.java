package Vistas;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para el fondo e de la interfaz.
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador panelComprador;
    private PanelExpendedor panelExpendedor;
    
    /**
     * Constructo personalizado en el qeu se agregan los otros paneles.
     */
    public PanelPrincipal () {
        super();
        setLayout(null);
        panelComprador = new PanelComprador();
        panelExpendedor = new PanelExpendedor();
        add(panelComprador);
        add(panelExpendedor);
    }
    
    /**
     * Override del metodo paintComponent de JPanel para pintar el fondo.
     *
     * @param g Graficos a pintar.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("fondo.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image, 0, 0,null);
        } catch (Exception e) {
            System.out.println("Error al cargar el fondo.");
        }
    }
}
