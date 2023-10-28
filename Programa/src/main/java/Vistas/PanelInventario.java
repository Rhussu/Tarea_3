package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelInventario extends JPanel {
    public PanelInventario() {
        super();
        setOpaque(false);
        setBounds(Ventana.ANCHO - 243,0,243,Ventana.ALTO);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("FondoInventario.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0,0,null);
            System.out.println("Inventario cargado con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar el Inventario");
        }
    }
}
