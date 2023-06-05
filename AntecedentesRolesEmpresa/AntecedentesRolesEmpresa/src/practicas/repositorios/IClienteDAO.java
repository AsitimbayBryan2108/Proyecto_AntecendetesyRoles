package practicas.repositorios;

import java.util.List;

import practicas.dominio.Cliente;

public interface IClienteDAO 
{
   public void insertar(Cliente cliente);
   public void actualizar (Cliente cliente);
   public Cliente buscar(int codigo);
   public String buscarNombre(int codigo);
   public void eliminar (Cliente codigo);
   public List <Cliente>consultarTodos();


}
