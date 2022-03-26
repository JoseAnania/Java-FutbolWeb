
package Modelo;

public class Division {
    
    private int idD;
    private String nombreD;

    public int getIdD() {
        return idD;
    }

    public void setIdD(int idD) {
        this.idD = idD;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public Division() {
    }

    public Division(int idD, String nombreD) {
        this.idD = idD;
        this.nombreD = nombreD;
    }
    
}
