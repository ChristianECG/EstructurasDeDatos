package control;

import java.util.ArrayList;
import modelo.Nodo;
import modelo.Persona;

/**
 *
 * @author christianecg
 */
public class Arbol {
    private Nodo raiz;
    ArrayList<Persona> arbol;
    
    public void insertar(Persona n){
        Nodo nuevo = new Nodo();
        nuevo.setDato(n);
        if(this.raiz==null) //Vacía
            this.raiz = nuevo;
        else{
            Nodo recorre = this.raiz;
            
            for(;;){
                if(nuevo.getDato().compara(recorre.getDato()) <= 0){ //Izquierda
                    if(recorre.getHijoIzq()==null){
                        recorre.setHijoIzq(nuevo);
                        break;
                    }
                    else
                        recorre = recorre.getHijoIzq();
                }
                else{ //Derecha
                    if(recorre.getHijoDer()==null){
                        recorre.setHijoDer(nuevo);
                        break;
                    }
                    else
                        recorre = recorre.getHijoDer();
                }
            }
        }
    }
    
    private String recorrePre(Nodo actual){
        String salida = "";
        salida += actual.getDato() + "\n"; //Raíz
        if(actual.getHijoIzq()!=null){
            salida+=recorrePre(actual.getHijoIzq()); //Izquierda
        }
        if(actual.getHijoDer()!=null){
            salida+=recorrePre(actual.getHijoDer()); //Derecha
        }
        return salida;
    }
    
    private String recorreIn(Nodo actual){
        String salida = "";
        if(actual.getHijoIzq()!=null){
            salida+=recorreIn(actual.getHijoIzq()); //Izquierda
        }
        salida += actual.getDato() + "\n"; //Raíz
        if(actual.getHijoDer()!=null){
            salida+=recorreIn(actual.getHijoDer()); //Derecha
        }
        return salida;
    }
    
    private String recorrePos(Nodo actual){
        String salida = "";
        if(actual.getHijoIzq()!=null){
            salida+=recorrePos(actual.getHijoIzq()); //Izquierda
        }
        if(actual.getHijoDer()!=null){
            salida+=recorrePos(actual.getHijoDer()); //Derecha
        }
        salida += actual.getDato() + "\n"; //Raíz
        return salida;
    }
    
    public String toStringPre(){
        return recorrePre(raiz);
    }
    
    public String toStringIn(){
        return recorreIn(raiz);
    }
    
    public String toStringPos(){
        return recorrePos(raiz);
    }

    @Override
    public String toString() {
        return toStringIn();
    }
    
    private void subToArrayPre(Nodo actual){
        arbol.add(actual.getDato()); //Raíz
        if(actual.getHijoIzq()!=null){
            subToArrayPre(actual.getHijoIzq());
        }
        if(actual.getHijoDer()!=null){
            subToArrayPre(actual.getHijoDer());
        }
    }
    
    public ArrayList<Persona> toArrayPre(){
        arbol = new ArrayList<>();
        subToArrayPre(raiz);
        return arbol;
    }
    
    private void subToArrayIn(Nodo actual){
        if(actual.getHijoIzq()!=null){
            subToArrayIn(actual.getHijoIzq());
        }
        arbol.add(actual.getDato()); //Raíz
        if(actual.getHijoDer()!=null){
            subToArrayIn(actual.getHijoDer());
        }
    }
    
    public ArrayList<Persona> toArrayIn(){
        arbol = new ArrayList<>();
        subToArrayIn(raiz);
        return arbol;
    }
    
    private void subToArrayPos(Nodo actual){
        if(actual.getHijoIzq()!=null){
            subToArrayPos(actual.getHijoIzq());
        }
        if(actual.getHijoDer()!=null){
            subToArrayPos(actual.getHijoDer());
        }
        arbol.add(actual.getDato()); //Raíz
    }
    
    public ArrayList<Persona> toArrayPos(){
        arbol = new ArrayList<>();
        subToArrayPos(raiz);
        return arbol;
    }
    
    private Nodo buscar(Persona b){
        Nodo avance = this.raiz;
        while(avance.getDato().compara(b)!=0){
            if(avance.getDato().compara(b)>0){
                if(avance.getHijoIzq()!=null)
                    avance=avance.getHijoIzq();
                else
                    return null;
            } else if(avance.getHijoDer()!=null)
                avance = avance.getHijoDer();
            else
                return null;
        }
        return avance;
    }
    
    private Nodo buscarPadre(Persona b){
        Nodo avance = this.raiz;
        while(avance.getHijoDer().getDato().compara(b)!=0 && avance.getHijoIzq().getDato().compara(b)!=0){
            if(avance.getDato().compara(b)>0){
                if(avance.getHijoIzq()!=null)
                    avance=avance.getHijoIzq();
                else
                    return null;
            } else if(avance.getHijoDer()!=null)
                avance = avance.getHijoDer();
            else
                return null;
        }
        return avance;
    }
    
    public void eliminar(Persona p) throws Exception{
        if(buscar(p)== null)
            throw new Exception("No existe el nodo buscado");
        Nodo n = buscarPadre(p);
        
        if(n.getHijoIzq() == buscar(p)){
            if(n.getHijoIzq().getHijoIzq()==null && n.getHijoIzq().getHijoDer()==null){ //0 hijos
                n.setHijoIzq(null);
            }
            else if(n.getHijoIzq().getHijoIzq()==null && n.getHijoIzq().getHijoDer()!=null){ //Hijo en der
                n.setHijoIzq(n.getHijoIzq().getHijoDer());
            }
            else if(n.getHijoIzq().getHijoIzq()!=null && n.getHijoIzq().getHijoDer()==null){ //Hijo en izq
                n.setHijoIzq(n.getHijoIzq().getHijoIzq());
            }
            else{
                ArrayList<Persona> toArrayIn = toArrayIn();
                Persona sucesor = null;
                for(int i = 0; i<toArrayIn.size();i++){
                    if(toArrayIn.get(i).compara(p) == 0){
                        sucesor = toArrayIn.get(i+1);
                        System.out.println(sucesor);
                        break;
                    }
                }
                Nodo suces = buscar(sucesor);
                eliminar(sucesor);
                n.setHijoIzq(suces);
            }
        }
        else if(n.getHijoDer() == buscar(p)){
            if(n.getHijoDer().getHijoIzq()==null && n.getHijoDer().getHijoDer()==null){
                n.setHijoIzq(null);
            }
            else if(n.getHijoDer().getHijoIzq()==null && n.getHijoDer().getHijoDer()!=null){ //Hijo en der
                n.setHijoDer(n.getHijoDer().getHijoDer());
            }
            else if(n.getHijoDer().getHijoIzq()!=null && n.getHijoDer().getHijoDer()==null){ //Hijo en izq
                n.setHijoDer(n.getHijoDer().getHijoIzq());
            }
            else{
                ArrayList<Persona> toArrayIn = toArrayIn();
                Persona sucesor = null;
                for(int i = 0; i<toArrayIn.size();i++){
                    if(toArrayIn.get(i).compara(p) == 0){
                        sucesor = toArrayIn.get(i+1);
                        System.out.println(sucesor);
                        break;
                    }
                }
                Nodo suces = buscar(sucesor);
                eliminar(sucesor);
                n.setHijoDer(suces);
            }
        }
    }
    public static void main(String[] args) {
        String datos[] = new String[]{"Cesar","Aliux","Osmar","Jesus","José",
            "Javier","Marcos","Zury","Valeria","Monse","Brenda","Lizbeth",
            "Christian","Michelle","Joselin"};
        Arbol ar = new Arbol();
        for(String s: datos){
            ar.insertar(new Persona(s));
        }
        System.out.println(ar.buscarPadre(new Persona("Brenda")));
        System.out.println(ar.buscarPadre(new Persona("Brenda")).getDato().getNombre());
    }
}
