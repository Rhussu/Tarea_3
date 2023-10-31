package Vistas;

import Modelos.Expendedor;

import javax.swing.*;
import java.awt.*;

public class PanelExpendedor extends JPanel {
    private static Expendedor expendedor;
    private ButtonProducto coca;
    private ButtonProducto sprite;
    private ButtonProducto fanta;
    private ButtonProducto snickers;
    private ButtonProducto super8;
    private ButtonComprar comprar;
    private ButtonReset reset;
    private ButtonCancel cancel;
    private ButtonVuelto vuelto;
    private ButtonMiProducto miProducto;
    private PanelIngresoMon ingresoMon;
    private PanelAlmacenVuelto almacenVuelto;

    public static final int ALTO = 700;
    public static final int ANCHO = 600;
    public PanelExpendedor() {
        super();
        expendedor = new Expendedor(2);
        coca = new ButtonProducto("CocaPress");
        sprite = new ButtonProducto("SpritePress");
        fanta = new ButtonProducto("FantaPress");
        snickers = new ButtonProducto("SnikPress");
        super8 = new ButtonProducto("SuperPress");
        comprar = new ButtonComprar();
        reset = new ButtonReset();
        cancel = new ButtonCancel();
        vuelto = new ButtonVuelto();
        miProducto = new ButtonMiProducto();
        ingresoMon = new PanelIngresoMon();
        almacenVuelto = new PanelAlmacenVuelto();

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
        add(vuelto);
        add(miProducto);
        add(ingresoMon);
        add(almacenVuelto);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("ExpConD.png"));
            Image image = imageIcon.getImage();
            g.drawImage(image,0, 0,null);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen del expendedor.");
        }
    }

    public static Expendedor getExpendedor() {
        return expendedor;
    }
}
