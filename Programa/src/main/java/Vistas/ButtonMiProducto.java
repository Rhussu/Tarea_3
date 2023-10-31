package Vistas;

import Modelos.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMiProducto extends JButton {
    public static boolean vacio = true;
    public ButtonMiProducto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(430,471,55,100);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                if(!vacio) {
                    setIcon(null);
                    vacio=true;
                    PanelComprador.getComprador().consumirMiProducto();
                    Ventana.frame().repaint();
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
        try {
            if (!vacio) {
                switch(PanelComprador.getComprador().verProducto().consumir()) {
                    case "cocacola":
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniCoca.png"))).getImage(), 5, 19, null);
                        break;
                    case "sprite":
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSprite.png"))).getImage(), 5, 19, null);
                        break;
                    case "fanta":
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniFanta.png"))).getImage(), 5, 19, null);
                        break;
                    case "super8":
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSuper8.png"))).getImage(), 5, 1, null);
                        break;
                    case "snickers":
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSnicker.png"))).getImage(), 5, 15, null);
                        break;
                    default:
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        super.paintComponent(g);
    }
}