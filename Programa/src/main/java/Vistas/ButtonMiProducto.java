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
                System.out.println("hola");
                if(PanelComprador.getComprador().queConsumiste() == null){
                    System.out.println("el producto es null");
                }
                switch(PanelComprador.getComprador().verProducto().consumir()) {
                    case "cocacola":
                        System.out.printf("Cocacola");
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniCoca.png"))).getImage(), 5, 19, null);
                        break;
                    case "sprite":
                        System.out.printf("Sprite");
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSprite.png"))).getImage(), 5, 19, null);
                        break;
                    case "fanta":
                        System.out.printf("Fanta");
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniFanta.png"))).getImage(), 5, 19, null);
                        break;
                    case "super8":
                        System.out.printf("Super8");
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSuper8.png"))).getImage(), 5, 1, null);
                        break;
                    case "snickers":
                        System.out.printf("Snicker");
                        g.drawImage((new ImageIcon(getClass().getClassLoader().getResource("MiniSnicker.png"))).getImage(), 5, 15, null);
                        break;
                    default:
                        System.out.println("Awa");
                }
            }
        }catch (Exception e){
            System.err.println(e);
        }
        super.paintComponent(g);
    }
}