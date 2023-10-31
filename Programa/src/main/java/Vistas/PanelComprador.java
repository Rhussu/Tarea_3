package Vistas;

import Modelos.*;

import javax.swing.*;
import java.awt.*;

public class PanelComprador extends JPanel {
	private static Comprador comprador;
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

	public static Comprador getComprador() {
		return comprador;
	}
	public static void setComprador(Moneda m, TipoProducto tipo) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
		comprador = new Comprador(m,tipo,PanelExpendedor.getExpendedor());
	}
}
