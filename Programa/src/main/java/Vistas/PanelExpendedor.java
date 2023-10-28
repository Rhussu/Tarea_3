package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private ButtonProducto coca;
    private ButtonProducto sprite;
    private ButtonProducto fanta;
    private ButtonProducto snickers;
    private ButtonProducto super8;
    private ButtonComprar comprar;
    private ButtonReset reset;
    private ButtonCancel cancel;
    public static final int ALTO = 700;
    public static final int ANCHO = 600;
    public PanelExpendedor() {
        super();
        coca = new ButtonProducto("CocaPress");
        sprite = new ButtonProducto("SpritePress");
        fanta = new ButtonProducto("FantaPress");
        snickers = new ButtonProducto("SnikPress");
        super8 = new ButtonProducto("SuperPress");
        comprar = new ButtonComprar();
        reset = new ButtonReset();
        cancel = new ButtonCancel();
        setOpaque(false);
        setLayout(null);
        setBounds(280,12,PanelExpendedor.ANCHO,PanelExpendedor.ALTO);
        add(coca);
        add(sprite);
        add(fanta);
        add(snickers);
        add(super8);
        add(comprar);
        add(reset);
        add(cancel);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("ExpConD.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,null);
            System.out.println("Fondo expendedor cargado con exito");
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor.");
        }


    }
}
