package Vistas;

import Modelos.NoHayProductoException;
import Modelos.PagoIncorrectoException;
import Modelos.PagoInsuficienteException;
import Modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonComprar extends JButton {
    public static TipoProducto tipoProducto = null;
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

                    PanelComprador.setComprador(PanelIngresoMon.getMonPago(), tipoProducto);
                    if(ButtonMiProducto.vacio) {
                        ButtonMiProducto.producto = PanelExpendedor.getExpendedor().getProducto();
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
