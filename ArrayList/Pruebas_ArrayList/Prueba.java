package Pruebas_ArrayList;

import java.util.ArrayList;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author christianecg
 */
public class Prueba {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add(3);
        lista.add(new Persona("Christian",(byte) 18, 1.73f,"7721202886"));
        
        System.out.println(lista.size());
        for(Object s:lista){
            System.out.println(s);
        }
        lista.add(4.5f);
        
        System.out.println("-------");
        
        System.out.println(lista.size());
        for(Object s:lista){
            System.out.println(s);
        }
        
        float res = (int) lista.get(1) + (float) lista.get(3);
        System.out.println(res);
        
        res=0;
        System.out.println("--------");
        
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Integer)
                res += (int) lista.get(i);
            
            if(lista.get(i) instanceof Float)
                res += (float) lista.get(i);
        }
        
        System.out.println(res);
    }
}
