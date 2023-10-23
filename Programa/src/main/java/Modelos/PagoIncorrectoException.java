package Modelos;

/**
 * Excepción personalizada, la cual es arrojada cuando se recibe y se trata de trabajar con una moneda nula.
 *
 * @author Angie Ramírez
 */
public class PagoIncorrectoException extends Exception{
    /** Método constructor de la clase PagoIncorrectoException, que hereda los datos de la clase Exception. */
    public PagoIncorrectoException(){
        super();
    }
}
