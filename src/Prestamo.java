import java.time.LocalDate;
import java.util.Date;

public class Prestamo {
    private Date fecha;
    private LocalDate fechaDevolucion;
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Date fecha, LocalDate fechaDevolucion, String titulo, int ISBN, String autor, boolean disponible, String nombre, String apellido, String correo, int ID, String telefono, String direccion, String ciudad, String estado, String pais, String codigoPostal, String password) {
        this.fecha = new Date();
        this.fechaDevolucion = fechaDevolucion;
        this.libro = new Libro(titulo, ISBN, autor, disponible);
        this.usuario = new Usuario(nombre, apellido, correo, ID, telefono, direccion, ciudad, estado, pais, codigoPostal, password);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Fecha Prestamo: "+fecha+", Fecha Entrega: "+fechaDevolucion+", Nombre Usuario: "+usuario.getNombre()+", Nombre Libro: "+libro.getTitulo()+", ISBN: "+libro.getISBN();
    }
}
