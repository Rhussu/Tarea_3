package Vistas;

import javax.swing.*;
import java.awt.*;

/**
 * Panel para el fondo de la interfaz.
 */
public class PanelPrincipal extends JPanel {
    private PanelComprador panelComprador;
    private PanelExpendedor panelExpendedor;
    
    /**
     * Constructo personalizado en el que se agregan los otros paneles.
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
     * Override del método paintComponent de JPanel para pintar el fondo.
     *
     * @param g the <code>Graphics</code> object to protect
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
