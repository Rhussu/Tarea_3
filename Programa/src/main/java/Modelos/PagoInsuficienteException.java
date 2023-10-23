package Modelos;

/**
 * Excepción personalizada, la cual es arrojada cuando se reconoce un pago a través de una Moneda de valor inferior al precio del producto solicitado.
 *
 * @author Angie Ramírez
 */
public class PagoInsuficienteException extends Exception{
    /** Método constructor de la clase PagoInsuficienteException, que hereda los datos de la clase Exception. */
    public PagoInsuficienteException(){
        super();
    }
}