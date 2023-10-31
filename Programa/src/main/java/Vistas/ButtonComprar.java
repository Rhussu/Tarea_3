package Vistas;

import Modelos.NoHayProductoException;
import Modelos.PagoIncorrectoException;
import Modelos.PagoInsuficienteException;
import Modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Esta clase es para seleccionar un tipo de producto que se desea comprar.
 */
public class ButtonComprar extends JButton {
    public static TipoProducto tipoProducto = null;

    /**
     * Consturctor personalizado, se le dan características al botón.
     */
    public ButtonComprar() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(304,240,80,50);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                if(ButtonMiProducto.vacio) try {

                    PanelComprador.getComprador().comprarProducto(PanelIngresoMon.getMonPago(), tipoProducto,PanelExpendedor.getExpendedor());
                    if(ButtonMiProducto.vacio) {
                        ButtonMiProducto.vacio = false;
                        Ventana.frame().repaint();
                    }

                } catch (Exception ex) {
                    System.err.println(ex);
                } finally {
                    PanelIngresoMon.setMonPago(null);
                    tipoProducto = null;

                    Ventana.frame().repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("BuyPress.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("BuyPress.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }
}
