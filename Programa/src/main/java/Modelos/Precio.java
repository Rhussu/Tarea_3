package Modelos;

/**
 * Enum que representa los precios de cada uno de los Productos que se encuentran en la clase Expendedor.
 */
public enum Precio {
    VALCOCA(1500),
    VALSPRITE(1300),
    VALFANTA(1400),
    VALSNICK(200),
    VALSUPER8(100);

    /** Entero que almacenará los precios de cada producto. */
    private int precio;

    /**
     * Genera una instancia de Precio con el valor especificado.
     * @param precio El precio del producto almacenado en pesos.
     */
    private Precio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio del producto en pesos.
     * @return Entero con el valor del producto.
     */
    public int getPrecio() {
        return precio;
    }
}
