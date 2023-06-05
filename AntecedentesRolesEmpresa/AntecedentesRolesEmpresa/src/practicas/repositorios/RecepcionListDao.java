package practicas.repositorios;

import java.util.ArrayList;
import java.util.List;

import practicas.dominio.Recepcion;

public class RecepcionListDao implements IRecepcionDao
 {
    List <Recepcion> recepcionLista= new ArrayList<>();

    public RecepcionListDao()
    {
        //clientesLista.add(new Cliente(10, "0958572257", "Danny Mauricio Rivadeneira Suarez", "Urb. La Rioja ", "dansuaric", "0958572255"));
        //clientesLista.add(new Cliente(20, "0916874951", "Galo Mauricio Rivadeneira Suarez", "Urb. La Rioja ", "galrivadeneira", "099999999999"));
    
    }   

    @Override
    public void insertar(Recepcion recepcion) {
        // TODO Auto-generated method stub
        recepcionLista.add(recepcion);
    }

    @Override
    public void actualizar(Recepcion recepcion) {
        // TODO Auto-generated method stub
       
    }
   
    /* 
    @Override
    public Cliente buscar(int codigo) {
    {
        for (Cliente cliente: clientesLista) 
        {
            if (cliente.getCodigo()==codigo)
                return cliente;
        }
        
    } return null;
    }
    

    @Override
    public String buscarNombre(int codigo) {
    {
        for (Cliente cliente: clientesLista) 
        {
            if (cliente.getCodigo()==codigo)
                return cliente.getNombres();
        }
        
    } return null;
    }*/

    /* 
    @Override
    public void eliminar(Recepcion codigo) {
        // TODO Auto-generated method stub
        
    }*/

    @Override
    public List<Recepcion> consultarTodos()
     {
        
        return recepcionLista;
    }
    
}
