package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que reinicia la cantidad de productos en cada depósito de la máquina expendedora.
 */
public class ButtonReset extends JButton {
    public ButtonReset() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(41,533,110,49);
        addMouseListener(new MouseListener() {
            /**
             * Evento ejecutado al cliquear el botón. No se realiza implementación, pues no es requerido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {}

            /**
             * Evento ejecutado al presionar el botón. Permite volver a restaurar los valores originales de cada depósito de productos.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                System.out.println("Expendedor reiniciado.");
                PanelExpendedor.reinicioExp();
                PanelIngresoMon.setMonPago(null);
                ButtonMiProducto.vacio = true;
                Ventana.frame().repaint();
            }

            /**
             * Evento ejecutado al soltar al botón. Muestra una imagen del botón presionado para generar el efecto de activación.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("ResetPress.png")));
            }

            /**
             * Evento ejecutado al entrar al botón. Muestra una imagen del botón presionado para generar el efecto de activación.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("ResetPress.png")));
            }

            /**
             * Evento ejecutado al salir del botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }

}
