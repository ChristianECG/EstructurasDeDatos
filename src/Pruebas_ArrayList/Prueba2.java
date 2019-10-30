package Pruebas_ArrayList;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author christianecg
 */
public class Prueba2 {
    public static void main(String[] args) {
        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Christian",(byte) 18, 1.73f, "7721202886"));
        lista.add(new Persona("Juan",(byte) 20, 1.68f, "7715407685"));
        lista.add(new Persona("Axel",(byte) 19, 1.74f, "7731562214"));
        lista.add(new Persona("Adrian",(byte) 25, 1.77f, "7716501845"));
        float estaturaPromedio=0;
        for(Persona p:lista){
            estaturaPromedio+=p.getEstatura();
        }
        estaturaPromedio/=lista.size();
        
        System.out.println(estaturaPromedio);
    }
}
