package modelo;

/**
 *
 * @author christianecg
 */
public class TerminoEcuacion {
    private float coeficiente;
    private byte potencia;

    public TerminoEcuacion() {
    }
    
    public void derivar(){
        this.coeficiente*=this.potencia;
        this.potencia--;
    }
    
    public void integrar(){
        this.potencia++;
        this.coeficiente/=this.potencia;
    }

    public float getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(String coeficiente) throws Exception {
        float coef;
        try {coef=Float.parseFloat(coeficiente);} 
        catch (NumberFormatException e) {
            throw new Exception("El valor del coeficiente debe ser un número.");
        }
        if(coef==0.0f)
            throw new Exception("El coeficiente no puede ser 0");
        this.coeficiente = coef;
    }

    public byte getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) throws Exception {
        byte poten;
        try {poten=Byte.parseByte(potencia);} 
        catch (NumberFormatException e) {
            throw new Exception("El valor de la pótencia debe ser un número entero.");
        }
        this.potencia = poten;
    }

    @Override
    public String toString() {
        return "TerminoEcuacion{" + "coeficiente=" + coeficiente + ", potencia=" + potencia + '}';
    }
    
    public String[] toArray(){
        return new String[]{"",coeficiente+"",potencia+""};
    }
}
