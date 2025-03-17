/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicaproyecto;

/**
 *
 * @author soniasanchezhidalgo
 */
public class Pelicula {
    private String titulo;
    private String bandaSonora;
    private boolean descargada;

    public Pelicula(String titulo, String bandaSonora, boolean descargada) {
        this.titulo = titulo;
        this.bandaSonora = bandaSonora;
        this.descargada = descargada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBandaSonora() {
        return bandaSonora;
    }

    public void setBandaSonora(String bandaSonora) {
        this.bandaSonora = bandaSonora;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }
    
    
}
