package modelo;

/**
 *
 * @author christianecg
 */
public class Persona {
    private String matricula;
    private String nombre;
    private String apellidos;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos.toUpperCase();
    }

    @Override
    public String toString() {
        return "Persona{" + "matricula=" + matricula + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    public String[] toArray(){
        return new String[] {matricula, nombre, apellidos};
    }
    
    public int compara(Persona otra){
        return this.nombre.compareTo(otra.getNombre());
    }

    public Persona() {
    }
    
    public Persona(String nombre) {
        this.nombre = nombre.toUpperCase();
    }
}