package modelo;

/**
 *
 * @author christianecg
 */
public class Usuario {
    private String usuario;
    private String password;

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws Exception {
        if(usuario.equals(""))
            throw new Exception("El usuario no puede estar vacío.");
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws Exception {
        if(password.equals(""))
            throw new Exception("La contraseña no puede estar vacía.");
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", password=" + password + '}';
    }
    
    public String[] toArray(){
        return new String[]{"",usuario,password};
    }
    
}