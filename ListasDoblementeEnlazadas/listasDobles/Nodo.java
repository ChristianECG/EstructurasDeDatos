package listasDobles;

/**
 *
 * @author christianecg
 */
public class Nodo {
    private Object dato;
    private Nodo apuIzq;
    private Nodo apuDer;

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getApuIzq() {
        return apuIzq;
    }

    public void setApuIzq(Nodo apuIzq) {
        this.apuIzq = apuIzq;
    }

    public Nodo getApuDer() {
        return apuDer;
    }

    public void setApuDer(Nodo apuDer) {
        this.apuDer = apuDer;
    }
    
    
}
