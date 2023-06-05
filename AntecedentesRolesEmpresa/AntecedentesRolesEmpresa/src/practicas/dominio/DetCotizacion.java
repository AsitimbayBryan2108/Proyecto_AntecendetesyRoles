package practicas.dominio;

public class DetCotizacion {
    
   private int     cantidad;
   private String  descripcion;
   private Double  precio;
   private Double  total;

   

   
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
    @Override
    public String toString() {
        return cantidad + "    " + descripcion + "    " + precio + "    ";
    }

    


   
}
