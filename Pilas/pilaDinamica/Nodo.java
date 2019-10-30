package pilaDinamica;

/**
 *
 * @author christianecg
 */
public class Nodo {
    private Object dato;
    private Nodo apuntador;

    public Nodo() {
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Nodo getApuntador() {
        return apuntador;
    }

    public void setApuntador(Nodo apuntador) {
        this.apuntador = apuntador;
    }   
}
