package pilaDinamica;

import java.util.ArrayList;

/**
 *
 * @author christianecg
 */
public class PilaD {
    private Nodo tope;
    
    public boolean isVoid(){
        return this.tope == null;
    }
    
    public void push(Object nueva){
        Nodo nuevo=new Nodo();
        nuevo.setDato(nueva);
        nuevo.setApuntador(this.tope);
        this.tope=nuevo;
    }
    
    public void pop() throws Exception{
        if(!this.isVoid())
            this.tope = this.tope.getApuntador();
        else
            throw new Exception("Subdesbordamiento de pila.\n");
    }
    
    public Object getTope(){
        return tope.getDato();
    }
    
    @Override
    public String toString(){
        String salida="";
        Nodo i = tope;
        
        while(i != null){
            salida+=i.getDato()+"\n";
            i = i.getApuntador();
        }
        
        return salida;
    }
    
    public ArrayList<Object> toArray(){
        ArrayList<Object> salida = new ArrayList<>();
        
        Nodo i = tope;
        
        while(i != null){
            salida.add(i.getDato());
            i = i.getApuntador();
        }
        
        return salida;
    }
}