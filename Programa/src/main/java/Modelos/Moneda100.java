package Modelos;

/**
 * Esta es una subclase de la clase abstracta "Moneda", y representa una moneda de 100.
 */
public class Moneda100 extends Moneda {

    /**
     * Constructor que utiliza el de la superclase.
     */
    public Moneda100() {
        super();
    }

    /**
     * Este método es como un getter del valor.
     * 
     * @return El valor ficticio de la moneda, 100.
     */
    public int getValor() {
        return 100;
    }
}
