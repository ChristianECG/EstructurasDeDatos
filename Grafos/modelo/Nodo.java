package modelo;

import java.util.ArrayList;

/**
 *
 * @author christianecg
 */
public class Nodo {
    private String nombre;
    private ArrayList<Arista> aristas;

    /**
     *
     * @param nombre del Nodo
     */
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList<>();
    }

    /**
     *
     * @return nombre del Nodo
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     *
     * @param destino de la arista
     * @param peso de la arista
     */
    public void addArista(Nodo destino, long peso){
        this.aristas.add(new Arista(destino, peso));
    }
    
    @Override
    public String toString(){
        String salida ="";
        for(Arista arista : aristas){
            salida += "("+this.nombre+","+arista+"\n";
        }
        return salida;
    }

    /**
     *
     * @return arreglo de aristas con origen en el nodo
     */
    public ArrayList<Arista> getAristas() {
        return aristas;
    }

}
