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
            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("BolsaMon.png"));
            image = imageIcon.getImage();
            g.drawImage(image,110,540,null);
            switch(PanelComprador.getComprador().queConsumiste()) {
                case "sprite":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Sprite.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,110,140,null);
                    break;
                case "cocacola":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Coca.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,110,140,null);
                    break;
                case "fanta":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Fanta.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,110,140,null);
                    break;
                case "snickers":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Snick.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,110,140,null);
                    break;
                case "super8":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Super8.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,110,140,null);
                    break;
            }
            System.out.println("Inventario cargado con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar el Inventario");
        }
    }
}
