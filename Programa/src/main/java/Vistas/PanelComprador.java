package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
	private PanelBilletera panelBilletera;
	private PanelInventario panelInventario;
	public PanelComprador() {
		panelBilletera = new PanelBilletera();
		panelInventario = new PanelInventario();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		panelBilletera.paint(g);
		panelInventario.paint(g);
	}
}
