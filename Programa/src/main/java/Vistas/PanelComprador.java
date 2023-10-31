package Vistas;

import Modelos.*;

import javax.swing.*;
import java.awt.*;

/**
 * Panel que representa la perspectiva primera persona de nuestro comprador.
 */
public class PanelComprador extends JPanel {
	private static Comprador comprador;
	private PanelBilletera panelBilletera;
	private PanelInventario panelInventario;

	/**
	 * Constructor personalizado en el que le doy características al panel.
	 */
	public PanelComprador() {
		super();
		comprador = new Comprador();
		setLayout(null);
		setOpaque(false);
		setBounds(0,0,Ventana.ANCHO, Ventana.ALTO);
		panelBilletera = new PanelBilletera();
		panelInventario = new PanelInventario();
		add(panelBilletera);
		add(panelInventario);
	}

	/**
	 * Getter de la variable comprador.
	 *
	 * @return El comprador.
	 */
	public static Comprador getComprador() {
		return comprador;
	}
}
