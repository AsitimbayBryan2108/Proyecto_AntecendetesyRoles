package practicas.repositorios;
    import java.util.List;

    import practicas.dominio.Recepcion;
    
    public interface IRecepcionDao 
    {
       public void insertar(Recepcion recepcion);
       public void actualizar (Recepcion recepcion);
       public List <Recepcion>consultarTodos();
       
        
    
    }


