package practicas.repositorios;

import java.util.List;

import practicas.dominio.Tecnico;

public interface ITecnicoDAO 
{
   public void insertar(Tecnico tecnico);
   public void actualizar (Tecnico tecnico);
   public Tecnico buscar(int codigo);
   public String buscardisp();
   public void eliminar (Tecnico codigo);

    public List <Tecnico>consultarTodos();


}