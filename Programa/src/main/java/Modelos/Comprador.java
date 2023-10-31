package Modelos;

/**
 * Esta clase simula un comprador que intenta comprar algo en la máquina expendedora con una moneda.
 */
public class Comprador {
    private String sonido = null;
    private int vuelto=0;
    private Producto producto = null;

    /**
     * Constructor por defecto del comprador.
     */
    public Comprador(){
    }

    /**
     * Este es un método para realizar la operación de comprar un producto en el expendedor.
     *
     * @param moneda                     Una Moneda con lo que se pagará.
     * @param cualProducto               El tipo de producto que se desea comprar.
     * @param expendedor                 El Expendedor en el cual se va a comprar.
     * @throws PagoIncorrectoException   En caso de que la Moneda sea nula.
     * @throws PagoInsuficienteException Si el valor de las monedas es menor al del producto.
     * @throws NoHayProductoException    En caso de que no quede el producto que se intenta comprar.
     */
    public void comprarProducto(Moneda moneda, TipoProducto cualProducto, Expendedor expendedor) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {
        try {
            expendedor.comprarProducto(moneda, cualProducto);
            producto = expendedor.getProducto();

        } catch (PagoIncorrectoException | NoHayProductoException | PagoInsuficienteException e) {
            throw e;
        }
    }

    /**
     * Agrega el vuelto obtenido a un total de vueltos.
     * @param valor la cantidad de vuelto que se agregaría al total.
     */
    public void addVuelto(int valor){
        vuelto+=valor;
    }

    /**
     * Este es un constructor personalizado y realiza la operación de comprar un producto en el expendedor.
     *
     * @return La cantidad de vuelto que se devolvió al comprar.
     */
    public int cuantoVuelto(){
        return vuelto;
    }

    /**
     * Método para consumir el producto comprado.
     */
    public void consumirMiProducto(){
        sonido = producto.consumir();
    }

    /**
     * Este es un constructor personalizado y realiza la operación de comprar un producto en el expendedor.
     *
     * @return Un string que explica que se consumió.
     */
    public String queConsumiste(){
        return sonido;
    }

    public Producto verProducto (){
        return producto;
    }
}
