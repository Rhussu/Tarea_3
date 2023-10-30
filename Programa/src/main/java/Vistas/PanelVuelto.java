/**package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelVuelto extends JPanel {
    public static boolean hayvuelto = false;
    public PanelVuelto() {
        super();
        setOpaque(false);
        setBounds(324,526,34,34);
    }

    public static void setHayvuelto(boolean estado){
        hayvuelto=estado;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon;
            Image image;
            if (hayvuelto) {
                switch (PanelIngresoMon.getMonPago().getValor()){
                    case 100:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Mini500.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image,0,0,null);
                        break;
                }
            }
            else{
                System.out.println("No hay vuelto");
            }

        } catch (NullPointerException a){
            System.out.println("No se ha recibido moneda");
        } catch (Exception e) {
            System.out.println("Problema con generación de panelVuelto");
        }
    }
}*/
