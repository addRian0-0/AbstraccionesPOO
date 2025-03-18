/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author eliza
 */
public class Venta {
    
    private float ganancia;
    private String fechaVenta;
    private String nomCompletClient;
    private int edad;
    private int telefonoCompra;
    private String emailCompra;
    private String direcClienteCompra;
    private String Sex;
    private String estatusTerreno;

    public Venta(float ganancia, String fechaVenta, String nomCompletClient, int edad, int telefonoCompra, String emailCompra, String direcClienteCompra, String Sex, String estatusTerreno) {
        this.ganancia = ganancia;
        this.fechaVenta = fechaVenta;
        this.nomCompletClient = nomCompletClient;
        this.edad = edad;
        this.telefonoCompra = telefonoCompra;
        this.emailCompra = emailCompra;
        this.direcClienteCompra = direcClienteCompra;
        this.Sex = Sex;
        this.estatusTerreno = estatusTerreno;
    }

    public float getGanancia() {
        return ganancia;
    }

    public void setGanancia(float ganancia) {
        this.ganancia = ganancia;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getNomCompletClient() {
        return nomCompletClient;
    }

    public void setNomCompletClient(String nomCompletClient) {
        this.nomCompletClient = nomCompletClient;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefonoCompra() {
        return telefonoCompra;
    }

    public void setTelefonoCompra(int telefonoCompra) {
        this.telefonoCompra = telefonoCompra;
    }

    public String getEmailCompra() {
        return emailCompra;
    }

    public void setEmailCompra(String emailCompra) {
        this.emailCompra = emailCompra;
    }

    public String getDirecClienteCompra() {
        return direcClienteCompra;
    }

    public void setDirecClienteCompra(String direcClienteCompra) {
        this.direcClienteCompra = direcClienteCompra;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    public String getEstatusTerreno() {
        return estatusTerreno;
    }

    public void setEstatusTerreno(String estatusTerreno) {
        this.estatusTerreno = estatusTerreno;
    }

   
    
    
}
