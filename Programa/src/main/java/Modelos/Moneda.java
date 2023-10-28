package Modelos;

/**
 * Esta clase abstracta es la base (superclase) para las distintas clases que representan una moneda de un valor específico.
 */
public abstract class Moneda implements Comparable<Moneda> {
    private static int serieMon=0;
    private int serie;
    /**
     * Constructor por defecto.
     */
    public Moneda() {
        serie= serieMon;
        serieMon+=1;
    }

    /**
     * Es como un método getter para la serie de la moneda.
     *
     * @return int que almacena el valor del número de serie;
     */
    public int getSerie() {
        return this.serie;
    }

    /**
     * Método abstracto para obtener el valor de la moneda, las subclases lo deben sobreescribir.
     */
    public abstract int getValor();

    /**
     * Método compareTo() sobreescrito de la interfaz Comparable y con el objetivo de obtener información al comparar dos monedas.
     *
     * @param moneda La moneda con la que se quiera comparar el valor.
     * @return Devuelve 1 si el valor de las monedas comparadas es el mismo y 0 si sus valores son distintos.
     */
    @Override
    public int compareTo(Moneda moneda) {
        if(this.getValor() == moneda.getValor()) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Método toString() sobreescrito y con el objetivo de obtener información del objeto.
     *
     * @return La serie y el valor de la Moneda.
     */
    @Override
    public String toString() {
        return this.getSerie() + " de valor $" + this.getValor() + ".";
    }
}