
package Modelo;

public class Plantel {
 
    private int numero;
    private String nombreJ;
    private int idP;
    private int idD;
    private int edad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombreJ() {
        return nombreJ;
    }

    public void setNombreJ(String nombreJ) {
        this.nombreJ = nombreJ;
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Plantel() {
    }

    public Plantel(int numero, String nombreJ, int idP, int idD, int edad) {
        this.numero = numero;
        this.nombreJ = nombreJ;
        this.idP = idP;
        this.idD = idD;
        this.edad = edad;
    }
    
}
