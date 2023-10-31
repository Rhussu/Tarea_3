package Modelos;

/**
 * Esta es la super-superclase de todos los productos del programa (Cocacola, Sprite, Fanta, Snickers, Super8) y es para dar la base a estos.
 */
public abstract class Producto {
    protected int serie;

    /**
     * Constructor por defecto.
     */
    public Producto() {

    }

    /**
     * Método abstracto que será utilizado por todas las sub-subclases para representar lo que son.
     */
    public abstract String consumir();

    /**
     * Este es un método getter para obtener el número de serie.
     *
     * @return La serie del producto.
     */
    public int getSerie() {
        return serie;
    }
}
