package Vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Clase que implementa visualmente una sección para recoger las monedas de vuelto tras realizar o cancelar alguna compra en el expendedor.
 */
public class ButtonVuelto extends JButton {
    /**
     * Constructor de ButtonVuelto. Establece los parámetros iniciales para visualizarlo en la interfaz gráfica.
     */
    public ButtonVuelto() {
        super();
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(0, 0, 0, 0));
        setBounds(324,526,43,43);
        addMouseListener(new MouseListener() {
            /**
             * Evento ejecutado al cliquear al botón. No se realiza implementación, pues no es requerido.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            /**
             * Evento ejecutado al presionar el botón. Permite sacar las monedas de vuelto del dispensador de monedas de vuelto.
             * @param e evento a ser procesado.
             */
            @Override
            public void mousePressed(MouseEvent e) {
                setIcon(null);
                try{
                    PanelComprador.getComprador().addVuelto(PanelExpendedor.getExpendedor().getVuelto().getValor());
                    Ventana.frame().repaint();
                }catch (Exception ex){}
            }

            /**
             * Evento ejecutado al soltar el botón.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseReleased(MouseEvent e) {
                if(PanelExpendedor.getExpendedor().verTamañoDep("monVu") !=0){
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
                }
            }

            /**
             * Evento ejecutado al entrar al botón. Muestra una imagen de la zona donde la moneda debe recibirse, generando un efecto de posible recolección de la moneda.
             * @param e evento a ser procesado.
             */
            @Override
            public void mouseEntered(MouseEvent e) {
                if(PanelExpendedor.getExpendedor().verTamañoDep("monVu") !=0){
                    setIcon(new ImageIcon(getClass().getClassLoader().getResource("SnikPress.png")));
                }
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

    /**
     * Override el método paintComponent(g) para dibujar los tipos de monedas en el dispensador según correspondan.
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        ImageIcon imageIcon;
        Image image;
        try {
            switch (PanelExpendedor.getExpendedor().verMoneda(0, true).getValor()) {
                case 100:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini100.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 1000:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1000.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                case 1500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image, 4, 4, null);
                    break;
                default:
            }
        } catch (Exception e) {}
        super.paintComponent(g);
    }
}
