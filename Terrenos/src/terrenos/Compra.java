/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terrenos;

/**
 *
 * @author eliza
 */
public class Compra {
    
    private float costo;
    private boolean escritura;
    private boolean pagoPendiente;

    public Compra(float costo, boolean escritura, boolean pagoPendiente) {
        this.costo = costo;
        this.escritura = escritura;
        this.pagoPendiente = pagoPendiente;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public boolean isEscritura() {
        return escritura;
    }

    public void setEscritura(boolean escritura) {
        this.escritura = escritura;
    }

    public boolean isPagoPendiente() {
        return pagoPendiente;
    }

    public void setPagoPendiente(boolean pagoPendiente) {
        this.pagoPendiente = pagoPendiente;
    }
}
