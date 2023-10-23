package Modelos;

import java.util.ArrayList;

/**
 * Clase que almacena en Arraylists una cierta cantidad de productos de cualquier tipo.
 * 
 * @param <T> tipo genérico que definirá el tipo de depósito.
 */
public class Deposito<T>{

    /** Arraylists que almacena los productos elegidos. */
    private ArrayList<T> almacen;

    /**
     * Constructo por defecto. Inicializa el Arraylist almacén.
     */
    public Deposito(){
        almacen=new ArrayList<T>();
    }

    /**
     * Agrega productos o Monedas al depósito, uno a la vez.
     * 
     * @param b Objeto genérico que será agregado al almacén.
     */
    public void add(T b){
        almacen.add(b);
    }

    /**
     * Obtiene el objeto solicitado de su depósito, eliminando del almacén en el proceso y asegurándose de que existan productos almacenados.
     * 
     * @return Objeto genérico obtenido del almacén. En caso de no tener más Objetos adentro, arrojará un puntero nulo.
     */
    public T get(){
        if(almacen.size()!=0){
            return almacen.remove(0);
        }
        else{
            return null;
        }
    }

    /**
     * Verifica el tamaño del depósito.
     * 
     * @return entero con el tamaño del almacén.
     */
    public int check(){
        return almacen.size();
    }
}
