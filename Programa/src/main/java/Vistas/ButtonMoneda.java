package Vistas;

import Modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que es utilizada como botón para ingresar las monedas al expendedor.
 */
public class ButtonMoneda extends JButton {
    private Moneda m;
    private int precio;

    /**
     * Constructor personalizado en el que se le dan características al botón.
     *
     * @param precio El valor de la moneda que va a representar.
     */
    public ButtonMoneda(int precio) {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        this.precio = precio;
        switch (precio) {
            case 100:
                m = new Moneda100();
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("Cien.png")));
                break;
            case 500:
                m = new Moneda500();
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("Quinientos.png")));
                break;
            case 1000:
                m = new Moneda1000();
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("Mil.png")));
                break;
            case 1500:
                m = new Moneda1500();
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("MilQuinientos.png")));
                break;
        }
        setToolTipText(String.valueOf(m.getSerie()));
        addMouseListener(new MouseListener() {
            /**
             * Evento ejecutado al cliquear al botón. No se realiza implementación, pues no es requerido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            /**
             * Evento ejecutado al presionar el botón. Permite ingresar la moneda presionada al expendedor.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                switch (precio) {
                    case 100:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Cien.png")));
                        break;
                    case 500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Quinientos.png")));
                        break;
                    case 1000:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Mil.png")));
                        break;
                    case 1500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("MilQuinientos.png")));
                        break;
                }

                if(!PanelIngresoMon.hayMoneda()) {
                    switch (precio) {
                        case 100:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m = new Moneda100();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 500:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m = new Moneda500();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 1000:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m = new Moneda1000();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 1500:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m = new Moneda1500();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                    }
                } else {
                    System.out.println("Ya hay una moneda para pagar");
                }
            }

            /**
             * Evento ejecutado al soltar el botón. Muestra una imagen de la moneda, oscurecida, para generar el efecto de que fue presionada.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                switch (precio) {
                    case 100:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressC.png")));
                        break;
                    case 500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressQuinientos.png")));
                        break;
                    case 1000:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressMil.png")));
                        break;
                    case 1500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressMilQuinientos.png")));
                        break;
                }
            }

            /**
             * Evento ejecutado al entrar el botón. Muestra una imagen de la moneda, oscurecida, para generar el efecto de que se puede presionar.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                switch (precio) {
                    case 100:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressC.png")));
                        break;
                    case 500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressQuinientos.png")));
                        break;
                    case 1000:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressMil.png")));
                        break;
                    case 1500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("PressMilQuinientos.png")));
                        break;
                }
            }

            /**
             * Evento ejecutado al salir del botón. Establece la imagen original de las monedas.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseExited(MouseEvent e) {
                switch (precio) {
                    case 100:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Cien.png")));
                        break;
                    case 500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Quinientos.png")));
                        break;
                    case 1000:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("Mil.png")));
                        break;
                    case 1500:
                        setIcon(new ImageIcon(getClass().getClassLoader().getResource("MilQuinientos.png")));
                        break;
                }
            }
        });
    }
}
