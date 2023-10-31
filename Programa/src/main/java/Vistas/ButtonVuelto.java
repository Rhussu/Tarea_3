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
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                try{
                    PanelComprador.getComprador().addVuelto(PanelExpendedor.getExpendedor().getVuelto().getValor());
                    Ventana.frame().repaint();
                }catch (Exception ex){}
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(PanelExpendedor.getExpendedor().verTamañoDep("monVu") !=0){
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(PanelExpendedor.getExpendedor().verTamañoDep("monVu") !=0){
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
                }
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
            }
        } catch (Exception e) {}
        super.paintComponent(g);
    }
}
