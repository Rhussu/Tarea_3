package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelBilletera extends JPanel {
    public PanelBilletera() {
        super();
        setOpaque(false);
        setBounds(0,0,260,Ventana.ALTO);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("FondoMonedero.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0,0,null);
            System.out.println("Monedero cargado con exito");
        } catch (Exception e) {
            System.out.println("Error el monedero");
        }
    }
}
