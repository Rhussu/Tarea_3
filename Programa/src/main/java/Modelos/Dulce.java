package Modelos;

/**
 * Esta es una subclase abstracta de Producto y puede representar algún tipo de dulce.
 */
public abstract class Dulce extends Producto {

    /**
     * Constructor personalizado de Dulce que permite asignarle un número de serie.
     * 
     * @param numSerie Es el número que representa la serie del objeto.
     */
    public Dulce(int numSerie) {
        super();
        this.serie=numSerie;
    }
}