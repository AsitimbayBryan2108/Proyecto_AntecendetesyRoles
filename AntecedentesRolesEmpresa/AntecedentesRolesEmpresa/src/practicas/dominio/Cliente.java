package practicas.dominio;

public class Cliente {
    
    private int codigo;
    private String cedula;
    private String nombres;
    private String direccion;
    private String email;
    private String telefono;
    
    public Cliente() 
    {
    }
    
    
    public Cliente(int codigo, String cedula, String nombres,String direccion,String email,String telefono) 
    {
        this.codigo    = codigo;
        this.cedula    = cedula;
        this.nombres   = nombres;
        this.direccion = direccion;
        this.email     = email;
        this.telefono  = telefono;
    }

    //! Metodos de accesos
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
        result = prime * result + codigo;
        result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());

        return result;
    }

    public int getCodigo() {
        return codigo;
    }



    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }



    public String getCedula() {
        return cedula;
    }



    public void setCedula(String cedula) {
        this.cedula = cedula;
    }



    public String getNombres() {
        return nombres;
    }



    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getTelefono() {
        return telefono;
    }



    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    public String getDireccion() {
        return direccion;
    }



    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;

        if (cedula == null) {
            if (other.cedula != null)
                return false;
        } else if (!cedula.equals(other.cedula))
            return false;
        if (codigo != other.codigo)
            return false;
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

        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;



        return true;
    }



    @Override
    public String toString() {
        return codigo + "     " + nombres + "     " + cedula + "     " + telefono + "     " + direccion + "     " + email + "     ";
    }
    


    //codigo,nombres,cedula,telefono,direccion.email
    
}
