package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    @Override
    public void paint(Graphics g) {

        Dimension tamañoExpendedor = new Dimension(500,626);

        super.paint(g);
        g.setColor(Color.DARK_GRAY);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("expendedor.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image, (int) ((frameX() - tamañoExpendedor.getWidth()) / 2), (int) ((frameY() - tamañoExpendedor.getHeight()) / 2),null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor.");
            g.fillRect((int) ((frameX() - tamañoExpendedor.getWidth()) / 2),(int) ((frameY() - tamañoExpendedor.getHeight()) / 2),500,625);
        }
    }

    private int frameY() {
        return (int) ((Ventana.frame().windowSize().getHeight()));
    }
    private int frameX() {
        return (int) ((Ventana.frame().windowSize().getWidth()));
    }
}
