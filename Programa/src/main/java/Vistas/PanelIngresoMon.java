package Vistas;

import Modelos.*;
import javax.swing.*;
import java.awt.*;

/**
 * Panel que muestra la moneda con la que se va a pagar.
 */
public class PanelIngresoMon extends JPanel {
    private static Moneda moneda = null;

    /**
     * Constructor personalizado donde se le dan características al panel.
     */
    public PanelIngresoMon(){
        super();
        setOpaque(false);
        setBounds(310,195,34,34);
    }

    /**
     * Getter de la variable moneda, pero también la elimina.
     *
     * @return La moneda con la que se va a pagar.
     */
    public static Moneda getMonPago(){
        Moneda aux = moneda;
        moneda = null;
        return aux;
    }

    public static void setMonPago(Moneda monIngresada){
        moneda=monIngresada;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon;
            Image image;
            switch(moneda.getValor()) {
                case 100:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini100.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,0,0,null);
                    break;
                case 500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,0,0,null);
                    break;
                case 1000:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1000.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,0,0,null);
                    break;
                case 1500:
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini1500.png"));
                    image = imageIcon.getImage();
                    g.drawImage(image,0,0,null);
                    break;
                default:
            }
        } catch (NullPointerException e) {}
    }

    public static boolean hayMoneda(){
        if(moneda==null){
            return false;
        }
        else{
            return true;
        }
    }
}
