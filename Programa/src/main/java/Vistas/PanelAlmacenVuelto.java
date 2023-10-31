package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelAlmacenVuelto extends JPanel {

    public PanelAlmacenVuelto() {
        super();
        setOpaque(false);
        setBounds(324, 370, 39, 137);

    }

    private Image ImagenMon(int valor){
        switch (valor){
            case 100:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto100.png")).getImage();
            case 500:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto500.png")).getImage();
            case 1000:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto1000.png")).getImage();
            case 1500:
                return new ImageIcon(getClass().getClassLoader().getResource("Vuelto1500.png")).getImage();
        }
        System.out.println("Arroja imagen nula");
        return null;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{

            for (int i=1; i<PanelExpendedor.getExpendedor().verTamañoDep("monVu"); i++){
                System.out.println("Se dibuja vuelto mini");
                g.drawImage(ImagenMon(PanelExpendedor.getExpendedor().verMoneda(i,true).getValor()),5,133 - (10*i), null);
            }
        } catch (Exception e){
            System.err.println(e);
        }
    }
}
