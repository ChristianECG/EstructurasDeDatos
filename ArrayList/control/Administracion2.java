/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author Christian Elías Cruz González <ChristianECG at itsoeh.edu.mx>
 */
public class Administracion2 {
    private int tamano;
    private Persona []grupo;
    
    public void agregarPersona(Persona nueva){        
        try {
            cargarDatos();
            
            File ruta = new File("dato.obj");
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream bufer = new ObjectOutputStream(archivo);
            
            bufer.writeObject(nueva);
            for(Persona s : grupo){
                bufer.writeObject(s);
            }
            
            bufer.close();
            archivo.close();
        } catch (Exception e) {
        }
    }
    
    public int getCantidadDeDatos(){
        int x=0;
            
        try {
            File ruta = new File("dato.obj");
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream bufer = new ObjectInputStream(archivo);
            while(true){
                bufer.readObject();
                x++;
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        return x;
    }
    
    public void cargarDatos(){
        try {
            int n=this.getCantidadDeDatos();
            grupo = new Persona[n];
            int i=0;
            
            File ruta= new File("dato.obj");
            FileInputStream archivo = new FileInputStream(ruta);
            ObjectInputStream bufer = new ObjectInputStream(archivo);
            
            while(true){
                grupo[i]=(Persona) bufer.readObject();
                i++;
            }
            
            
        } catch (Exception e) {
        }
    }
    
    public void print(){
        for(Persona p : grupo){
            if(p.getTelefono().startsWith("772"))
                System.out.println(p);
        }
    }
    
    public Persona[] filtro772(){
        int a=0;
        Persona [] per;
        for(Persona p : grupo){
            if(p.getTelefono().startsWith("772"))
                a++;
        }
        
        per= new Persona[a];
        int b = 0;
        
        for(Persona p : grupo){
            if(p.getTelefono().startsWith("772"))
                per[b++] = p;
        }
        
        return per;
    }
    
    public Persona[] consulta(){
        int a=0;
        Persona [] per;
        for(Persona p : grupo){
            a++;
        }
        
        per= new Persona[a];
        int b = 0;
        
        for(Persona p : grupo){
            per[b++] = p;
        }
        
        return per;
    }
    
    public void eliminar(String nombre){
        Persona [] todos = consulta();
        byte pos=-1;
        for (int i = 0; i < 10; i++) {
            if(todos[i].getNombre().equals(nombre))
                pos=(byte) i;
        }
        
        if(pos>-1){
            Persona [] nuevo = new Persona[todos.length-1];
            int j=0;
            for(int i=0;i<todos.length;i++){
                if(i!=pos){
                    nuevo[j++]=todos[i];
                }
            }
            
            try {
                File ruta = new File("dato.obj");
                FileOutputStream archivo = new FileOutputStream(ruta);
                ObjectOutputStream bufer = new ObjectOutputStream(archivo);

                for(Persona s : nuevo){
                    bufer.writeObject(s);
                }

                bufer.close();
                archivo.close();
            } catch (Exception e) {
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Sin coincidencias");
        }
            
        
    }
        
    public static void main(String[] args) {
        Administracion2 x = new Administracion2();
        x.cargarDatos();
        x.print();
    }
}
