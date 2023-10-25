package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelInventario extends JPanel {
    public PanelInventario() {
    }
    @Override
    public void paint(Graphics g) {

        int distanciaAlBordeDerecho = 70;

        super.paint(g);
        g.setColor(new Color(130,130,130,100));
        int[] xp = {frameY()-145,frameY(),frameY(),frameY()-95};
        int[] yp = {0,0,80,80};
        g.fillPolygon(xp,yp,4);
        g.setColor(new Color(180,180,180,100));
        g.fillRect(frameY()-95,80,150,(int) Ventana.frame().windowSize().getHeight() -80);
        ImageIcon[] imageIcon = new ImageIcon[3];
        Image[] image = new Image[3];
        try {
            imageIcon[0] = new ImageIcon(getClass().getClassLoader().getResource("inventario.png"));
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
                    g.drawImage(image[i],frameY()-distanciaAlBordeDerecho,0,null);
                } else {
                    g.drawImage(image[i], frameY() - distanciaAlBordeDerecho, frameX() * i - 130, null);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las imágenes del inventario.");
        }
    }

    private int frameX() {
        return (int) ((Ventana.frame().windowSize().getHeight())/2.6);
    }
    private int frameY() {
        return (int) ((Ventana.frame().windowSize().getWidth())-55);
    }
}
