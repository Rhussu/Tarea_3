package Vistas;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra la monedas de vuelto.
 */
public class PanelAlmacenVuelto extends JPanel {

    /**
     * Constructor personalizado en el que se le dan características al panel.
     */
    public PanelAlmacenVuelto() {
        super();
        setOpaque(false);
        setBounds(324, 370, 39, 137);

    }

    /**
     * Método para obtener la imagen, correspondiente a la moneda deseada, desde resources.
     *
     * @param valor El valor de la moneda de la cual se desea obtener su imagen.
     * @return La imagen el la moneda deseada.
     */
    private Image ImagenMon(int valor){
        switch (valor){
            case 100:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto100.png")).getImage();
            case 500:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto500.png")).getImage();
            case 1000:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto1000.png")).getImage();
            case 1500:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto1500.png")).getImage();
        }
        return null;
    }

    /**
     * Override del método paintComponent(g) para graficar las monedas que están en el monVu del expendedor.
     *
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{

            for (int i=1; i<PanelExpendedor.getExpendedor().verTamañoDep("monVu"); i++){
                g.drawImage(ImagenMon(PanelExpendedor.getExpendedor().verMoneda(i,true).getValor()),5,133 - (10*i), null);
            }
        } catch (IndexOutOfBoundsException e){}
    }
}
