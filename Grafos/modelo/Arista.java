package modelo;

/**
 *
 * @author christianecg
 */
public class Arista {
    private Nodo destino;
    private long peso;

    /**
     *
     * @param destino de la arista
     * @param peso de la arista
     */
    public Arista(Nodo destino, long peso) {
        this.destino = destino;
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return this.destino.getNombre()+","+this.peso+")";
    }
    
    /**
     *
     * @return arreglo con los valores {nombre del nodo destino, peso de la arista}
     */
    public String[] toArray(){
        return new String[]{this.destino.getNombre(),this.peso+""};
    }
}
