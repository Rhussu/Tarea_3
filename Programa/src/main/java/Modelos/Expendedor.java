package Modelos;

/**
 * Esta clase simula una máquina expendedora, la cual posee varios depósitos de productos y uno de monedas.
 * Permite adquirir estos productos a través de una compra y entrega un vuelto.
 *
 * @author Angie Ramírez
 */
public class Expendedor{
    /** Depósitos que almacenan los tipos de productos o monedas*/
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snikers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monVu;
    private Deposito<Moneda> monAlmacen;
    private Producto depUnico;

    /**
     * Método constructor de la clase Expendedor. Inicializa los depósitos de cada producto asignándoles números de serie.
     * @param numProductos Cantidad de productos estándar que se generarán en todos los depósitos.
     */
    public Expendedor(int numProductos){
        coca = new Deposito<>();
        sprite= new Deposito<>();
        fanta= new Deposito<>();
        snikers= new Deposito<>();
        super8= new Deposito<>();
        monVu = new Deposito<>();
        monAlmacen = new Deposito<>();

        for(int i=0; i<numProductos;i++){
            coca.add(new CocaCola(100+i));
            sprite.add(new Sprite(200+i));
            fanta.add(new Fanta(300+i));
            snikers.add(new Snickers(400+i));
            super8.add(new Super8(500+i));
        }
    }

    /**
     * Realiza la compra de un producto, verificando el recibo de la moneda, almacenando el vuelto y sacando el producto del Depósito correspondiente.
     * @param m Moneda recibida para pagar.
     * @param cual TipoProducto que permite saber cuál producto se está solicitando.
     * @return Producto adquirido del depósito solicitado.
     * @throws PagoIncorrectoException Si la variable m resulta null.
     * @throws NoHayProductoException Si el consumidor selecciona un tipo de producto no existente en el Enum o si no hay más productos en su depósito.
     * @throws PagoInsuficienteException Si la Moneda "m" es de un valor menor al precio del producto solicitado.
     */
    public void comprarProducto(Moneda m,TipoProducto cual) throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {

        if(m==null){
            throw new PagoIncorrectoException();
        }
        if(cual==null){
            monVu.add(m);
            throw new NoHayProductoException();
        }

        switch (cual) {
            case COCA:
                if (m.getValor() >= Precio.VALCOCA.getPrecio() && coca.check() != 0) {
                    for (int i = 0; i < (m.getValor() - Precio.VALCOCA.getPrecio()) / 100; i++) {
                        monVu.add(new Moneda100());
                    }
                    monAlmacen.add(m);
                    depUnico = coca.get();
                }
                else {
                    monVu.add(m);
                    if(m.getValor()<Precio.VALCOCA.getPrecio()){
                        throw new PagoInsuficienteException();
                    }
                    else if(coca.check()==0) {
                        throw new NoHayProductoException();
                    }
                }
                break;

            case SPRITE:
                if (m.getValor() >= Precio.VALSPRITE.getPrecio() && sprite.check() != 0) {
                    for (int i = 0; i < (m.getValor() - Precio.VALSPRITE.getPrecio()) / 100; i++) {
                        monVu.add(new Moneda100());
                    }
                    monAlmacen.add(m);
                    depUnico=sprite.get();
                }
                else {
                    monVu.add(m);
                    if(m.getValor()<Precio.VALSPRITE.getPrecio()){
                        throw new PagoInsuficienteException();
                    }
                    else if(sprite.check()==0) {
                        throw new NoHayProductoException();
                    }
                }
                break;

            case FANTA:
                if (m.getValor() >= Precio.VALFANTA.getPrecio() && fanta.check() != 0) {
                    for (int i = 0; i < (m.getValor() - Precio.VALFANTA.getPrecio()) / 100; i++) {
                        monVu.add(new Moneda100());
                    }
                    monAlmacen.add(m);
                    depUnico=fanta.get();
                }
                else {
                    monVu.add(m);
                    if(m.getValor()<Precio.VALFANTA.getPrecio()){
                        throw new PagoInsuficienteException();
                    }
                    else if(fanta.check()==0) {
                        throw new NoHayProductoException();
                    }
                }
                break;

            case SNICKERS:
                if (m.getValor() >= Precio.VALSNICK.getPrecio() && snikers.check() != 0) {
                    for (int i = 0; i < (m.getValor() - Precio.VALSNICK.getPrecio()) / 100; i++) {
                        monVu.add(new Moneda100());
                    }
                    monAlmacen.add(m);
                    depUnico= snikers.get();
                }
                else {
                    monVu.add(m);
                    if(m.getValor()<Precio.VALSNICK.getPrecio()){
                        throw new PagoInsuficienteException();
                    }
                    else if(snikers.check()==0) {
                        throw new NoHayProductoException();
                    }
                }
                break;

            case SUPER8:
                if (m.getValor() >= Precio.VALSUPER8.getPrecio() && super8.check() != 0) {
                    for (int i = 0; i < (m.getValor() - Precio.VALSUPER8.getPrecio()) / 100; i++) {
                        monVu.add(new Moneda100());
                    }
                    monAlmacen.add(m);
                    depUnico = super8.get();
                }
                else {
                    monVu.add(m);
                    if(m.getValor()<Precio.VALSUPER8.getPrecio()){
                        throw new PagoInsuficienteException();
                    }
                    else if(super8.check()==0) {
                        throw new NoHayProductoException();
                    }
                }
                break;

            default:
                monVu.add(m);
                throw new NoHayProductoException();
        }
    }

    /**
     * Entrega el dinero sobrante tras realizar una compra, sacando las Monedas del depósito MonVu.
     * @return Moneda adquirida del depósito MonVu.
     */
    public Moneda getVuelto(){
        return monVu.get();
    }

    public int getCantMonVu(){ return  monVu.check(); }

    public Producto getProducto(){
        Producto aux = depUnico;
        depUnico = null;
        return aux;
    }
}