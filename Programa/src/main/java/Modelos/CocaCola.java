package Modelos;

/**
 * Esta es una subclase de Bebida y representa una cocacola.
 */
public class CocaCola extends Bebida {

    /**
     * Constructor personalizado de Cocacola que permite asignarle un número de serie.
     * 
     * @param serie Es el número que representa la serie del objeto.
     */
    public CocaCola (int serie) {
        super(serie);
    }

    /**
     * Este método es para representarse asi mismo al consumirse.
     * 
     * @return Un string diciendo que es una cocacola.
     */
    public String consumir() {
        return "cocacola";
    }
}