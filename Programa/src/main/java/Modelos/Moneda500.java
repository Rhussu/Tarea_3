package Modelos;

/**
 * Esta es una subclase de la clase abstracta "Moneda", y representa una moneda de 500.
 */
public class Moneda500 extends Moneda {

    /**
     * Constructor que utiliza el de la superclase.
     */
    public Moneda500() {
        super();
    }

    /**
     * Este método es como un getter del valor.
     * 
     * @return El valor ficticio de la moneda, 500.
     */
    public int getValor() {
        return 500;
    }
}
