package Vistas;

import Modelos.TipoProducto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonProducto extends JButton {
    private TipoProducto tipo;
    public ButtonProducto(String ruta) {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        switch (ruta) {
            case "CocaPress":
                setBounds(41,184,82,130);
                tipo = TipoProducto.COCA;
                break;
            case "SpritePress":
                setBounds(123,184,82,130);
                tipo = TipoProducto.SPRITE;
                break;
            case "FantaPress":
                setBounds(205,184,77,130);
                tipo = TipoProducto.FANTA;
                break;
            case "SuperPress":
                setBounds(41,307,130,120);
                tipo = TipoProducto.SNICKERS;
                break;
            case "SnikPress":
                setBounds(164,307,120,120);
                tipo = TipoProducto.SUPER8;
                break;
        }
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
                setIcon(new ImageIcon(getClass().getClassLoader().getResource(ruta + ".png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource(ruta + ".png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }
}
