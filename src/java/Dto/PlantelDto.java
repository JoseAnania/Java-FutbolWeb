
package Dto;

public class PlantelDto {
    
    private int numero;
    private String nombre;
    private String nombreD;
    private int edad;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public PlantelDto() {
    }

    public PlantelDto(int numero, String nombre, String nombreD, int edad) {
        this.numero = numero;
        this.nombre = nombre;
        this.nombreD = nombreD;
        this.edad = edad;
    }
    
}
