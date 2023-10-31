package Vistas;

import Modelos.*;
import javax.swing.*;
import java.awt.*;

public class PanelIngresoMon extends JPanel {
    private static Moneda moneda = null;
    private static boolean hayMoneda = false;

    public PanelIngresoMon(){
        super();
        setOpaque(false);
        setBounds(310,195,34,34);
    }

    public static Moneda getMonPago(){
        Moneda aux = moneda;
        moneda = null;
        return aux;
    }

    public static int getPrecioMoneda(){
        return moneda.getValor();
    }

    public static void setHayMoneda(boolean estado){
        hayMoneda=estado;
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
