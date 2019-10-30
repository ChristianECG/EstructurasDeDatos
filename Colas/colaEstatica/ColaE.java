package colaEstatica;

/**
 *
 * @author christianecg
 */
public class ColaE {
    private int frente;
    private int atras;
    private Object [] cola;

    public ColaE(int tam) {
        this.frente = -1;
        this.atras = -1;
        this.cola = new Object[tam];
    }
    
    private boolean isVacia(){
        return (this.frente == this.atras && this.atras == -1);
    }
    
    private boolean isLlena(){
        return (this.frente == this.atras && this.atras != -1);
    }
    
    public void insertar(Object obj) throws Exception{
        if(this.isLlena()){
            throw new Exception("Desbordamiento de cola");
        }
        
        if(this.isVacia()){ //Primera eliminación
            this.frente = 0;
            this.atras = 0;
        }
        
        this.cola[this.atras++]=obj;
        
        if(this.atras == this.cola.length){
            this.atras = 0;
        }
    }
    
    public void eliminar() throws Exception{
        if(this.isVacia()){
            throw new Exception("Subdesbordamiento de cola");
        }
        
        this.frente++;
        
        if(this.frente == this.cola.length){
            this.frente = 0;
        }
        
        if(this.isLlena()){ //Última eliminación
            this.frente = -1; 
            this.atras = -1;
        }
    }
    
    private String fori(int i, int f){
        String salida = "";
        for(int j=i; j<f; j++){
            salida += cola[j]+"\n";
        }
        return salida;
    }
    
    public String print() throws Exception{
        String salida = "";
        if(this.isVacia())
            throw new Exception("Subdesbordamiento de cola");
        
        if(this.frente<this.atras)
            salida+=fori(this.frente,this.atras);
        
        if(this.frente>=this.atras){
            salida+=fori(this.frente,this.cola.length);
            salida+=fori(0,this.atras);
        }
        
        return salida;
    }
}