
package com.mycompany.centrocultural;

public class Inscrpcion {
    
    private float pagoMensualidad;
    private String idActividad;
    private boolean primeraInscripcion;
    private float pagoPrimeraInscripcion;
    private Alumno alumnoReferencia;

    public Inscrpcion(float pagoMensualidad, String idActividad, boolean primeraInscripcion, float pagoPrimeraInscripcion, Alumno alumnoReferencia) {
        this.pagoMensualidad = pagoMensualidad;
        this.idActividad = idActividad;
        this.primeraInscripcion = primeraInscripcion;
        this.pagoPrimeraInscripcion = pagoPrimeraInscripcion;
        this.alumnoReferencia = alumnoReferencia;
    }

    public float getPagoMensualidad() {
        return pagoMensualidad;
    }

    public void setPagoMensualidad(float pagoMensualidad) {
        this.pagoMensualidad = pagoMensualidad;
    }

    public String getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(String idActividad) {
        this.idActividad = idActividad;
    }

    public boolean isPrimeraInscripcion() {
        return primeraInscripcion;
    }

    public void setPrimeraInscripcion(boolean primeraInscripcion) {
        this.primeraInscripcion = primeraInscripcion;
    }

    public float getPagoPrimeraInscripcion() {
        return pagoPrimeraInscripcion;
    }

    public void setPagoPrimeraInscripcion(float pagoPrimeraInscripcion) {
        this.pagoPrimeraInscripcion = pagoPrimeraInscripcion;
    }

    public Alumno getAlumnoReferencia() {
        return alumnoReferencia;
    }

    public void setAlumnoReferencia(Alumno alumnoReferencia) {
        this.alumnoReferencia = alumnoReferencia;
    }
    
}
