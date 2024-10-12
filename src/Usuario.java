public class Usuario {
    private String nombre;
    private String apellido;
    private String password;
    private String correo;
    private int ID;
    private String telefono;
    private String direccion;
    private String ciudad;
    private String estado;
    private String pais;
    private String codigoPostal;

    public Usuario(String nombre, String apellido, String correo, int ID, String telefono, String direccion, String ciudad, String estado, String pais, String codigoPostal, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ID = ID;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+", Apellido: "+apellido+", Correo: "+correo+", ID: "+ID+", Telefono: "+telefono+", Direccion: "+direccion+", Ciudad: "+ciudad+", Estado: "+estado+", Pais: "+pais+", Codigo Postal: "+codigoPostal;
    }

}
