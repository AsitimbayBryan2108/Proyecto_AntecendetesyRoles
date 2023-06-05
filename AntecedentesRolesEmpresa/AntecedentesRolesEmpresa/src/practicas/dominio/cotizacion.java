package practicas.dominio;

public class cotizacion {
    
    int    orden;
    int    idcliente;
    int    cantidad ;
    String descripcion;
    Double precio;
    
    public void setOrden(int orden) {
        this.orden = orden;
    }
    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    Double  total ;



    public int getOrden() {
        return orden;
    }
    public int getIdcliente() {
        return idcliente;
    }
    public int getCantidad() {
        return cantidad;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Double getPrecio() {
        return precio;
    }
    public Double getTotal() {
        return total;
    }
   
}
