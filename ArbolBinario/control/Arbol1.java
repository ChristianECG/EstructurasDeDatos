package control;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Nodo;
import modelo.Persona;

/**
 *
 * @author christianecg
 */
public class Arbol1 {
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
    
    private byte numDeHijos(Nodo x){
        if(x.getHijoIzq()==null && x.getHijoDer()==null)
            return 0;
        else if(x.getHijoIzq()!=null && x.getHijoDer()==null)
            return 1;
        else if(x.getHijoIzq()==null && x.getHijoDer()!=null)
            return 1;
        else
            return 2;
    }
    
    private void caso1(Nodo aEliminar){
        Nodo padre=this.buscarPadre(aEliminar.getDato());
        if(padre.getHijoIzq()==aEliminar)
            padre.setHijoIzq(null);
        else
            padre.setHijoDer(null);
    }
    
    private Nodo getHijo(Nodo x){
        if(x.getHijoIzq()!=null)
            return x.getHijoIzq();
        else
            return x.getHijoDer();
    }
    
    private void caso2(Nodo aEliminar){
        Nodo padre=this.buscarPadre(aEliminar.getDato());
        if(padre.getHijoIzq()==aEliminar)
            padre.setHijoIzq(getHijo(aEliminar));
        else
            padre.setHijoDer(getHijo(aEliminar));
    }
    
    private Nodo getSucesor(Nodo x){
        Nodo i = x.getHijoDer();
        Nodo buscado=i;
        while(i.getHijoIzq()!=null){
            buscado=i;
            i=i.getHijoIzq();
        }
        return buscado;
    }
    
    private void caso3(Nodo aEliminar){
        Nodo sucesor = this.getSucesor(aEliminar);
        Persona p = sucesor.getDato();
        byte n = this.numDeHijos(sucesor);
        
        if(n==0)
            this.caso1(sucesor);
        if(n==1)
            this.caso2(sucesor);
        
        aEliminar.setDato(p);
    }
    
    public void eliminar(Persona e) throws Exception{
        Nodo b=this.buscar(e);
        if(b==null)
            throw new Exception("El elemento a eliminar no existe.");
        
        byte n = this.numDeHijos(b);
        
        if(this.numDeHijos(raiz)==0)
            raiz = null;
        else if(this.numDeHijos(raiz)==1)
            raiz = getHijo(raiz);
        else if(n==0)
            this.caso1(b);
        else if(n==1)
            this.caso2(b);
        else if(n==2)
            this.caso3(b);
    }
    
    public static void main(String[] args) {
        String datos[] = new String[]{"Cesar","Aliux","Osmar","Jesus","José",
            "Javier","Marcos","Zury","Valeria","Monse","Brenda","Lizbeth",
            "Christian","Michelle","Joselin"};
        Arbol1 ar = new Arbol1();
        for(String s: datos){
            ar.insertar(new Persona(s));
        }
        try {
            ar.eliminar(new Persona("Cesar"));
            System.out.println(ar.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
