package control;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Nodo;

/**
 *
 * @author christianecg
 */
public class Grafo {
    private ArrayList<Nodo> nodos;

    public Grafo() {
        nodos = new ArrayList<>();
    }
    
    /**
     *
     * @param nombre del nuevo nodo
     */
    public void addNodo(String nombre){
        nodos.add(new Nodo(nombre));
    }

    /**
     *
     * @param origen
     * @param destino
     * @param peso de la arista
     * @throws Exception en caso de no existir algún nodo
     */
    public void addAristas(String origen, String destino, long peso) throws Exception{
        Nodo nOrigen = buscarNodo(origen);
        Nodo nDestino = buscarNodo(destino);
        if(nOrigen == null)
            throw new Exception("El vértice " +origen+ " no existe");
        if(nDestino == null)
            throw new Exception("El vértice " +destino+ " no existe");
        nOrigen.addArista(nDestino, peso);
    }
    
    /**
     *
     * @param nombre del nodo a buscar
     * @return nodo buscado
     */
    private Nodo buscarNodo(String nombre){
        for(Nodo nodo : nodos)
            if(nodo.getNombre().equals(nombre))
                return nodo;
        return null;
    }
    
    @Override
    public String toString(){
        String salida = "";
        for(Nodo nodo : nodos)
            salida+=nodo+"\n";
        return salida;
    }

    /**
     *
     * @return arreglo de nodos
     */
    public ArrayList<Nodo> getNodos() {
        return nodos;
    }
    
    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        grafo.addNodo("Tlahue");
        grafo.addNodo("Tinaco");
        grafo.addNodo("Hoyos");
        grafo.addNodo("ITSOEH");
        grafo.addNodo("Tezo");
        
        try {
            grafo.addAristas("Tlahue", "Tezo", 30);
            grafo.addAristas("Tinaco", "Tezo", 20);
            grafo.addAristas("Hoyos", "Tezo", 8);
            grafo.addAristas("ITSOEH", "Tezo", 40);
            grafo.addAristas("Tezo", "Tlahue", 30);
            grafo.addAristas("Tezo", "Tinaco", 20);
            grafo.addAristas("Tezo", "Hoyos", 8);
            grafo.addAristas("Tezo", "ITSOEH", 40);
            grafo.addAristas("Tlahue", "Tinaco", 5);
            grafo.addAristas("Tinaco", "Tlahue", 5);
            grafo.addAristas("Tinaco", "Hoyos", 2);
            grafo.addAristas("Hoyos", "Tinaco", 2);
            grafo.addAristas("ITSOEH", "Hoyos", 2);
            grafo.addAristas("Hoyos", "ITSOEH", 2);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        
        System.out.println(grafo);
    }
}