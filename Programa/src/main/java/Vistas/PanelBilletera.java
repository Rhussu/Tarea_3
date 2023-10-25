package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelBilletera extends JPanel implements FrameSize{
    public PanelBilletera() {
    }
    @Override
    public void paint(Graphics g) {

        int distanciaAlBordeIzquierdo = 25;

        super.paint(g);
        g.setColor(new Color(130,110,110,100));
        int[] xp = {0,200,150,0};
        int[] yp = {0,0,80,80};
        g.fillPolygon(xp,yp,4);
        g.setColor(new Color(180,160,160,100));
        g.fillRect(0,80,150,frameY(-80));
        ImageIcon[] imageIcon = new ImageIcon[6];
        Image[] image = new Image[6];
        try {
            imageIcon[0] = new ImageIcon(getClass().getClassLoader().getResource("dinero.png"));
            imageIcon[1] = new ImageIcon(getClass().getClassLoader().getResource("moneda1500.png"));
            imageIcon[2] = new ImageIcon(getClass().getClassLoader().getResource("moneda1000.png"));
            imageIcon[3] = new ImageIcon(getClass().getClassLoader().getResource("moneda500.png"));
            imageIcon[4] = new ImageIcon(getClass().getClassLoader().getResource("moneda100.png"));
            imageIcon[5] = new ImageIcon(getClass().getClassLoader().getResource("ayuda.png"));
            for(int i = 0; i < 6; i++) {
                image[i] = imageIcon[i].getImage();
                g.drawImage(image[i],distanciaAlBordeIzquierdo,frameY(i/6.2,0),null);
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las imágenes de las monedas.");
        }
    }
}
