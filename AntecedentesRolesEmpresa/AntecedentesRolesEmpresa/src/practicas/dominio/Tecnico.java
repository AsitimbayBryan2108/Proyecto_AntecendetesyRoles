package practicas.dominio;

public class Tecnico extends Tecnicos{
    
    private int codigo;
    private String nombres;
    private String email;
    private String departamento;
    private String telefono;
    private String estado;

    public Tecnico() 
    {
    }
    
    
    public Tecnico(int codigo,String nombres,String email,String departamento,String telefono,String estado) 
    {
        this.codigo       = codigo;
        this.nombres      = nombres;
        this.email        = email;
        this.departamento = departamento;
        this.telefono     = telefono;
        this.estado       = estado;
    }
    
    public int getCodigo() {
        return codigo;
    }
    public String getNombres() {
        return nombres;
    }
    public String getEmail() {
        return email;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getEstado() {
        return estado;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tecnico other = (Tecnico) obj;

        if (nombres == null) {
            if (other.nombres != null)
                return false;
        } else if (!nombres.equals(other.nombres))
            return false;
        
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
 
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;

        if (estado == null) {
                if (other.estado != null)
                    return false;
            } else if (!estado.equals(other.email))
                return false;

        return true;
    }

    @Override
    public String toString() {
        return codigo + "     " + nombres + "     " + email + "     " + departamento + "     " + telefono + "     " + estado + "     ";
    }



}
