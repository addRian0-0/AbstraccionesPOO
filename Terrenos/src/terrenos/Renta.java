/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author eliza
 */
public class Renta {
    private String nomCompletRenta;
    private String sexo;
    private int Edadrenta;
    private int telrenta;
    private float anticipo;
    private float montoRenta;
    private String contrato;
    private String plazosContra;
    private String cartaRespTercer;
    private String nomComplTercer;
    private String relacionArrendatario;
    private int telTercer;
    private int edadTercer;
    private String sexoTercer;

    public Renta(String nomCompletRenta, String sexo, int Edadrenta, int telrenta, float anticipo, float montoRenta, String contrato, String plazosContra, String cartaRespTercer, String nomComplTercer, String relacionArrendatario, int telTercer, int edadTercer, String sexoTercer) {
        this.nomCompletRenta = nomCompletRenta;
        this.sexo = sexo;
        this.Edadrenta = Edadrenta;
        this.telrenta = telrenta;
        this.anticipo = anticipo;
        this.montoRenta = montoRenta;
        this.contrato = contrato;
        this.plazosContra = plazosContra;
        this.cartaRespTercer = cartaRespTercer;
        this.nomComplTercer = nomComplTercer;
        this.relacionArrendatario = relacionArrendatario;
        this.telTercer = telTercer;
        this.edadTercer = edadTercer;
        this.sexoTercer = sexoTercer;
    }

    public String getNomCompletRenta() {
        return nomCompletRenta;
    }

    public void setNomCompletRenta(String nomCompletRenta) {
        this.nomCompletRenta = nomCompletRenta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdadrenta() {
        return Edadrenta;
    }

    public void setEdadrenta(int Edadrenta) {
        this.Edadrenta = Edadrenta;
    }

    public int getTelrenta() {
        return telrenta;
    }

    public void setTelrenta(int telrenta) {
        this.telrenta = telrenta;
    }

    public float getAnticipo() {
        return anticipo;
    }

    public void setAnticipo(float anticipo) {
        this.anticipo = anticipo;
    }

    public float getMontoRenta() {
        return montoRenta;
    }

    public void setMontoRenta(float montoRenta) {
        this.montoRenta = montoRenta;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getPlazosContra() {
        return plazosContra;
    }

    public void setPlazosContra(String plazosContra) {
        this.plazosContra = plazosContra;
    }

    public String getCartaRespTercer() {
        return cartaRespTercer;
    }

    public void setCartaRespTercer(String cartaRespTercer) {
        this.cartaRespTercer = cartaRespTercer;
    }

    public String getNomComplTercer() {
        return nomComplTercer;
    }

    public void setNomComplTercer(String nomComplTercer) {
        this.nomComplTercer = nomComplTercer;
    }

    public String getRelacionArrendatario() {
        return relacionArrendatario;
    }

    public void setRelacionArrendatario(String relacionArrendatario) {
        this.relacionArrendatario = relacionArrendatario;
    }

    public int getTelTercer() {
        return telTercer;
    }

    public void setTelTercer(int telTercer) {
        this.telTercer = telTercer;
    }

    public int getEdadTercer() {
        return edadTercer;
    }

    public void setEdadTercer(int edadTercer) {
        this.edadTercer = edadTercer;
    }

    public String getSexoTercer() {
        return sexoTercer;
    }

    public void setSexoTercer(String sexoTercer) {
        this.sexoTercer = sexoTercer;
    }
    
    
    
}
