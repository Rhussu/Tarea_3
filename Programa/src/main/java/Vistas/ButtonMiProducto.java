package Vistas;

import Modelos.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMiProducto extends JButton {
    public static boolean vacio = true;
    public static Producto producto;
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
                if(!vacio) {
                    producto = PanelExpendedor.getExpendedor().getProducto();
                    Ventana.frame().repaint();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(!vacio) {
                    setIcon(null);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(!vacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(!vacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(!vacio) {
                    setIcon(null);
                }
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        if(!vacio) {
            switch (producto.consumir()) {
                case "cocacola":
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniCoca.png"))).getImage(),5,5,null);
                    break;
                case "sprite":
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSprite.png"))).getImage(),5,5,null);
                    break;
                case "fanta":
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniFanta.png"))).getImage(),5,5,null);
                    break;
                case "super8":
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSuper8.png"))).getImage(),5,5,null);
                    break;
                case "snicker":
                    g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSnicker.png"))).getImage(),5,5,null);
                    break;
            }
        }
    }
}