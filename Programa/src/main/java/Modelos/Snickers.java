package Modelos;

/**
 * Esta es una subclase de Dulce y representa una snickers.
 */
public class Snickers extends Dulce {

    /**
     * Constructor personalizado de Snickers que permite asignarle un número de serie.
     * 
     * @param serie Es el número que representa la serie del objeto.
     */
    public Snickers (int serie) {
        super(serie);
    }

    /**
     * Este método es para representarse asi mismo al consumirse.
     * 
     * @return Un string diciendo que es una snickers.
     */
    public String consumir() {
        return "snickers";
    }
}