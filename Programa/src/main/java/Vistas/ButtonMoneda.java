package Vistas;

import Modelos.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonMoneda extends JButton {
    private Moneda m;
    private int precio;

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
            /** --------------SECCION LISTA-----------------*/
            @Override
            public void mouseClicked(MouseEvent e) {
                if(!PanelIngresoMon.hayMoneda()){
                    switch (precio) {
                        case 100:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m=new Moneda100();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 500:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m=new Moneda500();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 1000:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m=new Moneda1000();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                        case 1500:
                            PanelIngresoMon.setMonPago(m);
                            Ventana.frame().repaint();
                            m=new Moneda1500();
                            setToolTipText(String.valueOf(m.getSerie()));
                            break;
                    }
                }
            }
            /** ---------------------------------------------------------*/

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
            }

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

    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource(ruta));
            Image image = imageIcon.getImage();
            g.drawImage(image,0,0,null);
            System.out.println("Moneda cargada con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar alguna moneda");
        }
    }*/
}
