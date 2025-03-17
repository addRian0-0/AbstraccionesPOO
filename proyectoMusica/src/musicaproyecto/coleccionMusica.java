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
public class coleccionMusica {
    ArrayList<Album> Albumes;
    ArrayList<Pelicula> Peliculas;

    public coleccionMusica(ArrayList<Album> Albumes, ArrayList<Pelicula> Peliculas) {
        this.Albumes = Albumes;
        this.Peliculas = Peliculas;
    }

    public ArrayList<Album> getAlbumes() {
        return Albumes;
    }

    public void setAlbumes(ArrayList<Album> Albumes) {
        this.Albumes = Albumes;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> Peliculas) {
        this.Peliculas = Peliculas;
    }
    
    
}
