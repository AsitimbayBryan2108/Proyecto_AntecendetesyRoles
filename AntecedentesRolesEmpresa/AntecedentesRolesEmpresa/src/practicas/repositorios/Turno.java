package practicas.repositorios;

import practicas.dominio.Turnos;

public class Turno implements ITurno{
    
    public static int turnos;

    @Override
    public int incrementa() {
        // TODO Auto-generated method stub
        turnos = turnos++;
        return turnos;
    }
   
}
