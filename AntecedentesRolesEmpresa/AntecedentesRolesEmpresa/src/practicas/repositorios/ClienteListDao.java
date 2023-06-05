package practicas.repositorios;

import java.util.ArrayList;
import java.util.List;

import practicas.dominio.Cliente;

public class ClienteListDao implements IClienteDAO
 {
    List <Cliente> clientesLista= new ArrayList<>();

    public ClienteListDao()
    {
        clientesLista.add(new Cliente(10, "0958572257", "Danny Mauricio Rivadeneira Suarez", "Urb. La Rioja Et. Almeria", "dansuaric2003lol@gmail.com", "0967067872"));
        clientesLista.add(new Cliente(20, "0916874951", "Bryan Anthony Asitimbay Sagñay", "Entrada de la 8", "asitimbay203bry@gmail.com", "0968252615"));
        clientesLista.add(new Cliente(30, "0984739392", "Julio Guzman Bajaña", "Alborada Quinta etapa", "julioguz36@gmail.com", "0997428190"));
        clientesLista.add(new Cliente(67, "0998734647", "Allison Dayanna Huilca Lucio", "Samanes Sexta Etapa", "huilca893f@gmail.com", "0967666731"));
        clientesLista.add(new Cliente(92, "0913161531", "Jackson Junior Quiñonez Arteaga", "Los Vergeles Mz 134", "maricon450@gmail.com", "0961089295"));
    
    }   

    @Override
    public void insertar(Cliente cliente) {
        // TODO Auto-generated method stub
        clientesLista.add(cliente);
    }

    @Override
    public void actualizar(Cliente cliente) {
        // TODO Auto-generated method stub
       
    }
   
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
    }

    @Override
    public void eliminar(Cliente codigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Cliente> consultarTodos()
     {
        
        return clientesLista;
    }
    
}
