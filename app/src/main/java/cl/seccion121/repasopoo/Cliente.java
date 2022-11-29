package cl.seccion121.repasopoo;

import java.io.Serializable;

public class Cliente implements Serializable {
    private String rut;
    private String direccion;
    private int credito;

    public Cliente(String rut, String direccion, int credito) {
        this.rut = rut;
        this.direccion = direccion;
        this.credito = credito;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}
