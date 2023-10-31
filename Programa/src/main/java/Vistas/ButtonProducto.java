package Vistas;

import Modelos.TipoProducto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que es utilizada como botón para seleccionar el producto que se desea comprar.
 */
public class ButtonProducto extends JButton {
    private TipoProducto tipo;
    private String ruta;

    /**
     * Constructor personalizado en el que se le dan características al botón.
     *
     * @param ruta El nombre de la imagen del producto a representar.
     */
    public ButtonProducto(String ruta) {
        super();
        this.ruta = ruta;
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
                tipo = TipoProducto.SUPER8;
                break;
            case "SnikPress":
                setBounds(164,307,120,120);
                tipo = TipoProducto.SNICKERS;
                break;
        }
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                ButtonComprar.tipoProducto = tipo;
                Ventana.frame().repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    /**
     * Método para oscurecer el producto seleccionado.
     */
    private void seleccionado(){
        if(ButtonComprar.tipoProducto==tipo){
            setIcon(new ImageIcon(getClass().getClassLoader().getResource(ruta + ".png")));
        }
        else{
            setIcon(null);
        }
    }

    /**
     * Override del metodo paintComponent(g) para dibujar personalizadamente.
     *
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        seleccionado();
    }
}
