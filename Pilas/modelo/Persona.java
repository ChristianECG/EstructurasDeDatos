package modelo;

/**
 *
 * @author christianecg
 */
public class Persona {
    private String nombre;
    private byte dd;
    private byte mm;
    private int yyyy;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        /*if(nombre.equals(""))
            throw new Exception("El nombre no es un valor válido.\n");
        if(nombre.equals("Christian Elías"))
            throw new Exception("El nombre no es un valor válido.\n");
        if(nombre.contains("1") || nombre.contains("2")
                || nombre.contains("3") || nombre.contains("4")
                || nombre.contains("5") || nombre.contains("6")
                || nombre.contains("7") || nombre.contains("8")
                || nombre.contains("9") || nombre.contains("0"))
            throw new Exception("El nombre no puede contener números.\n");*/
        this.nombre = nombre;
    }

    public byte getDd() throws Exception {
        return dd;
    }

    public void setDd(byte dd) throws Exception {
        /*if(dd==0)
            throw new Exception("El día no es un valor válido.\n");
        if(dd<1 || dd>31)
            throw new Exception("El día debe estar entre 1 y 31.\n");*/
        this.dd = dd;
    }

    public byte getMm() {
        return mm;
    }

    public void setMm(byte mm) throws Exception {
        /*if(mm==0)
            throw new Exception("El mes no es un valor válido.\n");
        if(mm<1 || mm>12)
            throw new Exception("El mes debe estar entre 1 y 12.\n");
        if(!(mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12) && dd==31)
            throw new Exception("El mes elegido no tiene 31 días.\n");
        if(mm==2 && dd>29)
            throw new Exception("El mes de febrero no puede contener "+dd+" días.\n");*/
        this.mm = mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) throws Exception {
        /*if(yyyy==0)
            throw new Exception("El año no es un valor válido.\n");
        if(yyyy<1900 || yyyy>2019)
            throw new Exception("El año debe estar entre 1900 y 2019.\n");
        if(yyyy%4!=0 && dd>=29 && mm==2)
            throw new Exception("El año "+yyyy+" no es bisiesto. Favor de modificar el día.\n");
        if(yyyy%4==0 && yyyy%100==0 && mm==2 && dd>=29)
            throw new Exception("El año "+yyyy+" no es bisiesto. Favor de modificar el día.\n");*/
        this.yyyy = yyyy;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + '}';
    }
    
    public String[] toArray() {
        return new String[]{nombre,dd+"",mm+"",yyyy+""};
    }
}