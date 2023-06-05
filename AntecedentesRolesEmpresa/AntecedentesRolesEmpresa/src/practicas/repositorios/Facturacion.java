package practicas.repositorios;


import java.util.Scanner;

public class Facturacion {


    // constructor 
  private String codigoProducto;
   private String descripcionProducto;
  private double cantidadComprada;
  private double precioporLitro;


  public Facturacion (String codigo, String descripcion, double cantidad, 
double precio)
{
      codigoProducto = codigo;
      descripcionProducto = descripcion;
      cantidadComprada = cantidad;
      precioporLitro = precio;
}
  public void setcodigoProducto (String codigo)
  {
      codigoProducto = codigo;
  }
  public String getcodigoProducto()
  {
      return codigoProducto;
  }
  public void setdescripcionProducto (String descripcion)
  {
      descripcionProducto = descripcion;
  }
  public String getdescripcionProducto()
  {
      return descripcionProducto;
  }
  public void setCantidadComprada (double cantidad)
  {
   cantidadComprada = cantidad;
  }
  public double getCantidadComprada()
  {
      return cantidadComprada;
  }
public void setprecioporLitro (double precio){
      precioporLitro = precio;
   }
public double getprecioporLitro()
{
    return precioporLitro;
}
 public double getTotalFactura()
 {
 double calculodelmontoTotal;
 calculodelmontoTotal = cantidadComprada * precioporLitro;
 return calculodelmontoTotal;
 }   
 public static void main (String args [])
{
String codigo, descripcion;
double cantidad, precio;
Facturacion factura = new Facturacion ("","",0,0.0);
Scanner input = new Scanner (System.in);

System.out.println("Porporcione el codigo del producto: ");
        codigo = input.nextLine();
factura.setcodigoProducto(codigo);

System.out.println("Porporcione la descripcion del producto: ");
        descripcion = input.nextLine();
factura.setdescripcionProducto(descripcion);

System.out.println("Ingrese el precio por litro: ");
        precio = input.nextDouble();
factura.setprecioporLitro(precio);

System.out.println("Ingrese la cantidad a comprar del producto: ");
        cantidad = input.nextDouble();
factura.setCantidadComprada(cantidad);

factura.getTotalFactura();
System.out.println();
System.out.println();
System.out.printf("\n Codigo del producto: %s", 
factura.getcodigoProducto());
System.out.printf("\n Descripcion del producto: %s", 
factura.getdescripcionProducto());
System.out.printf("\n Precio por litro: %s", factura.getprecioporLitro());
System.out.printf("\n Cantidad en litros: %s", 
factura.getCantidadComprada());
    System.out.println();
    System.out.println();
    System.out.printf(" El total de la factura es: $%.2f\n", 
 factura.getTotalFactura());
    }
 }