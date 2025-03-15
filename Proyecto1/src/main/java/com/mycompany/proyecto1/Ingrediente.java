package com.mycompany.proyecto1;

/**
 *
 * @author selec
 * 
 * Clase ingrediente o producto
 */
public class Ingrediente {

    public enum Temporada {
        PRIMAVERA, VERANO, OTONO, INVIERNO
    }

    private String marca, nombre, consejoSeleccion;
    private int cantidadDis, cantidadNes; // cantidad disponible es la que se posee y cantidadNes es la que la receta requiere para su elaboracion
    private Temporada temporadaingrediente;
    private UnidadMedidaEquivalencia unidad;

    public Ingrediente(String marca, String nombre, String consejoSeleccion, int cantidadDis, int cantidadNes, Temporada temporadaingrediente, UnidadMedidaEquivalencia unidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.consejoSeleccion = consejoSeleccion;
        this.cantidadDis = cantidadDis;
        this.cantidadNes = cantidadNes;
        this.temporadaingrediente = temporadaingrediente;
        this.unidad = unidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConsejoSeleccion() {
        return consejoSeleccion;
    }

    public void setConsejoSeleccion(String consejoSeleccion) {
        this.consejoSeleccion = consejoSeleccion;
    }

    public int getCantidadDis() {
        return cantidadDis;
    }

    public void setCantidadDis(int cantidadDis) {
        this.cantidadDis = cantidadDis;
    }

    public int getCantidadNes() {
        return cantidadNes;
    }

    public void setCantidadNes(int cantidadNes) {
        this.cantidadNes = cantidadNes;
    }

    public Temporada getTemporadaingrediente() {
        return temporadaingrediente;
    }

    public void setTemporadaingrediente(Temporada temporadaingrediente) {
        this.temporadaingrediente = temporadaingrediente;
    }

    public UnidadMedidaEquivalencia getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadMedidaEquivalencia unidad) {
        this.unidad = unidad;
    }
    
}
