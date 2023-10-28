package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador panelComprador;
    private PanelExpendedor panelExpendedor;

    public PanelPrincipal () {
        super();
        setLayout(null);
        panelComprador = new PanelComprador();
        panelExpendedor = new PanelExpendedor();
        add(panelComprador);
        add(panelExpendedor);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("fondo.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image, 0, 0,null);
            System.out.println("Fondo cargado con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar el fondo.");
        }
    }
}
