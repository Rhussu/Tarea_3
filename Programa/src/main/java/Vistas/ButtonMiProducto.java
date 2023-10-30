package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMiProducto extends JButton {
    public ButtonMiProducto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(415,435,82,130);

        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //Aqui va lo que ocurre al precionarlo
            }

            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    if(PanelExpendedor.getExpendedor().getProducto() != null) {
                        setIcon(null);
                    }
                } catch(NullPointerException f) {
                    System.out.println("Expendedor no iniciado");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    if(PanelExpendedor.getExpendedor().getProducto() != null) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                    }
                } catch(NullPointerException f) {
                    System.out.println("Expendedor no iniciado");
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                try {
                    if(PanelExpendedor.getExpendedor().getProducto() != null) {
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                    }
                } catch(NullPointerException f) {
                    System.out.println("Expendedor no iniciado");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                try {
                    if(PanelExpendedor.getExpendedor().getProducto() != null) {
                        setIcon(null);
                    }
                } catch(NullPointerException f) {
                    System.out.println("Expendedor no iniciado");
                }
            }
        });
    }
}
