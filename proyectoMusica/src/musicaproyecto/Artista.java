/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicaproyecto;

/**
 *
 * @author soniasanchezhidalgo
 */
import java.util.ArrayList;

public class Artista {
   private String nombre;
   private String genero;
    ArrayList<String> discografia; 
    ArrayList<String> peliculas; 

    public Artista(String nombre, String genero, ArrayList<String> discografia, ArrayList<String> peliculas) {
        this.nombre = nombre;
        this.genero = genero;
        this.discografia = discografia;
        this.peliculas = peliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<String> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(ArrayList<String> discografia) {
        this.discografia = discografia;
    }

    public ArrayList<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<String> peliculas) {
        this.peliculas = peliculas;
    }

 
}

