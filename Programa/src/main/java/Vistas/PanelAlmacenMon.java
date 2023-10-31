package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelAlmacenMon extends JPanel {

    public PanelAlmacenMon() {
        super();
        setOpaque(false);
        setBounds(50, 471, 171, 39);

    }

    private Image ImagenMon(int valor){
        switch (valor){
            case 100:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado100.png")).getImage();
            case 500:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado500.png")).getImage();
            case 1000:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado1000.png")).getImage();
            case 1500:
                return new ImageIcon(getClass().getClassLoader().getResource("Lado1500.png")).getImage();
        }
        System.out.println("Arroja imagen nula");
        return null;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
            for (int i=0; i<PanelExpendedor.getExpendedor().verTamañoDep("monAlmacen"); i++){
                g.drawImage(ImagenMon(PanelExpendedor.getExpendedor().verMoneda(i,false).getValor()),1+10*i,5, null);
            }
        } catch (IndexOutOfBoundsException e){}
    }
}
