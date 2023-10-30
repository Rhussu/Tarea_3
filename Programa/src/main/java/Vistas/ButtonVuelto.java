package Vistas;

import Modelos.Moneda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonVuelto extends JButton {
    public static boolean hayvuelto = false;
    public static Moneda monedaVuelto;

    public ButtonVuelto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(324,526,43,43);

        addMouseListener(new MouseListener() {
            //TRABAJANDO AQUIIIIIIIIIIIIIIIIIIIIIIIIIII
            @Override
            public void mouseClicked(MouseEvent e) {
                hayvuelto=false;
                repaint();
            }
            //WAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }

    public static void setHayvuelto(boolean estado){
        hayvuelto=estado;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon;
            Image image;
            if (hayvuelto) {
                switch (monedaVuelto.getValor()) {
                    case 100:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini100.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image, 0, 0, null);
                        break;
                    case 500:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini500.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image, 0, 0, null);
                        break;
                    case 1000:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1000.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image, 0, 0, null);
                        break;
                    case 1500:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1500.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image, 0, 0, null);
                        break;
                    default:
                        System.out.println("No hay vuelto");
                }
            }
        }catch(NullPointerException e){
            System.out.println("Error en paintcomp de ButtonVuelto");
        }

    }
}
