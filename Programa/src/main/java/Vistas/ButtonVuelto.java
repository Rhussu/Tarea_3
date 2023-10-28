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
}
