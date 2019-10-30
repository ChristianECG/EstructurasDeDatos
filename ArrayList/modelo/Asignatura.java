package modelo;

import java.util.ArrayList;

/**
 *
 * @author christianecg
 */
public class Asignatura implements java.io.Serializable{
    private String clave;
    private String nombre;
    private byte ht;
    private byte hp;

    public Asignatura() {
    }

    public Asignatura(String clave, String nombre, byte ht, byte hp) {
        this.clave = clave;
        this.nombre = nombre;
        this.ht = ht;
        this.hp = hp;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getHt() {
        return ht;
    }

    public void setHt(byte ht) {
        this.ht = ht;
    }

    public byte getHp() {
        return hp;
    }

    public void setHp(byte hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "clave=" + clave + ", nombre=" + nombre + ", ht=" + ht + ", hp=" + hp + '}';
    }
    
    public String[] toArray(){
        String[] al = new String[4];
        al[0]=(clave);
        al[1]=(nombre);
        al[2]=(String.valueOf(ht));
        al[3]=(String.valueOf(hp));
        return al;
    }
}