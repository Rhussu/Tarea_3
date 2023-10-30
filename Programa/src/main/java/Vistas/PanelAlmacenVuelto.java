package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelAlmacenVuelto extends JPanel {
    private static int cantMon = 0;

    public PanelAlmacenVuelto() {
        super();
        setOpaque(false);
        setBounds(324, 370, 30, 15);
        if (PanelExpendedor.getExpendedor().getCantMonVu()==1) {
            System.out.println("Prueba de inicialización de PanelAlmacenVuelto");
        }
    }

    public static void setCantMon(int cant){
        cantMon = cant;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            ImageIcon imageIcon;
            Image image;

            if(PanelExpendedor.getExpendedor().getCantMonVu()==0){
                System.out.println("No hay moneda adentro todavía");
            }

            //Si la cantidad de monedas en el depósito de vuelto es igual a la cantidad de monedas reconocida
            //aquí (que solo es 1), entonces va a hacer que panel vuelto grafique la moneda para tomar
            else if (PanelExpendedor.getExpendedor().getCantMonVu()==1) {
                System.out.println("Hay vuelto, entrega moneda");
                cantMon=0;
            }

            else if(PanelExpendedor.getExpendedor().getCantMonVu()>0) //Se realizó una compra que dio bastante vuelto
                switch (PanelIngresoMon.getMonPago().getValor()){
                    case 100:
                        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Vuelto100.png"));
                        image = imageIcon.getImage();
                        g.drawImage(image,0,0,null);
                        break;
                }

        }catch (NullPointerException a){
            System.out.println("No se procesado ninguna compra");
        }catch (Exception e) {
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
