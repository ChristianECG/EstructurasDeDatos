package pilaEstatica;

/**
 *
 * @author christianecg
 */
public class PilaE {
    private Object [] pila;
    private int tope;

    public PilaE(int t) {
        this.pila = new Object[t];
        this.tope = -1;
    }
    
    public boolean isVoid(){
        return this.tope == -1;
    }
    
    public boolean isLlena(){
        return this.tope == this.pila.length-1;
    }
    
    public void push(Object nueva) throws Exception{
        if(!this.isLlena()){
            this.tope++;
            this.pila[tope]=nueva;
        }
        else
            throw new Exception("Desbordamiento de pila\n");
    }
    
    public void pop() throws Exception{
        if(!this.isVoid())
            tope--;
        else
            throw new Exception("Subdesbordamiento de pila\n");
    }
    
    public Object getTope(){
        return this.pila[this.tope];
    }
    
    @Override
    public String toString(){
        String salida = "";
        for (int i = this.tope; i >= 0; i--) {
            Object obj = pila[i];
            salida += obj+"\n";
        }
        return salida;
    }
    
    public Object[] toArray(){
        Object o [] = new Object[tope+1];
        int indice=0;
        for (int i = this.tope; i>= 0; i--){
            o[indice] = this.pila[i];
            indice++;
        }
        return o;
    }
}
