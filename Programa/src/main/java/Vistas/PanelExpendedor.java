package Vistas;

import Modelos.*;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que contiene multiples otros paneles y representa nuestro expendedor.
 */
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
    private static ButtonMiProducto miProducto;
    private PanelIngresoMon ingresoMon;
    private PanelAlmacenVuelto almacenVuelto;
    private PanelAlmacenMon almacenMon;
    private PanelCantProductos cantProductos;

    public static final int ALTO = 700;
    public static final int ANCHO = 600;
    private static final int numProductos = 3;

    /**
     * Constructor personalizado donde se le dan características al panel y se le agregan muchos otros.
     */
    public PanelExpendedor() {
        super();
        expendedor = new Expendedor(numProductos);
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
        almacenMon = new PanelAlmacenMon();
        cantProductos = new PanelCantProductos();

        setOpaque(false);
        setLayout(null);
        setBounds(280,12,PanelExpendedor.ANCHO,PanelExpendedor.ALTO);
        add(cantProductos);
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
        add(almacenMon);
    }

    /**
     * Override de paintComponenet(g) para mostrar la imagen del expendedor.
     *
     * @param g the <code>Graphics</code> object to protect
     */
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

    /**
     * Getter de la variable expendedor.
     *
     * @return El expendedor.
     */
    public static Expendedor getExpendedor() {
        return expendedor;
    }

    /**
     * Método para reiniciar el expendedor.
     */
    public static void reinicioExp(){
        expendedor = new Expendedor(numProductos);
    }

    /**
     * Método para actualizar el número de serie que se muestra en ButtonMiProducto.
     */
    public static void actualizarTipText() {
        miProducto.setToolTipText(String.valueOf(PanelComprador.getComprador().verProducto().getSerie()));
    }
}