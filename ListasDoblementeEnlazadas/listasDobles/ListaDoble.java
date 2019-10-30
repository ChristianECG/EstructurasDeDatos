package listasDobles;

import java.util.ArrayList;

/**
 *
 * @author christianecg
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    
    private boolean isVoid(){
        return inicio==fin && inicio==null;
    }
    
    private Nodo buscarNodo(long n){
        Nodo i = inicio;
        long cont = 0;
        while(i!=null && cont<=n){
            cont++;
            i=i.getApuDer();
        }
        return i;
    }
    
    public void insertarAlInicio(Object x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(this.isVoid())
            inicio=fin=nuevo;
        else{
            nuevo.setApuDer(inicio);
            inicio.setApuIzq(nuevo);
            inicio = nuevo;
        }
    }
    
    public void insertarAlFinal(Object x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if(this.isVoid())
            inicio=fin=nuevo;
        else{
            nuevo.setApuIzq(fin);
            fin.setApuDer(nuevo);
            fin = nuevo;
        }
    }
    
    public void insertarEnMedio(Object x, long pos){
        if(pos <= 1)
            this.insertarAlInicio(x);
        else{
            Nodo antes = buscarNodo(pos-3);
            Nodo despues;
            System.err.println(antes);
            if(antes!=null){
                despues = antes.getApuDer();
                System.out.println(despues);
                if(despues==null)
                    this.insertarAlFinal(x);
                else{
                    Nodo nuevo = new Nodo();
                    nuevo.setDato(x);
                    nuevo.setApuIzq(antes);
                    nuevo.setApuDer(despues);
                    antes.setApuDer(nuevo);
                    despues.setApuIzq(nuevo);
                }
            } else {
                this.insertarAlFinal(x);
            }
        }
    }
    
    public void eliminarAlInicio() throws Exception{
        if(this.isVoid())
            throw new Exception("Subdesbordamiento de lista");
        else{
            inicio = inicio.getApuDer();
            if(inicio == null)
                fin = null;
            else
                inicio.setApuIzq(null);
        }
    }
    
    public void eliminarAlFinal() throws Exception{
        if(this.isVoid())
            throw new Exception("Subdesbordamiento de lista");
        else{
            fin = fin.getApuIzq();
            if(fin == null)
                inicio = null;
            else
                fin.setApuDer(null);
        }
    }
    
    public void eliminarEnMedio(long pos) throws Exception{
        if(this.isVoid())
            throw new Exception("Subdesbordamiento de lista");
        else{
            if(pos<=1)
                this.eliminarAlInicio();
            else{
                Nodo centro = buscarNodo(pos-2);
                if(centro!=null){
                    Nodo despues = centro.getApuDer();
                    Nodo antes = centro.getApuIzq();
                    if(despues==null)
                        this.eliminarAlFinal();
                    else{
                        antes.setApuDer(despues);
                        despues.setApuIzq(antes);
                    }
                }
                else
                    eliminarAlFinal();
            }
        }
    }
    
    public ArrayList<Object> toArrayIF(){
        ArrayList<Object> list = new ArrayList<>();
        Nodo i = inicio;
        while(i != null){
            list.add(i.getDato());
            i = i.getApuDer();
        }
        return list;
    }
    
    public ArrayList<Object> toArrayFI(){
        ArrayList<Object> list = new ArrayList<>();
        Nodo i =fin;
        while(i != null){
            list.add(i.getDato());
            i = i.getApuIzq();
        }
        return list;
    }
    
}