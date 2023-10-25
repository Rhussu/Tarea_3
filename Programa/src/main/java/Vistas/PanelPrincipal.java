package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private PanelComprador com;
    private PanelExpendedor exp;

    public PanelPrincipal () {
        exp = new PanelExpendedor();
        com = new PanelComprador();
        this.setBackground(Color.WHITE);
    }

    public void paint (Graphics g) {
        super.paint(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("fondo.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image, 0, 0,null);
        } catch (Exception e) {
            System.out.println("Error al cargar el fondo.");
        }
        com.paint(g);
        exp.paint(g);
    }
}
