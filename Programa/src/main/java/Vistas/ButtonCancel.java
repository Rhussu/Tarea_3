package Vistas;

import Modelos.Moneda;
import Modelos.NoHayProductoException;
import Modelos.PagoIncorrectoException;
import Modelos.PagoInsuficienteException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonCancel extends JButton {

    public ButtonCancel() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(303,310,84,40);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(PanelIngresoMon.hayMoneda()) {
                    try {
                        ButtonVuelto.setHayvuelto(true);
                        ButtonVuelto.monedaVuelto=PanelIngresoMon.getMonPago();
                        PanelComprador.setComprador(ButtonVuelto.monedaVuelto, null);

                    } catch (NoHayProductoException | PagoIncorrectoException | PagoInsuficienteException ex) {
                        Ventana.frame().repaint();
                    }

                    Ventana.frame().repaint();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("CancelPress.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("CancelPress.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }
}
