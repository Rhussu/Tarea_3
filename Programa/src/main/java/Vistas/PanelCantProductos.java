package Vistas;

import Modelos.TipoProducto;

import javax.swing.*;
import java.awt.*;

public class PanelCantProductos extends JPanel {
    public PanelCantProductos(){
        super();
        setOpaque(false);
        setBounds(45, 191, 237, 232);
        setBackground(new Color(255,255,255,100));
    }

    public String nombreDep(int num){
        switch (num){
            case 0:
                return "coca";
            case 1:
                return "sprite";
            case 2:
                return "fanta";
            case 3:
                return "super8";
            case 4:
                return "snikers";
            default:
                return null;
        }
    }

    public int posicionX (int num){
        switch (num){
            case 0:
                return 55;
            case 1:
                return 137;
            case 2:
                return 214;
            case 3:
                return 95;
            case 4:
                return 210;
            default:
                return 0;
        }
    }

    public int posicionY (int num){
        switch (num){
            case 0:
                return 5;
            case 1:
                return 5;
            case 2:
                return 5;
            case 3:
                return 125;
            case 4:
                return 125;
            default:
                return 0;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            ImageIcon imageIcon = null;
            for(int j=0; j<=4; j++) {
                for (int i = 0; i <= PanelExpendedor.getExpendedor().verTamañoDep(nombreDep(j)); i++) {

                    switch (PanelExpendedor.getExpendedor().verTamañoDep(nombreDep(j))) {
                        case 0:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cero.png"));
                            break;
                        case 1:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Uno.png"));
                            break;
                        case 2:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Dos.png"));
                            break;
                        case 3:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Tres.png"));
                            break;
                        case 4:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cuatro.png"));
                            break;
                        case 5:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cinco.png"));
                            break;
                        case 6:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Seis.png"));
                            break;
                        case 7:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Siete.png"));
                            break;
                        case 8:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Ocho.png"));
                            break;
                        case 9:
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Nueve.png"));
                            break;
                        default:
                            break;
                    }
                    g.drawImage(imageIcon.getImage(), posicionX(j), posicionY(j), null);
                }
            }
        } catch(Exception e){
            System.out.println("Error en cantProductos");
            System.err.println(e);
        }
    }
}
