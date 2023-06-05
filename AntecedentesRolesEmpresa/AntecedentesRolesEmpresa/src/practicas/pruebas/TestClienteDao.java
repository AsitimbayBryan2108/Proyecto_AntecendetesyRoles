package practicas.pruebas;

import practicas.dominio.Cliente;
import practicas.repositorios.ClienteListDao;
import practicas.repositorios.IClienteDAO;

public class TestClienteDao 
{
    public static void main(String[] args) 
    {
        IClienteDAO daoCliente= new ClienteListDao();
        
        
        //! crear varios objetos
        Cliente a1 = new Cliente(909, "0983678957", "Francisco Solorzano Diaz", "La alborada quinta Etapa", "elmatador@gmail.com", "0916874951");
        Cliente a2 = new Cliente(924, "0983678957", "Amy Juliett Gavilanez Sosa", "El recreo Quinta Etapa", "amyjuli778@gmail.com", "0916874951");
        Cliente a3 = new Cliente(501, "094786639", "Joao Josue Lopez Zambrano", "Entrada de la Ocho ", "holk@gmail.com", "0916874951");
        Cliente a4 = new Cliente(17, "098567898", "Milena Arreaga Gomez", "Coop. Gallegos Lara", "sinnombreoficial69@gmail.com", "0916874951");

        daoCliente.insertar(a1);
        daoCliente.insertar(a2);
        daoCliente.insertar(a3);
        daoCliente.insertar(a4);

        //! consulta de cliente
        for(Cliente cliente : daoCliente.consultarTodos())
        System.out.println(cliente);
  
        int codigo = 909;
        Cliente cli = daoCliente.buscar(codigo);
        if(cli != null)
        {
        System.out.printf("<<<<< Cliente con codigo: %d si existe >>>>> \n", cli.getCodigo());
        System.out.print(cli);
        }
        else
        {
          System.out.printf("<<<<< Cliente con codigo: %d no existe >>>>> \n", codigo);
        }
      
      } 
      
    }


