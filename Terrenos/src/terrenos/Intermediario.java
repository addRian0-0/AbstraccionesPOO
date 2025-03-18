/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author eliza
 */
public class Intermediario {
    
    private String nomComInter;
    private int edadInter;
    private String direcInter;
    private String sexoInter;
    private int numTelInter;
    private String email;
    private float costPromo;
    private String tipoRent;
    private float ganancia;
    private String fecha;

    public Intermediario(String nomComInter, int edadInter, String direcInter, String sexoInter, int numTelInter, String email, float costPromo, String tipoRent, float ganancia, String fecha) {
        this.nomComInter = nomComInter;
        this.edadInter = edadInter;
        this.direcInter = direcInter;
        this.sexoInter = sexoInter;
        this.numTelInter = numTelInter;
        this.email = email;
        this.costPromo = costPromo;
        this.tipoRent = tipoRent;
        this.ganancia = ganancia;
        this.fecha = fecha;
    }

    public String getNomComInter() {
        return nomComInter;
    }

    public void setNomComInter(String nomComInter) {
        this.nomComInter = nomComInter;
    }

    public int getEdadInter() {
        return edadInter;
    }

    public void setEdadInter(int edadInter) {
        this.edadInter = edadInter;
    }

    public String getDirecInter() {
        return direcInter;
    }

    public void setDirecInter(String direcInter) {
        this.direcInter = direcInter;
    }

    public String getSexoInter() {
        return sexoInter;
    }

    public void setSexoInter(String sexoInter) {
        this.sexoInter = sexoInter;
    }

    public int getNumTelInter() {
        return numTelInter;
    }

    public void setNumTelInter(int numTelInter) {
        this.numTelInter = numTelInter;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCostPromo() {
        return costPromo;
    }

    public void setCostPromo(float costPromo) {
        this.costPromo = costPromo;
    }

    public String getTipoRent() {
        return tipoRent;
    }

    public void setTipoRent(String tipoRent) {
        this.tipoRent = tipoRent;
    }

    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    
    
    
    
    
}
