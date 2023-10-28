package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
	private PanelBilletera panelBilletera;
	private PanelInventario panelInventario;
	public PanelComprador() {
		super();
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,Ventana.ANCHO, Ventana.ALTO);
		panelBilletera = new PanelBilletera();
		panelInventario = new PanelInventario();
		add(panelBilletera);
		add(panelInventario);
	}
}
