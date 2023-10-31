package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelInventario extends JPanel {

    public PanelInventario() {
        super();
        setOpaque(false);
        setBounds(Ventana.ANCHO - 243,0,243,Ventana.ALTO);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("FondoInventario.png"));
        g.drawImage(imageIcon.getImage(), 0, 0, null);
        imageIcon = new ImageIcon(getClass().getClassLoader().getResource("BolsaMon.png"));
        g.drawImage(imageIcon.getImage(), 110, 560, null);

        try {
            switch (PanelComprador.getComprador().queConsumiste()) {
                case "sprite":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Sprite.png"));
                    g.drawImage(imageIcon.getImage(), 115, 210, null);
                    break;
                case "cocacola":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Coca.png"));
                    g.drawImage(imageIcon.getImage(), 115, 210, null);
                    break;
                case "fanta":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Fanta.png"));
                    g.drawImage(imageIcon.getImage(), 115, 210, null);
                    break;
                case "snickers":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Snick.png"));
                    g.drawImage(imageIcon.getImage(), 90, 190, null);
                    break;
                case "super8":
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Super8.png"));
                    g.drawImage(imageIcon.getImage(), 90, 185, null);
                    break;
            }
        } catch (NullPointerException e) {
            System.out.println("Aun no se ha comprado nada");
        }

        try {
            for (int i = 0; i <= Integer.toString(PanelComprador.getComprador().cuantoVuelto()).length(); i++) {
                if (i == 0) {
                    imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Signo.png"));
                }else{
                    switch (Integer.toString(PanelComprador.getComprador().cuantoVuelto()).substring(i - 1, i)) {
                        case "0":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cero.png"));
                            break;
                        case "1":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Uno.png"));
                            break;
                        case "2":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Dos.png"));
                            break;
                        case "3":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Tres.png"));
                            break;
                        case "4":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cuatro.png"));
                            break;
                        case "5":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Cinco.png"));
                            break;
                        case "6":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Seis.png"));
                            break;
                        case "7":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Siete.png"));
                            break;
                        case "8":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Ocho.png"));
                            break;
                        case "9":
                            imageIcon = new ImageIcon(getClass().getClassLoader().getResource("Nueve.png"));
                            break;
                        default:
                            break;
                    }
                }
                g.drawImage(imageIcon.getImage(),210 - 20*(Integer.toString(PanelComprador.getComprador().cuantoVuelto()).length() - i ), 510,null);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
