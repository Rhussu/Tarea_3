package Modelos;

/**
 * Esta es una subclase de Bebida y representa una fanta.
 */
public class Fanta extends Bebida {

    /**
     * Constructor personalizado de Fanta que permite asignarle un número de serie.
     * 
     * @param serie Es el número que representa la serie del objeto.
     */
    public Fanta (int serie) {
        super(serie);
    }

    /**
     * Este método es para representarse asi mismo al consumirse.
     * 
     * @return Un string diciendo que es una fanta.
     */
    public String consumir() {
        return "fanta";
    }
}