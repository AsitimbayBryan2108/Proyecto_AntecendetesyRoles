package practicas.repositorios;


import java.util.ArrayList;
import java.util.List;

import practicas.dominio.Tecnico;

public class TecnicoListDao implements ITecnicoDAO
{
    List <Tecnico> tecnicosLista= new ArrayList<>();

    public TecnicoListDao()
    {
        tecnicosLista.add(new Tecnico(505, "Dennis Ariel Chacha Cando", "Chachaprox@gmail.com", "A", "0958572257", "Ocupado"));
        tecnicosLista.add(new Tecnico(895, "Edurdo Alberto Quintero Guzman", "quinsoci115@gmail.com", "A", "098791781", "Desocupado"));
        tecnicosLista.add(new Tecnico(201, "Alexander Roger Alvarado Alvarado", "Muerto1201@gmail.com", "CD", "095889287", "Ocupado"));
        tecnicosLista.add(new Tecnico(2089, "Gabriel Andres Campoverde Gutierrez", "Gabo673@gmail.com", "CD", "09100654783", "Desocupado"));
        tecnicosLista.add(new Tecnico(10089, "Jeremy Joel Poveda Figueroa", "kklkjlk@gmail.com", "B", "0975896571", "Ocupado"));
        tecnicosLista.add(new Tecnico(2021, "Alexandro Magno Moncayo Herrera", "Moncatup@gmail.com", "E", "0967484880", "Desocupado"));

    }

    @Override
    public void insertar(Tecnico tecnico) {
        // TODO Auto-generated method stub
        tecnicosLista.add(tecnico);
        
    }

    @Override
    public void actualizar(Tecnico tecnico) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Tecnico buscar(int codigo) {
        {
            for ( Tecnico tecnico: tecnicosLista) 
            {
                if (tecnico.getCodigo()==codigo)
                    return tecnico;
            }
            
        } return null;
    }


    @Override
    public String buscardisp() {
        {
            for ( Tecnico tecnico: tecnicosLista) 
            {
                if (tecnico.getEstado()=="Desocupado")
                    return tecnico.getNombres();
            }
            
        } return null;
    }

    @Override
    public void eliminar(Tecnico codigo) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Tecnico> consultarTodos() {
        // TODO Auto-generated method stub
        return tecnicosLista;
    }
    
    
}
