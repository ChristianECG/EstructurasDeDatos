package colaDinamica;

import pilaDinamica.Nodo;

/**
 *
 * @author christianecg
 */
public class ColaD {
    private Nodo frente,atras;
    
    private boolean isVoid(){
        return frente==atras && frente==null;
    }
    
    public void insertar(Object obj){
        Nodo nuevo = new Nodo();
        nuevo.setDato(obj);
        
        if(isVoid()){
            frente=nuevo;
            atras=nuevo;
        } else{
            atras.setApuntador(nuevo);
            atras = nuevo;
        }
    }
    
    public void eliminar() throws Exception{
        if(!isVoid()){
            frente = frente.getApuntador();
            if(frente==null)
                atras = null;
        }
        else
            throw new Exception("Subdesbordamiento de cola.");
    }
    
    public String imprimir(){
        String salida="";
        
        Nodo i = frente;
        while(i!=null){
            salida+=i.getDato().toString()+"\n";
            i=i.getApuntador();
        }
        
        return salida;
    }
    
    private String recorre(Nodo siguiente){
        if(siguiente==null)
            return "";
        else
            return siguiente.getDato().toString()+"\n"+recorre(siguiente.getApuntador());
    }
    
    public String imprimirR(){
        return recorre(frente);
    }
}
