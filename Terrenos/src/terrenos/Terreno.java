/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author eliza
 */
public class Terreno {
    
    private String direccionComplet;
    private float metrosCuadrados;
    private float metrosFrente;
    private String servicios;
    private boolean bardeado;
    private String statusPapeles;

    public Terreno(String direccionComplet, float metrosCuadrados, float metrosFrente, String servicios, boolean bardeado, String statusPapeles) {
        this.direccionComplet = direccionComplet;
        this.metrosCuadrados = metrosCuadrados;
        this.metrosFrente = metrosFrente;
        this.servicios = servicios;
        this.bardeado = bardeado;
        this.statusPapeles = statusPapeles;
    }

    public String getDireccionComplet() {
        return direccionComplet;
    }

    public void setDireccionComplet(String direccionComplet) {
        this.direccionComplet = direccionComplet;
    }

    public float getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(float metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public float getMetrosFrente() {
        return metrosFrente;
    }

    public void setMetrosFrente(float metrosFrente) {
        this.metrosFrente = metrosFrente;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public boolean isBardeado() {
        return bardeado;
    }

    public void setBardeado(boolean bardeado) {
        this.bardeado = bardeado;
    }

    public String getStatusPapeles() {
        return statusPapeles;
    }

    public void setStatusPapeles(String statusPapeles) {
        this.statusPapeles = statusPapeles;
    }
    





}
