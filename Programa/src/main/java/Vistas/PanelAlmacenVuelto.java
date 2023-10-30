/**package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelAlmacenVuelto extends JPanel {
    private static int cantMon = 0;

    public PanelAlmacenVuelto() {
        super();
        setOpaque(false);
        setBounds(324, 370, 30, 15);
        cantMon += 1;
        if (cantMon == PanelExpendedor.getExpendedor().getCantMonVu()) {

        } else if (cantMon != PanelExpendedor.getExpendedor().getCantMonVu()) {

        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon;
            Image image;
            if (cantMon == PanelExpendedor.getExpendedor().getCantMonVu()) {
                switch (PanelIngresoMon.getMonPago().getValor()){
                    case 100:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Vuelto100.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image,0,0,null);
                        break;
                }
            }

            else if (cantMon != PanelExpendedor.getExpendedor().getCantMonVu()) { //Se realizó una compra que dio bastante vuelto

            }

        } catch (NullPointerException a){
            System.out.println("No se procesado ninguna compra");
        }
        catch (Exception e) {
            System.out.println("Problema con generación de Almacen");
        }
    }
}

    /**private void animacion(){
        Timer timer = new Timer(100, new ActionListener() {
            private int x = 0;
            @Override
            public void actionPerformed(ActionEvent e) {




                repaint();
                // Detiene la animación al llegar al final
                if (x > 100) {
                    ((Timer) e.getSource()).stop();
                }
                x += 1;
            }
        });

        timer.start();
    }
            */
