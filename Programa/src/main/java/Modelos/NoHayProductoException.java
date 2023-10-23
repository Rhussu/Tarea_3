package Modelos;

/**
 * Excepción personalizada, la cual es arrojada cuando se reconoce un tipo de producto no existente en el Enum TipoProducto o cuando se reconoce que no hay más productos en el depósito seleccionado.
 *
 * @author Angie Ramírez
 */
public class NoHayProductoException extends Exception{
    /** Método constructor de la clase NoHayProductoException, que hereda los datos de la clase Exception. */
    public NoHayProductoException(){
        super();
    }
}
