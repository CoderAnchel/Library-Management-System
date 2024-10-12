import java.util.ArrayList;

public class registroLibros {

    private ArrayList<Libro> libros;

    public registroLibros() {
        this.libros = new ArrayList<>();
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro searchLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public ArrayList<Libro> getLibrosList() {
        return libros;
    }

    public void showLibros() {
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
}
