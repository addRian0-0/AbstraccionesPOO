package com.mycompany.centrocultural;

public class Alumno {

    private String nombres, apellidoMa, apellidoPa;
    private int edad;

    public Alumno(String nombres, String apellidoMa, String apellidoPa, int edad) {
        this.nombres = nombres;
        this.apellidoMa = apellidoMa;
        this.apellidoPa = apellidoPa;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMa() {
        return apellidoMa;
    }

    public void setApellidoMa(String apellidoMa) {
        this.apellidoMa = apellidoMa;
    }

    public String getApellidoPa() {
        return apellidoPa;
    }

    public void setApellidoPa(String apellidoPa) {
        this.apellidoPa = apellidoPa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
