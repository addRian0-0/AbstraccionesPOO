package com.mycompany.centrocultural;

public class Presupuesto {
    
    private float presEquipo, presInstalaciones, presSueldosProfs, presSueldosAdmins, sobrantePresupuesto;
    private String fechaAsignacion;

    public Presupuesto(float presEquipo, float presInstalaciones, float presSueldosProfs, float presSueldosAdmins, float sobrantePresupuesto, String fechaAsignacion) {
        this.presEquipo = presEquipo;
        this.presInstalaciones = presInstalaciones;
        this.presSueldosProfs = presSueldosProfs;
        this.presSueldosAdmins = presSueldosAdmins;
        this.sobrantePresupuesto = sobrantePresupuesto;
        this.fechaAsignacion = fechaAsignacion;
    }

    public float getPresEquipo() {
        return presEquipo;
    }

    public void setPresEquipo(float presEquipo) {
        this.presEquipo = presEquipo;
    }

    public float getPresInstalaciones() {
        return presInstalaciones;
    }

    public void setPresInstalaciones(float presInstalaciones) {
        this.presInstalaciones = presInstalaciones;
    }

    public float getPresSueldosProfs() {
        return presSueldosProfs;
    }

    public void setPresSueldosProfs(float presSueldosProfs) {
        this.presSueldosProfs = presSueldosProfs;
    }

    public float getPresSueldosAdmins() {
        return presSueldosAdmins;
    }

    public void setPresSueldosAdmins(float presSueldosAdmins) {
        this.presSueldosAdmins = presSueldosAdmins;
    }

    public float getSobrantePresupuesto() {
        return sobrantePresupuesto;
    }

    public void setSobrantePresupuesto(float sobrantePresupuesto) {
        this.sobrantePresupuesto = sobrantePresupuesto;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
    
}
