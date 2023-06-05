package practicas.repositorios;

import java.util.List;

import practicas.dominio.DetCotizacion;
import practicas.dominio.cotizacion;

public interface ICotizacion 
    {
       public void insertar(cotizacion cotizacion);
       public void insertardet(DetCotizacion cotizacion);
       public void limpiar ();
   
       //public void actualizar (cotizacion cotizacion);
       //public Cliente buscar(int codigo);
       //public String buscarNombre(int codigo);
       //public void eliminar (Cliente codigo);
       public List <cotizacion>consultarTodos();
       public List <DetCotizacion>consultarDet();
    
    }

