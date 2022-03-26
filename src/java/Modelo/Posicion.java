
package Modelo;

public class Posicion {
    
    private int idP;
    private String nombreP;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public Posicion() {
    }

    public Posicion(int idP, String nombreP) {
        this.idP = idP;
        this.nombreP = nombreP;
    }
    
}
