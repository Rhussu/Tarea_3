package Modelos;

/**
 * Esta es una subclase de Bebida y representa una sprite.
 */
public class Sprite extends Bebida {

    /**
     * Constructor personalizado de Sprite que permite asignarle un número de serie.
     * 
     * @param serie Es el número que representa la serie del objeto.
     */
    public Sprite (int serie) {
        super(serie);
    }

    /**
     * Este método es para representarse asi mismo al consumirse.
     * 
     * @return Un string diciendo que es una sprite.
     */
    public String consumir() {
        return "sprite";
    }
}