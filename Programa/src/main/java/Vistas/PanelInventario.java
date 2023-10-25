package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelInventario extends JPanel implements FrameSize {
    public PanelInventario() {
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Variables de ajuste
        int distanciaAlBordeDerecho = 70;

        // Poligono semitransparente
        g.setColor(new Color(130,130,130,100));
        int[] xp = {frameWidth(-200),frameWidth(),frameWidth(),frameWidth(-150)};
        int[] yp = {0,0,80,80};
        g.fillPolygon(xp,yp,4);
        g.setColor(new Color(180,180,180,100));
        g.fillRect(frameWidth(-150),80,150,frameWidth(-80));

        // Agregado de imagenes
        ImageIcon[] imageIcon = new ImageIcon[3];
        Image[] image = new Image[3];
        try {
            imageIcon[0] = new ImageIcon(getClass().getClassLoader().getResource("inventario.png"));
            // Debe ser remplazado por el ajuste real
            /*switch (depositounico) {
                case COCA:
                    imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("coca.png"));
                    break;
                case SPRITE:
                    imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("sprite.png"));
                    break;
                case FANTA:
                    imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("fanta.png"));
                    break;
                case SUPER8:
                    imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("super8.png"));
                    break;
                case SNICKERS:
                    imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("snickers.png"));
                    break;
            }*/
            imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("moneda100.png"));
            imageIcon[2] = new ImageIcon(getClass().getClassLoader().getResource("moneda1000.png"));
            for(int i = 0; i < 3; i++) {
                image[i] = imageIcon[i].getImage();
                if(i == 0){
                    g.drawImage(image[i],frameWidth(-55 -distanciaAlBordeDerecho),0,null);
                } else {
                    g.drawImage(image[i], frameWidth(-55 - distanciaAlBordeDerecho), frameHeight(i/2.6,-160), null);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las imágenes del inventario.");

            // Represetación de emergencia
            g.setColor(new Color(180,120,120));
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Inventario",frameWidth(-55 - distanciaAlBordeDerecho),50);
            for(int i = 1; i < 3; i++) {
                g.fillRect(frameWidth(-55 - distanciaAlBordeDerecho), frameHeight(i/2.6,-160), 100,200);
            }
        }
    }
}
