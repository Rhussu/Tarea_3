package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    public static final int ALTO = 700;
    public static final int ANCHO = 600;
    public PanelExpendedor() {
        super();
        setOpaque(false);
        setBounds(280,12,PanelExpendedor.ANCHO,PanelExpendedor.ALTO);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("ExpConD.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,null);
            System.out.println("Fondo expendedor cargado con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor.");
        }
    }
}
