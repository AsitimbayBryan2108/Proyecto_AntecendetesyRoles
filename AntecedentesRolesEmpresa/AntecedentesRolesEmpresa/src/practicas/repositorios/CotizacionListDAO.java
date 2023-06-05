package practicas.repositorios;

import java.util.ArrayList;
import java.util.List;

import practicas.dominio.DetCotizacion;
import practicas.dominio.cotizacion;

public class CotizacionListDAO implements ICotizacion{
    
    List <cotizacion>    cotizacionLista    = new ArrayList<>();
    List <DetCotizacion> detcotizacionLista = new ArrayList<>();

    public CotizacionListDAO()
    {
        //clientesLista.add(new Cliente(10, "0958572257", "Danny Mauricio Rivadeneira Suarez", "Urb. La Rioja ", "dansuaric", "0958572255"));
        //clientesLista.add(new Cliente(20, "0916874951", "Galo Mauricio Rivadeneira Suarez", "Urb. La Rioja ", "galrivadeneira", "099999999999"));
        
    
    }   

    @Override
    public void insertar(cotizacion cotizacion) {
        // TODO Auto-generated method stub
        cotizacionLista.add(cotizacion);
    }
    
    @Override
    public void insertardet(DetCotizacion detcotizacion){
        detcotizacionLista.add(detcotizacion);
    }

    @Override
    public List<cotizacion> consultarTodos() {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<DetCotizacion> consultarDet() {
        // TODO Auto-generated method stub
        return detcotizacionLista;
    }
    
    @Override
    public void limpiar ()
   {
      detcotizacionLista.clear();
   }

}
