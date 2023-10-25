package Vistas;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
	private PanelBilletera pb;
	private PanelInventario pi;
	public PanelComprador() {
		pb = new PanelBilletera();
		pi = new PanelInventario();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		pb.paint(g);
		pi.paint(g);
	}
}
