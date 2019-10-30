package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Asignatura;

/**
 *
 * @author christianecg
 */
public class ControlAsignatura {
    private ArrayList<Asignatura> grupo;
    
    public void agregarAsignatura(Asignatura nueva){        
        try {
            cargarDatos();
            
            File ruta = new File("asignaturas.obj");
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream bufer = new ObjectOutputStream(archivo);
            
            bufer.writeObject(nueva);
            for(Asignatura a : grupo){
                bufer.writeObject(a);
            }
            
            bufer.close();
            archivo.close();
        } catch (Exception e) {
        }
    }
    
    public void cargarDatos(){
        try {
            grupo = new ArrayList<>();
            int i=0;
            
            File ruta= new File("asignaturas.obj");
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream bufer = new ObjectInputStream(archivo);
            
            while(true){
                grupo.add((Asignatura) bufer.readObject());
            }
        } catch (Exception e) {
        }
    }

    public ArrayList<Asignatura> getConsulta(String clave, String nombre, byte hp, byte ht){
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        cargarDatos();
        for(Asignatura a : grupo){
            if(a.getClave().contains(clave) && a.getNombre().contains(nombre) && 
                    (a.getHp()==hp || hp==0) && (a.getHt()==ht || ht==0))
                asignaturas.add(a);
        }
        return asignaturas;
    }
}