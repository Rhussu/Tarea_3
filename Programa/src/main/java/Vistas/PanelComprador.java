package Vistas;

import Modelos.Comprador;
import Modelos.*;
import Modelos.Expendedor;
import Modelos.Producto;
import Modelos.TipoProducto;

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
	public static void setComprador(Moneda m, TipoProducto p) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
		comprador = new Comprador(m,p,PanelExpendedor.getExpendedor());

	}
}
