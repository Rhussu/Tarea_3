package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelBilletera extends JPanel implements FrameSize {
    public PanelBilletera() {
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Variables de ajuste
        int distanciaAlBordeIzquierdo = 25;

        // Poligono semitransparente
        g.setColor(new Color(130,130,130,100));
        int[] xp = {0,200,150,0};
        int[] yp = {0,0,80,80};
        g.fillPolygon(xp,yp,4);
        g.setColor(new Color(180,180,180,100));
        g.fillRect(0,80,150,frameHeight(-80));

        // Agregador de imagenes
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
                if(i == 0) {
                    g.drawImage(image[i],distanciaAlBordeIzquierdo,frameHeight(),null);
                } else {
                    g.drawImage(image[i], distanciaAlBordeIzquierdo, frameHeight(i / 6.2, -30), null);
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar las imágenes de las monedas.");

            // Pintado de representacion de emergencia
            g.setColor(new Color(180,120,120));
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Dinero",distanciaAlBordeIzquierdo,50);
            for(int i = 1; i < 5; i++) {
                g.fillOval(distanciaAlBordeIzquierdo,frameHeight(i/6.2,-30),100,100);
            }
            g.setFont(new Font("Arial", Font.PLAIN, 80));
            g.drawString("?",distanciaAlBordeIzquierdo,frameHeight(-100));
        }
    }
}
