/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import java.util.ArrayList;

/**
 *
 * @author selec
 */
public class Receta {

    public enum TipoPlatillo {

        SOPA("Sopa"),
        ENTREMES("Entremés"),
        APERITIVO("Aperitivo"),
        BEBIDA("Bebida"),
        ENSALADA("Ensalada"),
        PLATO_PRINCIPAL("Plato principal"),
        POSTRE("Postre"),
        GUARNICION("Guarnición"),
        TAPA("Tapa"),
        SANDWICH("Sandwich"),
        PASTA("Pasta"),
        PIZZA("Pizza"),
        HAMBURGUESA("Hamburguesa"),
        PAELLA("Paella"),
        GALLETAS("Galletas"),
        COCTEL("Cóctel"),
        ESTOFADO("Estofado"),
        CARPACCIO("Carpaccio"),
        CEVICHE("Ceviche");

        private final String nombretipo;

        TipoPlatillo(String nombretipo) {
            this.nombretipo = nombretipo;
        }

    }

    public enum Dificultad {

        SENCILLO("Sencillo"),
        INTERMEDIO("Intermedio"),
        DIFICIL("Dificil");

        private final String nivel;

        Dificultad(String nivel) {
            this.nivel = nivel;
        }
    }

    private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
    private ArrayList<String> pasos = new ArrayList<>();
    private TipoPlatillo tipoplatilloV;
    private boolean previamentePreparado;
    private Dificultad dificultadPreparacion;
    private int cantidadComensales, tiempoCoccion;
    private String zonaOrigen;

    public Receta(TipoPlatillo tipoplatilloV, boolean previamentePreparado, Dificultad dificultadPreparacion, int cantidadComensales, int tiempoCoccion, String zonaOrigen) {
        this.tipoplatilloV = tipoplatilloV;
        this.previamentePreparado = previamentePreparado;
        this.dificultadPreparacion = dificultadPreparacion;
        this.cantidadComensales = cantidadComensales;
        this.tiempoCoccion = tiempoCoccion;
        this.zonaOrigen = zonaOrigen;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPasos() {
        return pasos;
    }

    public void setPasos(ArrayList<String> pasos) {
        this.pasos = pasos;
    }

    public TipoPlatillo getTipoplatilloV() {
        return tipoplatilloV;
    }

    public void setTipoplatilloV(TipoPlatillo tipoplatilloV) {
        this.tipoplatilloV = tipoplatilloV;
    }

    public boolean isPreviamentePreparado() {
        return previamentePreparado;
    }

    public void setPreviamentePreparado(boolean previamentePreparado) {
        this.previamentePreparado = previamentePreparado;
    }

    public Dificultad getDificultadPreparacion() {
        return dificultadPreparacion;
    }

    public void setDificultadPreparacion(Dificultad dificultadPreparacion) {
        this.dificultadPreparacion = dificultadPreparacion;
    }

    public int getCantidadComensales() {
        return cantidadComensales;
    }

    public void setCantidadComensales(int cantidadComensales) {
        this.cantidadComensales = cantidadComensales;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getZonaOrigen() {
        return zonaOrigen;
    }

    public void setZonaOrigen(String zonaOrigen) {
        this.zonaOrigen = zonaOrigen;
    }
    
    

}
