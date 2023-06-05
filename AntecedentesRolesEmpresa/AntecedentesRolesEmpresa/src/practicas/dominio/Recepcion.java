package practicas.dominio;

public class Recepcion {
    
    int    Turno;
    int    CodCli;
    String TipoEquipo;
    String Modelo;
    String Serie;
    String Descripcion;
    String Problema;
    String FechaRecibe;
    String FechaEntrega;
    
    public void setTurno(int turno) {
        Turno = turno;
    }
    public void setCodCli(int codCli) {
        CodCli = codCli;
    }
    public void setTipoEquipo(String tipoEquipo) {
        TipoEquipo = tipoEquipo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public void setSerie(String serie) {
        Serie = serie;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public void setProblema(String problema) {
        Problema = problema;
    }
    public void setFechaRecibe(String fechaRecibe) {
        FechaRecibe = fechaRecibe;
    }
    public void setFechaEntrega(String fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }
    public int getTurno() {
        return Turno;
    }
    public int getCodCli() {
        return CodCli;
    }
    public String getTipoEquipo() {
        return TipoEquipo;
    }
    public String getModelo() {
        return Modelo;
    }
    public String getSerie() {
        return Serie;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public String getProblema() {
        return Problema;
    }
    public String getFechaRecibe() {
        return FechaRecibe;
    }
    public String getFechaEntrega() {
        return FechaEntrega;
    } 
}
