package Modelos;

/**
 * Esta es una subclase abstracta de Producto y puede representar algún tipo de bebida.
 */
public abstract class Bebida extends Producto {
    private int serie;

    /**
     * Constructor personalizado de Bebida que permite asignarle un número de serie.
     * 
     * @param numSerie Es el número que representa la serie del objeto.
     */
    public Bebida(int numSerie) {
        super();
        this.serie=numSerie;
    }

    /**
     * Este es un método getter para obtener el número de serie.
     * 
     * @return La serie de la bebida.
     */
    public int getSerie() {
        return serie; 
    }
}
