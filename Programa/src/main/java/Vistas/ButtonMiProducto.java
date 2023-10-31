package Vistas;

import Modelos.Producto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que es utilizada como botón para extraer el producto entregado por la máquina expendedora.
 */
public class ButtonMiProducto extends JButton {
    public static boolean vacio = true;

    /**
     * Constructor personalizado donde se le dan características al botón.
     */
    public ButtonMiProducto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(430,471,55,100);
        addMouseListener(new MouseListener() {
            /**
             * Evento ejecutado al cliquear el botón. No se realiza implementación, pues no es requerido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {}

            /**
             * Evento ejecutado al presionar el botón. Permite sacar el producto del dispensador de la máquina expendedora.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                if(!vacio) {
                    setIcon(null);
                    vacio=true;
                    PanelComprador.getComprador().consumirMiProducto();
                    Ventana.frame().repaint();
                }
            }

            /**
             * Evento ejecutado al soltar el botón. Muestra una imagen de la zona del producto oscurecida para generar el efecto de recolección.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if(!vacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                }
            }

            /**
             * Evento ejecutado al entrar al botón. Muestra una imagen de la zona del producto oscurecida para generar el efecto de habilitación para recolección
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if(!vacio) {
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource(/*Porque no habia una espesifica use FantaPress*/"FantaPress.png")));
                }
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                if(!vacio) {
                    setIcon(null);
                }
            }
        });
    }

    /**
     * Override el método paintComponent(g) para dibujar cosas personalizadas.
     * @param g the <code>Graphics</code> object to protect
     */
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