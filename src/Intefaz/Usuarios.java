
package Intefaz;

public class Usuarios {
    String nombre;
    String apellidos;
    int edad;
    String signoZodiacal;
    String bias;
    String primeraCancion;
    String alias;

    public Usuarios() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.signoZodiacal = "";
        this.bias="";
        this.primeraCancion = "";
        this.alias = "";
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSignoZodiacal() {
        return signoZodiacal;
    }

    public void setSignoZodiacal(String signoZodiacal) {
        this.signoZodiacal = signoZodiacal;
    }
    
    public String getBias() {
        return bias;
    }

    public void setBias(String Bias) {
        this.bias = Bias;
    }

    public String getPrimeraCancion() {
        return primeraCancion;
    }

    public void setPrimeraCancion(String primeraCancion) {
        this.primeraCancion = primeraCancion;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    
}
