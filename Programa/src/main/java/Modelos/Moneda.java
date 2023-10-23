package Modelos;

/**
 * Esta clase abstracta es la base (superclase) para las distintas clases que representan una moneda de un valor específico.
 */
public abstract class Moneda implements Comparable<Moneda> {

    /**
     * Constructor por defecto.
     */
    public Moneda() {
    }

    /**
     * Es como un método getter para la serie de la moneda.
     *
     * @return La dirección en memoria del objeto, esto representa su serie.
     */
    public String getSerie() {
        return super.toString();
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