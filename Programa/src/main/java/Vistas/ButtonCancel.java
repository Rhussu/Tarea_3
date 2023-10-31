package Vistas;

import javax.swing.*;
import java.awt.*;
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
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                if(PanelIngresoMon.hayMoneda()){
                    try{
                        PanelExpendedor.getExpendedor().comprarProducto(PanelIngresoMon.getMonPago(),null);
                    }catch (Exception a){
                        Ventana.frame().repaint();
                        System.out.println("repintado");
                    }finally {
                        PanelIngresoMon.setHayMoneda(false);
                        ButtonComprar.tipoProducto=null;
                    }
                }
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
