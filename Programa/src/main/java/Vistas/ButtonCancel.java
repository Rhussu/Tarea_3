package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que genera un botón de "cancelar" en el expendedor, el cual al presionarlo permite cancelar la compra que se iba a realizar.
 */
public class ButtonCancel extends JButton {
    /**
     * Constructor de ButtonCancel, configura los parámetros iniciales para que se muestren en pantalla.
     */
    public ButtonCancel() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(303,310,84,40);
        addMouseListener(new MouseListener() {

            /**
             * Evento ejecutado al cliquear el botón. No se realiza implementación, pues no es requerido.
             * @param e evento a ser procesado
             */
            @Override
            public void mouseClicked(MouseEvent e) {}

            /**
             * Evento ejecutado al presionar el botón. Genera una compra con un producto nulo para que se almacene la moneda en el almacén de vuelto.
             * @param e evento a ser procesado
             */
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

            /**
             * Evento ejecutado al soltar el botón. Muestra una imagen del botón presionado para generar el efecto de activación.
             * @param e evento a ser procesado
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("CancelPress.png")));
            }

            /**
             * Evento ejecutado al entrar el botón. Muestra una imagen del botón presionado para generar el efecto de activación.
             * @param e evento a ser procesado
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                setIcon(new ImageIcon(getClass().getClassLoader().getResource("CancelPress.png")));
            }

            /**
             * Evento ejecutado al salir del botón. Muestra
             * @param e evento a ser procesado
             */
            @Override
            public void mouseExited(MouseEvent e) {
                setIcon(null);
            }
        });
    }
}
