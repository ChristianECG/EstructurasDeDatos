/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Christian Elías Cruz González <ChristianECG at itsoeh.edu.mx>
 */
public class Persona implements Serializable{
    private String nombre;
    private byte edad;
    private float estatura;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, byte edad, float estatura, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + ", telefono=" + telefono + '}';
    }
    
    public String[] toArray(){
        return new String[]{nombre, edad+"", estatura+"", telefono};
    }
    
}
