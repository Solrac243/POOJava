package cl.seccion121.repasopoo;

import java.io.Serializable;
import java.util.ArrayList;

public class Factura implements Serializable {
    private int folio;
    private String fecha;
    private Cliente cliente;
    //1..1 -> 1..*
    private ArrayList<Producto> detalleProductos = new ArrayList<>();

    public Factura(int folio, String fecha, Cliente cliente) {
        folio = folio;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public void agregarProducto(Producto prod){
        detalleProductos.add(prod);
    }

    public boolean eliminarProducto(int codigo){
        for(int i = 0; i < detalleProductos.size(); i = i + 1){
            if(detalleProductos.get(i).getCodigo() == codigo){
                detalleProductos.remove(i);
                return true;
            }
        }

        return false;
    }

    public String mostrarDetalle(){
        String detalle = "";

        for(Producto p : detalleProductos){
            detalle = detalle + "\n" + p.getCodigo() + " -> "
                    + p.getDescripcion() + " $ " + p.getPrecio();
        }

        return detalle;
    }


    public boolean eliminarProducto(String descripcion){
        for(int i = 0; i < detalleProductos.size(); i = i + 1){
            if(detalleProductos.get(i).getDescripcion().equals(descripcion)){
                detalleProductos.remove(i);
                return true;
            }
        }

        return false;
    }








    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String nuevafecha) {
        fecha = nuevafecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
