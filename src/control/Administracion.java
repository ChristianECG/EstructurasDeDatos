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
import modelo.Persona;

/**
 *
 * @author Christian Elías Cruz González <ChristianECG at itsoeh.edu.mx>
 */
public class Administracion {
    private String ruta = "dato.obj";
    
    public void guardar(){
        try {
            File ruta = new File(this.ruta);
            FileOutputStream archivo = new FileOutputStream(ruta);
            ObjectOutputStream bufer = new ObjectOutputStream(archivo);
            bufer.writeObject(new Persona("Christian",(byte)18,1.65f,"7724612098"));
            bufer.writeObject(new Persona("Ana",(byte)23,1.72f,"7721092658"));
            bufer.writeObject(new Persona("Johana",(byte)20,1.72f,"7710985672"));
            bufer.writeObject(new Persona("Pedro",(byte)40,1.72f,"7731074658"));
            bufer.writeObject(new Persona("Mario",(byte)48,1.72f,"7711697651"));
            bufer.writeObject(new Persona("Giovanny",(byte)35,1.72f,"7721926581"));
            bufer.writeObject(new Persona("Agustin",(byte)48,1.72f,"7731096581"));
            bufer.writeObject(new Persona("Yadira",(byte)38,1.72f,"7711092681"));
            bufer.writeObject(new Persona("Johan",(byte)45,1.72f,"7721092651"));
            bufer.writeObject(new Persona("Cuadros",(byte)47,1.72f,"7721092658"));
            
            bufer.close();
            archivo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Administracion x = new Administracion();
        x.guardar();
    }
}
