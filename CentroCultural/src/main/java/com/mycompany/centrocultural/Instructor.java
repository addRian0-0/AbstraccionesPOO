package com.mycompany.centrocultural;

import java.util.ArrayList;

public class Instructor {
    
    private String nombresInstructor, apellidosInstructor;
    private ArrayList<Alumno> alumnosDelProfesor = new ArrayList<>();

    public Instructor(String nombresInstructor, String apellidosInstructor) {
        this.nombresInstructor = nombresInstructor;
        this.apellidosInstructor = apellidosInstructor;
    }

    public String getNombresInstructor() {
        return nombresInstructor;
    }

    public void setNombresInstructor(String nombresInstructor) {
        this.nombresInstructor = nombresInstructor;
    }

    public String getApellidosInstructor() {
        return apellidosInstructor;
    }

    public void setApellidosInstructor(String apellidosInstructor) {
        this.apellidosInstructor = apellidosInstructor;
    }

    public ArrayList<Alumno> getAlumnosDelProfesor() {
        return alumnosDelProfesor;
    }

    public void setAlumnosDelProfesor(ArrayList<Alumno> alumnosDelProfesor) {
        this.alumnosDelProfesor = alumnosDelProfesor;
    }
    
}
