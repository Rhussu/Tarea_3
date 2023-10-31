package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelBilletera extends JPanel {
    private ButtonMoneda moneda100;
    private ButtonMoneda moneda500;
    private ButtonMoneda moneda1000;
    private ButtonMoneda moneda1500;
    public PanelBilletera() {
        super();
        moneda100 = new ButtonMoneda(100);
        moneda500 = new ButtonMoneda(500);
        moneda1000 = new ButtonMoneda(1000);
        moneda1500 = new ButtonMoneda(1500);

        moneda1500.setBounds(18,140,127,127);
        moneda1000.setBounds(18,290,127,127);
        moneda500.setBounds(18,440,127,127);
        moneda100.setBounds(18,590,127,127);

        setOpaque(false);
        setLayout(null);
        setBounds(0,0,260,Ventana.ALTO);

        add(moneda100);
        add(moneda500);
        add(moneda1000);
        add(moneda1500);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("FondoMonedero.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0,0,null);
        } catch (Exception e) {
            System.out.println("Error al dibujar el monedero");
        }
    }
}
