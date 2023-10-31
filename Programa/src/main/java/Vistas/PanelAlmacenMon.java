package Vistas;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra la monedas con las que se han comprador productos.
 */
public class PanelAlmacenMon extends JPanel {

    /**
     * Constructor personalizado en el que se le dan características al panel.
     */
    public PanelAlmacenMon() {
        super();
        setOpaque(false);
        setBounds(50, 471, 171, 39);

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
                return new ImageIcon(getClass().getClassLoader().getResource("Lado100.png")).getImage();
            case 500:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado500.png")).getImage();
            case 1000:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado1000.png")).getImage();
            case 1500:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado1500.png")).getImage();
        }
        System.out.println("Arroja imagen nula");
        return null;
    }

    /**
     * Override del metodo paintComponent(g) para graficar las monedas que estan en el monAlmacen del expendedor.
     *
     * @param g the <code>Graphics</code> object to protect
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
            for (int i=0; i<PanelExpendedor.getExpendedor().verTamañoDep("monAlmacen"); i++){
                g.drawImage(ImagenMon(PanelExpendedor.getExpendedor().verMoneda(i,false).getValor()),1+10*i,5, null);
            }
        } catch (IndexOutOfBoundsException e){}
    }
}
