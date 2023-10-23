package Modelos;

/**
 * Esta es la super-superclase de todos los productos del programa (Cocacola, Sprite, Fanta, Snickers, Super8) y es para dar la base a estos.
 */
public abstract class Producto {

    /**
     * Constructor por defecto.
     */
    public Producto() {

    }

    /**
     * Método abstracto que será utilizado por todas las sub-subclases para representar lo que son.
     */
    public abstract String consumir();
}
