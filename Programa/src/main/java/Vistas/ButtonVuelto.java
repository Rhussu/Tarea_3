package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonVuelto extends JButton {
    public ButtonVuelto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(324,526,43,43);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Aqui va lo que ocurre al precionarlo
            }

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

    @Override
    public void paintComponent(Graphics g) {
        ImageIcon imageIcon;
        Image image;
        try {
            switch (PanelExpendedor.getExpendedor().verMoneda(0, true).getValor()) {
                case 100:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini100.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 1000:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1000.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 1500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                default:
                    System.out.println("Arroja casi default");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
