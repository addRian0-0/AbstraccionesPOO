/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicaproyecto;

import java.util.ArrayList;

/**
 *
 * @author soniasanchezhidalgo
 */
public class Album {
    private String nombre;
    private int anio;
    private String genero;
    private String carpeta;
    private boolean tienePortada;
    private boolean estado; 
    ArrayList<String> canciones;

    public Album(String nombre, int anio, String genero, String carpeta, boolean tienePortada, boolean estado, ArrayList<String> canciones) {
        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;
        this.carpeta = carpeta;
        this.tienePortada = tienePortada;
        this.estado = estado;
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(String carpeta) {
        this.carpeta = carpeta;
    }

    public boolean isTienePortada() {
        return tienePortada;
    }

    public void setTienePortada(boolean tienePortada) {
        this.tienePortada = tienePortada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<String> canciones) {
        this.canciones = canciones;
    }
    
    
    
}
