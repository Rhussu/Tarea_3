package Modelos;

/**
 * Esta es una subclase de la clase abstracta "Moneda", y representa una moneda de 1500.
 */
public class Moneda1500 extends Moneda {

    /**
     * Constructor que utiliza el de la superclase.
     */
    public Moneda1500() {
        super();
    }

    /**
     * Este método es como un getter del valor.
     * 
     * @return El valor ficticio de la moneda, 1500.
     */
    public int getValor() {
        return 1500;
    }
}
